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
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class SubPainkiller extends Activity {
	ListView lv;
	private static Toast toast;
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sub_painkiller);
		 lv=(ListView)findViewById(R.id.painkillerList1);
		 if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.JELLY_BEAN_MR2) 
			{
				ActionBar actionbar=getActionBar();
				actionbar.setDisplayHomeAsUpEnabled(true);
				actionbar.setHomeAsUpIndicator(drawable.action_previous);
			}
			
		 String[] PAINKILLER_MEDS=new String[] {
			    	"Paracetamol",
			    	"Ibuprofen",
			    	"Aspirin",
			    	"Codeine",
			    	"Amitriptyline and Gabapentin",
			    	"Morphine",
			    	"Diamorphine",
			    	"Fentanyl",
			    	"Alfentanil",
			    	"Oxycodone"
			    };
	    ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,PAINKILLER_MEDS);
		lv.setAdapter(adapter);
		lv.setOnItemClickListener(new OnItemClickListener() {
			 
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				switch(arg2) {
   		    case 0:  startParacetamol();
   		            break;
   	    	case 1:  startIbuprofen();
   		            break;
   		    case 2: startAspirin();
   		            break;
   		    case 3: startCodeine();
   		    	    break;
   		    case 4: startAmitriptyline();
   		    	    break;
   		    case 5: startMorphine();
   		    	    break;
   		    case 6: startDiamorphine();
   		    	    break;
   		    case 7: startFentanyl();
   		    	    break;
   		    case 8: startAlfentanil();
   		    	    break;
   		    case 9: startOxycodone();
   		    	    break;
   		    
   	     }
				
	   }		
	});
		
 }
public void startParacetamol()
  {
	
	if (toast != null)
	      toast.cancel();
	 toast = Toast.makeText(this,"Paracetamol is a common type of painkiller which is widely available in tablets,caplets and as age-appropriate liquid suitable for children.It is often taken for headaches, non- nerve pain and the symptoms of colds or flu.This treatment is unlikely to cause side effects in recommended doses but even a small overdose can cause serious problems.Seek medical advice if taking paracetamol for longer than three days.",Toast.LENGTH_LONG);
	 toast.setGravity(Gravity.CENTER, 50, 50);
	 toast.getView().setPadding(10, 10, 20, 20);
     toast.getView().setBackgroundColor(Color.argb(220, 96, 206, 30));
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
public void startIbuprofen()
  {
	if (toast != null)
	      toast.cancel();
	toast =Toast.makeText(this,"Ibuprofen is used to reduce fever and treat pain or inflammation caused by many conditions such as headache, toothache, back pain, arthritis, menstrual cramps, or minor injury. They should not be taken for long periods of time, unless advised by a healthcare professional.\nside effects:\n  upset stomach, mild heartburn\n  diarrhea, constipation\n bloating, gas\n dizziness, headache, nervousness\n skin itching or rash", Toast.LENGTH_LONG);
	 toast.setGravity(Gravity.CENTER, 50, 50);
     toast.getView().setPadding(10, 10, 20, 20);
	 toast.getView().setBackgroundColor(Color.argb(220, 12, 192, 224));
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
public void  startAspirin()
   {  
	if (toast != null)
	      toast.cancel();
	toast=Toast.makeText(this,"Aspirin is used to treat pain, and reduce fever or inflammation. It is sometimes used to treat or prevent heart attacks, strokes, and chest pain (angina). Aspirin should be used for cardiovascular conditions only under the supervision of a doctor.Do not give this medication to a child or teenager with a fever, flu symptoms, or chicken pox.\nside effects:\n  Reye's syndrome, a serious and sometimes fatal condition in children.", Toast.LENGTH_LONG);
	 toast.setGravity(Gravity.CENTER, 50, 50);
     toast.getView().setPadding(10, 10, 20, 20);
     toast.getView().setBackgroundColor(Color.argb(220, 141, 94, 142));
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
public void startCodeine()
  { if (toast != null)
      toast.cancel();
  toast=Toast.makeText(this,"Codeine is used for treating cough and other upper respiratory symptoms caused by allergies or the common cold.Codeine containing medicines should not be given to children under 12 years old. Codeine should only be given to children over 12 for short term moderate pain, at the lowest possible dose.\nside effects:\n  dependency\n  Blurred vision or dizziness\n  nausea\n  tiredness or weakness\n  vomiting.",Toast.LENGTH_LONG);
  toast.setGravity(Gravity.CENTER, 50, 50);
  toast.getView().setPadding(10, 10, 20, 20);
  toast.getView().setBackgroundColor(Color.argb(220, 226, 58, 10));
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
public void startAmitriptyline()
 {if (toast != null)
     toast.cancel();
 toast=Toast.makeText(this,"Amitriptyline is generally used for pain caused by damaged nerves or sensitivity linked to nerve problems, such as shingles or neuropathy. Amitriptyline is a depression treatment and gabapentin is an epilepsy drug which may be prescribed for nerve pain.\nside effects:\n  chest pain or heavy feeling, pain spreading to the arm or shoulder\n  sudden numbness or weakness, especially on one side of the body;\n  sudden severe headache, confusion, problems with vision, speech, or balance\n  pounding heartbeats or fluttering in your chest\n  feeling like you might pass out",Toast.LENGTH_LONG);
  toast.setGravity(Gravity.CENTER, 50, 50);
  toast.getView().setPadding(10, 10, 20, 20);
  toast.getView().setBackgroundColor(Color.argb(220, 29, 230, 6));
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
public void startMorphine()
{if (toast != null)
    toast.cancel();
toast=Toast.makeText(this,"Morphine is used to treat moderate to severe pain. Short-acting formulations are taken as needed for pain.The extended-release form of this medicine is for around-the-clock treatment of pain.\nside effects:\n  drowsiness/dizziness\n  constipation, stomach pain, vomiting\n  headache/tired feeling\n  anxiety\n  mild itching",Toast.LENGTH_LONG);
  toast.setGravity(Gravity.CENTER, 50, 50);
  toast.getView().setPadding(10, 10, 20, 20);
  toast.getView().setBackgroundColor(Color.argb(220, 32, 70, 204));
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
public void startDiamorphine()
  { if (toast != null)
      toast.cancel();
  toast=Toast.makeText(this,"Diamorphine is used in the treatment of severe pain associated with surgery, a heart attack or cancer.It can also be used to relief breathing difficulties associated with the build up of fluid on the lungs.\nside effects:\n  Nausea and vomiting\n  Constipation\n  Drowsiness.\n  Sweating\n  Low blood pressure (hypotension).\n  Loss of appetite\n  Rash or itching\n  Muscle rigidity",Toast.LENGTH_LONG);
    toast.setGravity(Gravity.CENTER, 50, 50);
    toast.getView().setPadding(10, 10, 20, 20);
    toast.getView().setBackgroundColor(Color.argb(220, 69, 167, 84));
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
public void startFentanyl()
  { if (toast != null)
      toast.cancel();
  toast=Toast.makeText(this,"This medication is used to help relieve moderate to severe ongoing pain (such as due to cancer). Fentanyl belongs to a class of drugs known as narcotic (opiate) analgesics. It works in the brain to change how your body feels and responds to pain.\nside effects:\n  Nausea/vomiting\n  constipation\n  lightheadedness/dizziness/drowsiness\n  headache\n  Mild irritation/itching/redness at the application site",Toast.LENGTH_LONG);
     toast.setGravity(Gravity.CENTER, 50, 50);
     toast.getView().setPadding(10, 10, 20, 20);
     toast.getView().setBackgroundColor(Color.argb(220, 216, 39, 20));
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
public void startAlfentanil()
  {if (toast != null)
      toast.cancel();
  toast=Toast.makeText(this,"Alfentanil is a narcotic pain medication used before and/or during surgery.This medication is given by vein (slow IV injection or continuous infusion) as directed by a doctor. Alfentanil should be used only in a hospital or clinical setting that has proper monitoring and support equipment.\nside effects:\n  Abnormally Low Blood Pressure\n  Significant Decrease in Lung Function\n  Slow HeartbeatSevere\n  Drowsiness\n  Feel Like Throwing Up",Toast.LENGTH_LONG);
    toast.setGravity(Gravity.CENTER, 50, 50);
    toast.getView().setPadding(10, 10, 20, 20);
    toast.getView().setBackgroundColor(Color.argb(220, 116, 85, 151));
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
public void startOxycodone()
  {if (toast != null)
      toast.cancel();
  toast=Toast.makeText(this,"This medication is used to help relieve moderate to severe pain. Oxycodone belongs to a class of drugs known as narcotic (opiate) analgesics. It works in the brain to change how your body feels and responds to pain.\nside effects:\n  Nausea\n  vomiting\n  constipation\n  lightheadedness\n  dizziness/drowsiness ",Toast.LENGTH_LONG);
     toast.setGravity(Gravity.CENTER, 50, 50);
     toast.getView().setPadding(10, 10, 20, 20);
     toast.getView().setBackgroundColor(Color.argb(220, 185, 51, 128));
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