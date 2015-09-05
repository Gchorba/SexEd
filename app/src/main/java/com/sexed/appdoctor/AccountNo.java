package com.sexed.appdoctor;

import com.sexed.appdoctor.R.drawable;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class AccountNo extends Activity {
    TextView tv,tv2;
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.account_no);
        tv=(TextView)findViewById(R.id.accnotext1);
        tv.setText("Yes i would love to hear from you....If you get time please share your experience in using my app, kindly share the drawbacks and faults you found in this app and suggest ideas to make this app better.Also connect with me on the social networking sites given below:) ");
		tv.setTextColor(Color.argb(255, 64, 4, 136));
		
		tv2=(TextView)findViewById(R.id.mailme);
		tv2.setText("Also mail me @\n   danny4ever12@live.com \nwhatsapp me @\n   +918907484460");
		tv2.setTextColor(Color.argb(255, 64, 4, 136));
		
		if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.JELLY_BEAN_MR2) 
		{
			ActionBar actionbar=getActionBar();
			actionbar.setDisplayHomeAsUpEnabled(true);
			actionbar.setHomeAsUpIndicator(drawable.action_previous);
		}
		
		ImageButton start1=(ImageButton)findViewById(R.id.fb1);
        start1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startFb();
			    
			}
		});
        
        ImageButton start2=(ImageButton)findViewById(R.id.gplus1);
        start2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startgPlus();
			    
			}
		});
        
        ImageButton start3=(ImageButton)findViewById(R.id.lnkdin);
        start3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startLnkdin();
			    
			}
		});
        
        ImageButton start4=(ImageButton)findViewById(R.id.twitter);
        start4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startTwitter();
			    
			}
		});
        
	}
	
	public void startFb(){
		 startActivity(new Intent(Intent.ACTION_VIEW,
		            Uri.parse("https://www.facebook.com/daniel.ephraim1")));
		
	}
	public void startgPlus(){
		startActivity(new Intent(Intent.ACTION_VIEW,
	            Uri.parse("https://plus.google.com/+DanielEphraim12")));
	}
	public void startLnkdin(){
		startActivity(new Intent(Intent.ACTION_VIEW,
	            Uri.parse("https://in.linkedin.com/pub/daniel-ephraim/85/615/9ab")));
	}
	public void startTwitter(){
		startActivity(new Intent(Intent.ACTION_VIEW,
	            Uri.parse("https://twitter.com/Danny4ever12")));
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