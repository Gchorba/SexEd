package com.sexed.appdoctor;



import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class AppDoctor extends Activity {

    private Button education;
    private Button utilities;
    private Button about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_doctor);

        education = (Button) findViewById(R.id.button);
        utilities = (Button) findViewById(R.id.button2);
        about = (Button) findViewById(R.id.button3);

        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //start the education activity

            }
        });

        utilities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //start the utilities menu activity
                startActivity(new Intent(AppDoctor.this,Tools.class));
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //start the about us activity
                startActivity(new Intent(AppDoctor.this,About.class));
            }
        });


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

//        getMenuInflater().inflate(R.menu.donate, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()) {


            case android.R.id.home:
                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
