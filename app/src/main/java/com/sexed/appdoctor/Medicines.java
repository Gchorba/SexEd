package com.sexed.appdoctor;

import com.sexed.appdoctor.R.drawable;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Medicines extends Activity {
ListView lv;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_medicines);
		 lv=(ListView)findViewById(R.id.medlist1);
		 if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.JELLY_BEAN_MR2) 
			{
				ActionBar actionbar=getActionBar();
				actionbar.setDisplayHomeAsUpEnabled(true);
				actionbar.setHomeAsUpIndicator(drawable.action_previous);
			}
		 String[] choices=new String[] {
			    	"Painkiller",
			    	"Antibiotic",
			    	"Antihistamine",
			    	"Antiinflamatory"
			    };
	    ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,choices);
	    lv.setAdapter(adapter);
		lv.setOnItemClickListener(new OnItemClickListener() {
			 
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				switch(arg2) {
   		    case 0: painkiller();
   		            break;
   	    	case 1:antibiotic();
   		            break;
   		    case 2: antihistamine();
   		            break;
   		    case 3: antiinflamatory();
   		    default: break;
   	}
				
			}
		});
	}
  
	public void painkiller()
	{
		Intent start=new Intent(this,SubPainkiller.class);
		startActivity(start);
	}
	public void antibiotic()
	{
		Intent start=new Intent(this,SubAntibiotic.class);
		startActivity(start);
	}
	public void antihistamine()
	{
		Intent start=new Intent(this,SubAntihistamine.class);
		startActivity(start);
	}
	public void antiinflamatory()
	{
		Intent start=new Intent(this,SubAntiinflamatory.class);
		startActivity(start);
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
