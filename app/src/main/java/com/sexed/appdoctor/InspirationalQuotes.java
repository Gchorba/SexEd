package com.sexed.appdoctor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.sexed.appdoctor.R.drawable;



import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Switch;

public class InspirationalQuotes extends Activity {
	
	ListView lv;
	
	Switch sw;
	long id=1;
	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.inspirational_quotes);
		
		lv=(ListView)findViewById(R.id.lis1);
		sw=(Switch)findViewById(R.id.sw1);
		
		if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.JELLY_BEAN_MR2) 
		{
			ActionBar actionbar=getActionBar();
			actionbar.setDisplayHomeAsUpEnabled(true);
			actionbar.setHomeAsUpIndicator(drawable.action_previous);
		}
		
		//quote list data
		ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,inspQuoteData.quotes);
		lv.setAdapter(adapter);
		

        //file handling of switch state		
        try{
			
			File setfile=new File(Environment.getExternalStorageDirectory().getAbsolutePath()+"/state.dny");
		
			System.out.println(setfile.getAbsolutePath());
			if(!setfile.exists()){
				FileOutputStream outp=new FileOutputStream(setfile);
				outp.write(0);
				outp.close();
			}else{
				FileInputStream inp=new FileInputStream(setfile);
				int n=inp.read();
				inp.close();
				if(n==1)
				  {
					sw.setChecked(true);
				  }else{
					  sw.setChecked(false);
				  }
			}
		 }catch(Exception e){
			System.err.println(e.toString());
		}
		sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
	
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// 	TODO Auto-generated method stub
			  try {	
				if(isChecked==true)
				{   
					
					File setfile=new File(Environment.getExternalStorageDirectory().getAbsolutePath()+"/state.dny");
					FileOutputStream outp;
					
						outp = new FileOutputStream(setfile);
		               			
	                outp.write(1);		
	                outp.close();
	                startAlarmSetter();
				}
				else
				{
					File setfile=new File(Environment.getExternalStorageDirectory().getAbsolutePath()+"/state.dny");
					FileOutputStream outp;
					
						outp = new FileOutputStream(setfile);
					
	                outp.write(0);		
	                outp.close();
				}
			  } catch (Exception e) {
					System.err.println(e.toString());
				}	
			}
		});
	}
	public void startAlarmSetter(){
	   Intent launch=new Intent(this,AlarmListActivity.class);
	   startActivity(launch);
	}
 
	 @Override
	    public boolean onCreateOptionsMenu(Menu menu){
	    	
	    	getMenuInflater().inflate(R.menu.view_time, menu);

	    	return true;
	    }
	    
	    @Override
	    public boolean onOptionsItemSelected(MenuItem item){
	    	
	    	 switch (item.getItemId()) {
		        case android.R.id.home:
		            // app icon in action bar clicked; goto parent activity.
		            this.finish();
		            return true;
		            
		        case R.menu.view_time:
		        	startAlarmSetter();
		        	return true;
		        	
		        default:
		            return super.onOptionsItemSelected(item);
		    }
	    	
	    }	
		
}


