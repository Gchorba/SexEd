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


public class SubAntiinflamatory extends Activity {
	ListView lv;
	private static Toast toast;
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sub_antiinflamatory);
		lv=(ListView)findViewById(R.id.antiinflamatoryList1);
		if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.JELLY_BEAN_MR2) 
		{
			ActionBar actionbar=getActionBar();
			actionbar.setDisplayHomeAsUpEnabled(true);
			actionbar.setHomeAsUpIndicator(drawable.action_previous);
		}
		
		 String[] ANTIINFLAMATORY_MEDS=new String[] {
			    	"Diclofenac",
			    	"Ibuprofen",
			    	"Naproxen",
			    	"Celecoxib",
			    	"Mefenamic acid",
			    	"Etoricoxib",
			    	"Indometacin",
			    	"Aspirin (in doses greater than 600mg)"
			    };
	    ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,ANTIINFLAMATORY_MEDS);
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
	toast=Toast.makeText(this,"Diclofenac is used to treat painful conditions such as arthritis, sprains and strains, gout, migraine, dental pain, and pain after surgical operations. It eases pain and reduces inflammation.\nside effects:\n 	sudden numbness or weakness (especially on one side of the body)\n   sudden severe headache, slurred speech, problems with vision or balance.\n   chest pain, sudden cough, wheezing, rapid breathing.",Toast.LENGTH_LONG);
    toast.setGravity(Gravity.CENTER, 50, 50);
    toast.getView().setPadding(10, 10, 20, 20);
    toast.getView().setBackgroundColor(Color.argb(220, 143, 92, 122));
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
	toast=Toast.makeText(this,"Ibuprofen is a common painkiller and part of a group of medicines called NSAIDs or non-steroidal anti-inflammatory drugs.These are used to treat pain and inflammation. They should not be taken for long periods of time, unless advised by a healthcare professional.\nside effects:\n  stomach upsets\n  bleeding\n  kidney and heart problems",Toast.LENGTH_LONG);
    toast.setGravity(Gravity.CENTER, 50, 50);
    toast.getView().setPadding(10, 10, 20, 20);
    toast.getView().setBackgroundColor(Color.argb(220, 90, 146, 95));
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
	toast=Toast.makeText(this,"Naproxen is used to treat pain or inflammation caused by conditions such as arthritis, ankylosing spondylitis, tendinitis, bursitis, gout, or menstrual cramps.\nside effects:\n  chest pain, weakness, shortness of breath\n  slurred speech, problems with vision or balance;\n  black, bloody, or tarry stools\n 	coughing up blood or vomit that looks like coffee grounds\n  swelling or rapid weight gain, little or no urinating\n 	nausea",Toast.LENGTH_LONG);
    toast.setGravity(Gravity.CENTER, 50, 50);
    toast.getView().setPadding(10, 10, 20, 20);
    toast.getView().setBackgroundColor(Color.argb(220, 198, 177, 38));
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
	toast=Toast.makeText(this,"Celecoxib is used for the rellef of pain, fever, swelling, and tenderness caused by osteoarthritis, juvenile arthritis, rheumatoid arthritis, and ankylosing spondylitis. Celecoxib does not prevent the progression of either type of arthritis. It reduces only the symptoms and signs of arthritis.\nside effects:\n 	swelling or rapid weight gain\n  coughing up blood or vomit\n 	black, bloody, or tarry stools\n  chest pain, weakness,   shortness of breath",Toast.LENGTH_LONG);
    toast.setGravity(Gravity.CENTER, 50, 50);
    toast.getView().setPadding(10, 10, 20, 20);
    toast.getView().setBackgroundColor(Color.argb(220, 115, 176, 30));
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
	toast=Toast.makeText(this," Mefenamic acid is used for the short-term treatment of mild to moderate pain from various conditions. It is also used to decrease pain and blood loss from menstrual periods.\nside effects:\n  Upset stomach\n  nausea, heartburn, dizziness\n  drowsiness\n  diarrhea\n  headache may occur",Toast.LENGTH_LONG);
    toast.setGravity(Gravity.CENTER, 50, 50);
    toast.getView().setPadding(10, 10, 20, 20);
    toast.getView().setBackgroundColor(Color.argb(220, 213, 66, 23));
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
	toast=Toast.makeText(this,"This drug is used to treat patients suffering from joint pain and swelling caused by osteoarthritis, rheumatoid arthritis, ankylosing spondylitis and gout.Benefits of being on this drug can include relieving pain and reducing the swelling and stiffness in joints allowing you to do more of your normal daily activities.\nside effects:\n 	Weakness\n 	Fatigue\n 	Headache\n 	  Diarrhoea\n 	Indigestion (dyspepsia)",Toast.LENGTH_LONG);
    toast.setGravity(Gravity.CENTER, 50, 50);
    toast.getView().setPadding(10, 10, 20, 20);
    toast.getView().setBackgroundColor(Color.argb(220, 96, 84, 152));
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
	toast=Toast.makeText(this,"Indomethacin is used to relieve pain, swelling, and joint stiffness caused by arthritis,gout, bursitis, and tendonitis. Reducing these symptoms helps you do more of your normal daily activities.\nside effects:\n 	Upset stomach\n  heartburn\n  headache\n  drowsiness\n  dizziness",Toast.LENGTH_LONG);
    toast.setGravity(Gravity.CENTER, 50, 50);
    toast.getView().setPadding(10, 10, 20, 20);
    toast.getView().setBackgroundColor(Color.argb(220, 192, 44, 44));
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
	toast=Toast.makeText(this,"Aspirin is used to treat pain, and reduce fever or inflammation. It is sometimes used to treat or prevent heart attacks, strokes, and chest pain (angina). It should be used for cardiovascular conditions only under the supervision of a doctor.\nside effects:\n  Reye's syndrome, a serious and sometimes fatal condition in children.",Toast.LENGTH_LONG);
    toast.setGravity(Gravity.CENTER, 50, 50);
    toast.getView().setPadding(10, 10, 20, 20);
    toast.getView().setBackgroundColor(Color.argb(220, 46, 154, 190));
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