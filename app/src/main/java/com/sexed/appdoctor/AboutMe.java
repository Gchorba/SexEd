package com.sexed.appdoctor;


import com.sexed.appdoctor.R.drawable;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class AboutMe extends Activity {

	 TextView tv;

	 @SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_about_me);
		if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.JELLY_BEAN_MR2) 
		{
			ActionBar actionbar=getActionBar();
			actionbar.setDisplayHomeAsUpEnabled(true);
			actionbar.setHomeAsUpIndicator(drawable.action_previous);
		}
		tv=(TextView)findViewById(R.id.aboutText1);
	    tv.setText("I am an engineering student hoping to create an impact on the world of engineering by trying to implement various innovative ideas and by inspiring others to do the same!All my apps are free and it always will be:)");
	    tv.setTextColor(Color.argb(255, 82, 26, 113));    
	    ImageButton start=(ImageButton)findViewById(R.id.imageBtn1);
	        start.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					startAcno();
				    
				}
			});

		
	}
   
	 public void startAcno()
	    {
	    	Intent launch=new Intent(this,AccountNo.class);
	    	startActivity(launch);
	    }
	 
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.about_me, menu);
		return true;
	}
   
	@Override
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
