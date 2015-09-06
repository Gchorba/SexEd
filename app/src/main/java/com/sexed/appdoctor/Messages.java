package com.sexed.appdoctor;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.sexed.appdoctor.R;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.Executor;

public class Messages extends Activity {

    private Button submit;
    private EditText input;
    private OkHttpClient client;
    private ListView messages;
    private Button back;
    private int userID;
    private JSONObject ob;
    private ArrayList<String> msgs;
    private ArrayList<String> messageIDs;
    private String in;
    private Calendar now;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.messages);
        in = "";

        msgs = new ArrayList<String>();
        messageIDs = new ArrayList<String>();
        //get random user ID

        userID = (int) (Math.random() * 1000) + 1;

        Variable.alive = true;
        client = new OkHttpClient();

        submit = (Button) findViewById(R.id.button9);
        input = (EditText) findViewById(R.id.editText);
        messages = (ListView) findViewById(R.id.listView);
        back = (Button) findViewById(R.id.button8);


        //initializations
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, msgs);
        messages.setAdapter(adapter);



        //async task updating every second
        new AsyncTask<Void, Void, Void>() {

            @Override
            protected Void doInBackground(Void... voids) {
                while (Variable.alive) {
                    //sleep for a second
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        Log.e("error", e.getMessage());
                    }

                    //then check if there's a new message to be added (or plural...)
                    Request request = new Request.Builder()
                            .url("http://45.79.131.252/output.php")
                            .build();

                    client.newCall(request).enqueue(new Callback() {
                        @Override
                        public void onFailure(Request request, IOException e) {
//                            Log.e("error", e.getMessage());
                        }

                        @Override
                        public void onResponse(Response response) throws IOException {
                            if (!response.isSuccessful())
                                throw new IOException("Unexpected code " + response);


                            try {
                                String responsebody = response.body().string();
//                                Log.e("responsebody", responsebody);
                                JSONArray arr = new JSONArray(responsebody);

//                                Log.e("before", "------------");
                                for (int i = 0; i < arr.length(); i++) {
                                    try {
                                        Thread.sleep(50);
                                    } catch (InterruptedException e) {
                                        // TODO Auto-generated catch block
                                        Log.e("error", e.getMessage());
                                    }

                                    ob = new JSONObject(arr.get(i).toString());
//                                    Log.e("message_ids", ob.getString("message_id"));

                                    if (!messageIDs.contains(ob.getString("message_id"))) {
                                        messageIDs.add(ob.getString("message_id"));
                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {
                                                try {
                                                    //TODO chage this to add to listview instead of nonexistent text field

                                                    adapter.add(ob.getString("uid") + " : " + ob.getString("message"));
                                                    adapter.notifyDataSetChanged();
                                                    scrollMyListViewToBottom();



                                                } catch (JSONException e) {
                                                    Log.e("JSON exception in", e.getMessage());
                                                }
                                            }
                                        });
                                    }

                                }
//                                Log.e("After", "-----------");
                            } catch (JSONException e) {
                                Log.e("JSON exception", e.getMessage());
                            }
                        }
                    });
                }
                return null;

            }

        }.execute();


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Variable.alive = false;
                finish();
            }
        });


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in = input.getText().toString();

                now = Calendar.getInstance();
                Log.e("here", "date");

                new AsyncTask<Void, Void, Void>() {

                    @Override
                    protected Void doInBackground(Void... voids) {

//                        Log.e("here","");

//                        Log.e("day",now.getTime().getTime()+"");

                        RequestBody formBody = new FormEncodingBuilder()
                                .add("uid", userID + "")
                                .add("timestamp", now.get(Calendar.YEAR) + "-" + now.get(Calendar.MONTH) + "-" + now.get(Calendar.DATE)) //TODO fix the time
                                .add("message", in)
                                .build();

                        Log.e("printing formbody", "uid: " + userID + ", time: " + now.get(Calendar.YEAR) + "-" + now.get(Calendar.MONTH) + "-" + now.get(Calendar.DATE) + ", message: " + in);
                        Request request = new Request.Builder()
                                .url("http://45.79.131.252/input.php")
                                .post(formBody)
                                .build();

                        try {
                            Response response = client.newCall(request).execute();
                            if (!response.isSuccessful())
                                throw new IOException("Unexpected code " + response);


                            Log.e("response", response.body().string());
                        } catch (IOException e) {
                            Log.e("error", e.getMessage());
                        }


                        return null;
                    }

                    @Override
                    protected void onPostExecute(Void aVoid) {
                        input.setText("");
                    }
                }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
//
//                messages.append(input.getText().toString());


            }
        });


    }

    private void scrollMyListViewToBottom() {
        messages.post(new Runnable() {
            @Override
            public void run() {
                // Select the last row so it will scroll into view...
                messages.setSelection(adapter.getCount() - 1);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_messages, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
