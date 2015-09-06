package com.sexed.appdoctor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Tools extends Activity {


    private Button chat;
    private Button tracker;
    private Button detector;
    private Button clinics;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tools);


        tracker = (Button) findViewById(R.id.button10);
        chat = (Button) findViewById(R.id.button11);
        detector = (Button) findViewById(R.id.button12);
        clinics = (Button) findViewById(R.id.button13);
        back = (Button) findViewById(R.id.button14);

        tracker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Tools.this, PeriodTracker.class));
            }
        });

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Tools.this, Messages.class));
            }
        });

        detector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Gene, modify the intent
//                startActivity(new Intent(Tools.this,Detector.class));
            }
        });

        clinics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Tools.this, Clinics.class));
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tools, menu);
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
