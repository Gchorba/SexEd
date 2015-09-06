package com.sexed.appdoctor;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import com.sexed.appdoctor.R;

import java.util.Calendar;
import java.util.Date;

public class PeriodTracker extends Activity {

    private TextView title;
    private TextView subtitle;
    private Button back;
    private Button cont;
    private Button onPeriod;
    private DatePicker datePicker;
    private TextView note;
    private CheckBox checkbox;
    private TextView onetime;
    private Button early;
    private int difference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.period_tracker);


        title = (TextView) findViewById(R.id.textView3);
        subtitle = (TextView) findViewById(R.id.textView5);
        datePicker = (DatePicker) findViewById(R.id.datePicker);
        cont = (Button) findViewById(R.id.button6);
        onPeriod = (Button) findViewById(R.id.button7);
        back = (Button) findViewById(R.id.button5);
        note = (TextView) findViewById(R.id.period);
        checkbox = (CheckBox) findViewById(R.id.checkBox);
        onetime = (TextView) findViewById(R.id.textView6);
        early = (Button) findViewById(R.id.button15);


        //check if previously set

        if (Variables.lastPeriod != null) {

            onetime.setVisibility(View.INVISIBLE);
            subtitle.setVisibility(View.INVISIBLE);
            title.setVisibility(View.INVISIBLE);
            datePicker.setVisibility(View.INVISIBLE);
            onPeriod.setVisibility(View.INVISIBLE);
            cont.setVisibility(View.INVISIBLE);
            early.setVisibility(View.VISIBLE);

            Calendar cal = Calendar.getInstance();
            Date today;
            Date then;
            if (Variables.lastPeriod == null) {
                int day = datePicker.getDayOfMonth();
                int month = datePicker.getMonth();
                int year = datePicker.getYear();
                today = cal.getTime();

                cal.set(year, month, day);
                then = cal.getTime();
                Variables.lastPeriod = then;
                //TODO write lastPeriod etc. to preferences
            } else {
                today = cal.getTime();

                then = Variables.lastPeriod;
            }


            int difference = getDateDiffString(then, today);
            //Log.e("time diff",difference+"");


            if (28 - difference > 28) {
                //overdue
                note.setText("You are " + (28 - (Math.abs(difference)) + " days overdue."));
                note.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                note.setVisibility(View.VISIBLE);
                note.setTextColor(Color.CYAN);
            } else if (28 - difference == 0) {
                //overdue
                note.setText("You should have your period today");
                note.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                note.setVisibility(View.VISIBLE);
                note.setTextColor(Color.CYAN);
            } else if (28 - difference > 7 && difference <= 28) {
                note.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                note.setText(28 - difference + " days remaining.");
                note.setTextColor(Color.GREEN);
                note.setVisibility(View.VISIBLE);
            } else if (28 - difference <= 7 && 28 - difference > 3) {
                note.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                note.setText(28 - difference + " days remaining.");
                note.setVisibility(View.VISIBLE);
                note.setTextColor(Color.YELLOW);
            } else {
                note.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                note.setText("You should still be having your period." +
                        "\nClick below if this has changed.");
                note.setVisibility(View.VISIBLE);
                note.setTextColor(Color.RED);
            }

            if (Variables.tryingToGetPregnant) {
                //TODO set the alert to go off at the right time
            }
        } else {

            Variables.tryingToGetPregnant = checkbox.isChecked();

            //disable second parts visibility to false at first
            note.setVisibility(View.INVISIBLE);
            early.setVisibility(View.INVISIBLE);

        }


        //onClickListeners...
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onetime.setVisibility(View.INVISIBLE);
                subtitle.setVisibility(View.INVISIBLE);
                title.setVisibility(View.INVISIBLE);
                datePicker.setVisibility(View.INVISIBLE);
                onPeriod.setVisibility(View.INVISIBLE);
                cont.setVisibility(View.INVISIBLE);
                early.setVisibility(View.VISIBLE);

                Calendar cal = Calendar.getInstance();
                Date today;
                Date then;
                if (Variables.lastPeriod == null) {
                    int day = datePicker.getDayOfMonth();
                    int month = datePicker.getMonth();
                    int year = datePicker.getYear();
                    today = cal.getTime();

                    cal.set(year, month, day);
                    then = cal.getTime();
                    Variables.lastPeriod = then;
                    //TODO write lastPeriod etc. to preferences
                } else {
                    today = cal.getTime();

                    then = Variables.lastPeriod;
                }

                difference = getDateDiffString(then, today);

                if (28 - difference > 28) {
                    //overdue
                    note.setText("You are " + (28 - (Math.abs(difference)) + " days overdue."));
                    note.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                    note.setVisibility(View.VISIBLE);
                    note.setTextColor(Color.CYAN);
                } else if (28 - difference == 0) {
                    //overdue
                    note.setText("You should have your period today");
                    note.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                    note.setVisibility(View.VISIBLE);
                    note.setTextColor(Color.CYAN);
                } else if (28 - difference > 7 && difference <= 28) {
                    note.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                    note.setText(28 - difference + " days remaining.");
                    note.setTextColor(Color.GREEN);
                    note.setVisibility(View.VISIBLE);
                } else if (28 - difference <= 7 && 28 - difference > 3) {
                    note.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                    note.setText(28 - difference + " days remaining.");
                    note.setVisibility(View.VISIBLE);
                    note.setTextColor(Color.YELLOW);
                } else {
                    note.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                    note.setText("You should still be having your period." +
                            "\nClick below if this has changed.");
                    note.setVisibility(View.VISIBLE);
                    note.setTextColor(Color.RED);
                }

                if (Variables.tryingToGetPregnant) {
                    //TODO set the alert to go off at the right time
                }


            }
        });

        onPeriod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                note.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                note.setText("You should still be having your period." +
                        "\nClick below if this has changed.");
                note.setVisibility(View.VISIBLE);
                note.setTextColor(Color.RED);
                difference = 29;
            }
        });


        early.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Got it", Toast.LENGTH_SHORT).show();
                early.setVisibility(View.INVISIBLE);
                difference = 29;

            }
        });

        //default: every 28 days-ish
        //let the user estimate the next period
        //switch to enable the 2-day timeframe for ovulation if you're trying to get pregnant
        datePicker.setCalendarViewShown(false);


        checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Variables.tryingToGetPregnant = checkbox.isChecked();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_period_tracker, menu);
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


    public int getDateDiffString(Date dateOne, Date dateTwo) {
        long timeOne = dateOne.getTime();
        long timeTwo = dateTwo.getTime();
        long oneDay = 1000 * 60 * 60 * 24;
        long delta = (timeTwo - timeOne) / oneDay;


        return (int) delta;

    }
}
