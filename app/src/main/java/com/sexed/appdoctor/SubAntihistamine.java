package com.sexed.appdoctor;

import com.sexed.appdoctor.R.drawable;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class SubAntihistamine extends Activity {
	ListView lv;
	private static Toast toast;
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sub_antihistamine);
		lv=(ListView)findViewById(R.id.antihistamineList1);
		
		if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.JELLY_BEAN_MR2) 
		{
			ActionBar actionbar=getActionBar();
			actionbar.setDisplayHomeAsUpEnabled(true);
			actionbar.setHomeAsUpIndicator(drawable.action_previous);
		}
		
		 String[] ANTIHISTAMINE_MEDS=new String[] {
			    	"Azelastine",
			    	"Hydroxyzine",
			    	"Desloratadine",
			    	"Cyproheptadine",
			    	"Emadastine",
			    	"Levocabastine",
			    	"Carbinoxamine",
			    	"Levocetirizine"
			    };
	    ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,ANTIHISTAMINE_MEDS);
		lv.setAdapter(adapter);
		lv.setOnItemClickListener(new OnItemClickListener() {
			 
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				switch(arg2) {
  		    case 0: startMed1();
  		            break;
  	    	case 1: startMed2();
  		            break;
  		    case 2: startMed3();
  		            break;
  		    case 3: startMed4();
  		    	    break;
  		    case 4: startMed5();
  		    	    break;
  		    case 5: startMed6();
  		    	    break;
  		    case 6: startMed7();
  		    	    break;
  		    case 7: startMed8();
  		    	    break;
  		   
  	}
		
			
			}
		});
	}
	public void startMed1()
	  {
		if (toast != null)
		      toast.cancel();
		toast=Toast.makeText(this,"Azelastine is used to treat hay fever and allergy symptoms including runny nose, sneezing, and itchy nose. Azelastine comes as a nasal spray.\nside effects:\n 	bitter taste\n 	tiredness\n 	weight increase\n 	muscle pain\n 	nasal burning",Toast.LENGTH_LONG);
	    toast.setGravity(Gravity.CENTER, 50, 50);
	    toast.getView().setPadding(10, 10, 20, 20);
	    toast.getView().setBackgroundColor(Color.argb(220, 38, 198, 95));
	    TextView text = (TextView) toast.getView().findViewById(android.R.id.message);
	    text.setTextColor(Color.WHITE);
	    text.setTextSize(20); 
		toast.show();
	    new CountDownTimer(10000, 1000)
		{

		    public void onTick(long millisUntilFinished) {toast.show();}
		    public void onFinish() {toast.show();}

		}.start();
	  }
	  
	public void startMed2()
	  {
		if (toast != null)
		      toast.cancel();
		toast=Toast.makeText(this,"Hydroxyzine(Atarax, Vistaril) is used to relieve the itching caused by allergies and to control the nausea and vomiting caused by various conditions, including motion sickness. It is also used for anxiety and to treat the symptoms of alcohol withdrawal.\nside effects:\n 	dry mouth, nose, and throat\n 	upset stomach\n 	drowsiness\n 	dizziness\n 	chest congestion\n 	headache\n 	reddening of skin",Toast.LENGTH_LONG);
	    toast.setGravity(Gravity.CENTER, 50, 50);
	    toast.getView().setPadding(10, 10, 20, 20);
	    toast.getView().setBackgroundColor(Color.argb(220, 128, 21, 215));
	    TextView text = (TextView) toast.getView().findViewById(android.R.id.message);
	    text.setTextColor(Color.WHITE);
	    text.setTextSize(20); 
		toast.show();
	    new CountDownTimer(10000, 1000)
		{

		    public void onTick(long millisUntilFinished) {toast.show();}
		    public void onFinish() {toast.show();}

		}.start();
	  }
		
	  
	public void startMed3()
	  {
		if (toast != null)
		      toast.cancel();
		toast=Toast.makeText(this,"Desloratadine(Clarinex) is used to relieve hay fever and allergy symptoms, including sneezing; runny nose; and red, itchy, tearing eyes. It is also used to treat hives.\nside effects:\n 	 headache\n 	upset stomach\n 	dizziness\n 	sore throat\n 	dry mouth\n 	muscle pain\n 	extreme tiredness\n 	painful menstruation",Toast.LENGTH_LONG);
	    toast.setGravity(Gravity.CENTER, 50, 50);
	    toast.getView().setPadding(10, 10, 20, 20);
	    toast.getView().setBackgroundColor(Color.argb(220, 221, 15, 87));
	    TextView text = (TextView) toast.getView().findViewById(android.R.id.message);
	    text.setTextColor(Color.WHITE);
	    text.setTextSize(20); 
		toast.show();
	    new CountDownTimer(10000, 1000)
		{

		    public void onTick(long millisUntilFinished) {toast.show();}
		    public void onFinish() {toast.show();}

		}.start();
	  }
	  
	public void startMed4()
	  {
		if (toast != null)
		      toast.cancel();
		toast=Toast.makeText(this,"Cyproheptadine relieves red, irritated, itchy, watery eyes, sneezing and runny nose caused by allergies, irritants in the air, hay fever and hives.\nside effects:\n  dry mouth, nose,and throat\n 	drowsiness and dizziness\n 	nausea\n 	chest congestion\n 	headache\n 	excitement (especially in children)",Toast.LENGTH_LONG);
	    toast.setGravity(Gravity.CENTER, 50, 50);
	    toast.getView().setPadding(10, 10, 20, 20);
	    toast.getView().setBackgroundColor(Color.argb(220, 54, 99, 182));
	    TextView text = (TextView) toast.getView().findViewById(android.R.id.message);
	    text.setTextColor(Color.WHITE);
	    text.setTextSize(20); 
		toast.show();
	    new CountDownTimer(10000, 1000)
		{

		    public void onTick(long millisUntilFinished) {toast.show();}
		    public void onFinish() {toast.show();}

		}.start();
	  }
	  
	public void startMed5()
	  {
		if (toast != null)
		      toast.cancel();
		toast=Toast.makeText(this,"Emadastine is used for Relieving the eye symptoms of hay fever in adults and children aged three years and older.\nside effects:\n   Eye pain.\n   Eye itching or irritation.\n   Red eyes.\n   Staining of the cornea.\n   Blurred vision.\n   Headache",Toast.LENGTH_LONG);
	    toast.setGravity(Gravity.CENTER, 50, 50);
	    toast.getView().setPadding(10, 10, 20, 20);
	    toast.getView().setBackgroundColor(Color.argb(220, 79, 157, 92));
	    TextView text = (TextView) toast.getView().findViewById(android.R.id.message);
	    text.setTextColor(Color.WHITE);
	    text.setTextSize(20); 
		toast.show();
	    new CountDownTimer(10000, 1000)
		{

		    public void onTick(long millisUntilFinished) {toast.show();}
		    public void onFinish() {toast.show();}

		}.start();
	  }
	  
	public void startMed6()
	  {
		if (toast != null)
		      toast.cancel();
		toast=Toast.makeText(this,"Levocabastine(Livostin)is used for Seasonal allergic conjunctivitis.This medicine may cause your vision to blur temporarily after you have applied it into your eye. Do not drive or operate machinery until this has worn off.\nside effects:\n   Headache\n   Blurred vision\n   Difficulty in breathing   (dyspnoea)\n   Irritation of the eye\n   Swelling around the eye\n   Itchy rash (urticaria)",Toast.LENGTH_LONG);
	    toast.setGravity(Gravity.CENTER, 50, 50);
	    toast.getView().setPadding(10, 10, 20, 20);
	    toast.getView().setBackgroundColor(Color.argb(220, 167, 99, 69));
	    TextView text = (TextView) toast.getView().findViewById(android.R.id.message);
	    text.setTextColor(Color.WHITE);
	    text.setTextSize(20); 
		toast.show();
	    new CountDownTimer(10000, 1000)
		{

		    public void onTick(long millisUntilFinished) {toast.show();}
		    public void onFinish() {toast.show();}

		}.start();
	  }
	  
	public void startMed7()
	  {
		if (toast != null)
		      toast.cancel();
		toast=Toast.makeText(this,"): Carbinoxamine(Palgic) is  used to relieve symptoms of allergy, hay fever, and the common cold. These symptoms include rash, watery eyes, itchy eyes/nose/throat/skin, cough, runny nose, and sneezing.\nside effects:\n   drowsiness\n   dizziness\n   head ache\n   constipation\n   stomach upset\n   Blurred vision.\n   decreased coordination\n   dry mouth/nose/throat  ",Toast.LENGTH_LONG);
	    toast.setGravity(Gravity.CENTER, 50, 50);
	    toast.getView().setPadding(10, 10, 20, 20);
	    toast.getView().setBackgroundColor(Color.argb(220, 111, 98, 138));
	    TextView text = (TextView) toast.getView().findViewById(android.R.id.message);
	    text.setTextColor(Color.WHITE);
	    text.setTextSize(20); 
		toast.show();
	    new CountDownTimer(10000, 1000)
		{

		    public void onTick(long millisUntilFinished) {toast.show();}
		    public void onFinish() {toast.show();}

		}.start();
	  }
	  
	public void startMed8()
	  {
		if (toast != null)
		      toast.cancel();
		toast=Toast.makeText(this,"Levocetirizine(Xyzal) is an used to relieve allergy symptoms such as watery eyes, runny nose, itching eyes/nose, sneezing, hives, and itching.\nside effects:\n   drowsiness\n   tiredness\n   dry mouth\n   fever/cough\n",Toast.LENGTH_LONG);
	    toast.setGravity(Gravity.CENTER, 50, 50);
	    toast.getView().setPadding(10, 10, 20, 20);
	    toast.getView().setBackgroundColor(Color.argb(220, 68, 168, 101));
	    TextView text = (TextView) toast.getView().findViewById(android.R.id.message);
	    text.setTextColor(Color.WHITE);
	    text.setTextSize(20); 
		toast.show();
	    new CountDownTimer(10000, 1000)
		{

		    public void onTick(long millisUntilFinished) {toast.show();}
		    public void onFinish() {toast.show();}

		}.start();
	  }
	
	
	@Override
	public void onDestroy() {
	      super.onDestroy();
	      if (toast != null)
	        toast.cancel();
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
