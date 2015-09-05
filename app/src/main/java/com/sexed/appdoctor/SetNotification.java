package com.sexed.appdoctor;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class SetNotification extends Activity{
	
	TextView tv0,tv,tv2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
       //data from alarm  screen
		  onNewIntent(getIntent());
       
		
	}

	@Override
	public void onNewIntent(Intent intent){
	    Bundle extras = intent.getExtras();
	    if(extras != null){
	        if(extras.containsKey("xcount"))
	        {
	        	setContentView(R.layout.activity_set_notification);
	        	
	        	tv=(TextView)findViewById(R.id.dquote2);
	    		tv0=(TextView)findViewById(R.id.dquote1);
	    		tv2=(TextView)findViewById(R.id.dquote3);
	        	
	    		tv0.setTextColor(Color.argb(240, 219, 69, 4));
	    		tv.setTextColor(Color.argb(240, 219, 69, 4));
	    		tv2.setTextColor(Color.argb(240, 219, 69, 4));
	    		
	            //set notification quote
	            int msg = extras.getInt("xcount");
	            tv.setText(inspQuoteData.quotes[msg]);
	    		
	    		
	    		
	        }
	    }


	}

}
