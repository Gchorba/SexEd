package com.sexed.appdoctor;



import com.appszoom.appszoomsdk.AppsZoom;
import com.sexed.appdoctor.R.drawable;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

@SuppressLint("NewApi") public class AppDoctor extends Activity {
    @SuppressLint("NewApi")
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_doctor);
        ImageButton sym=(ImageButton)findViewById(R.id.b_sym);
        AppsZoom.start(this);
        AppsZoom.showAd(this);
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.JELLY_BEAN_MR2) 
		{
			ActionBar actionbar=getActionBar();
			actionbar.setDisplayHomeAsUpEnabled(true);
			actionbar.setHomeAsUpIndicator(drawable.action_previous);
		}
		
		
        sym.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			startSymptoms();	
			}
		});
        ImageButton dis=(ImageButton)findViewById(R.id.b_dis);
        dis.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startDiseases();
			}
		});
        ImageButton med=(ImageButton)findViewById(R.id.b_med);
        med.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startMedicines();
			}
		});
        ImageButton news=(ImageButton)findViewById(R.id.b_health);
        news.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startNews();
			}
		});
        ImageButton insp=(ImageButton)findViewById(R.id.b_insp);
        insp.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startInspiration();
			}
		});
        ImageButton about=(ImageButton)findViewById(R.id.b_about);
        about.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			startAbout();	
			}
		});
        
    }
    public void startSymptoms()
    {
	  Intent launchActivity=new Intent(this,Symptoms.class);
	  startActivity(launchActivity);
    }
    public void startDiseases()
    {
	  Intent launchActivity=new Intent(this,Diseases.class);
	  startActivity(launchActivity);
    }
    public void startMedicines()
    {
	  Intent launchActivity=new Intent(this,Medicines.class);
	  startActivity(launchActivity);
    }
    public void startNews()
    {
	  startActivity(new Intent(Intent.ACTION_VIEW,
	            Uri.parse("http://mobihealthnews.com/")));
    }
    public void startInspiration()
    {
	  Intent launchActivity=new Intent(this,InspirationalQuotes.class);
	  startActivity(launchActivity);
    }
    public void startAbout()
    {
	  Intent launchActivity=new Intent(this,AboutMe.class);
	  startActivity(launchActivity);
    }
    public void startDonate()
    {
      Intent launchActivity=new Intent(this,AccountNo.class);
  	  startActivity(launchActivity);
    }

   
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
    	
    	getMenuInflater().inflate(R.menu.donate, menu);
        return true;
    }
    
    public boolean onOptionsItemSelected(MenuItem item) {
    	
    	
      switch (item.getItemId()) {
      case R.menu.donate:
      	  startDonate();
      	  return true;  
      
      case android.R.id.home:
            // app icon in action bar clicked; goto parent activity.
            this.finish();
            return true;
                    
        default:
            return super.onOptionsItemSelected(item);
      }

   }
}
