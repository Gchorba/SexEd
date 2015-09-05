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

public class SubAntibiotic extends Activity {
	ListView lv;
	private static Toast toast;
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sub_antibiotic);
		 lv=(ListView)findViewById(R.id.antibioticlist1);
		 if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.JELLY_BEAN_MR2) 
			{
				ActionBar actionbar=getActionBar();
				actionbar.setDisplayHomeAsUpEnabled(true);
				actionbar.setHomeAsUpIndicator(drawable.action_previous);
			}
			
		 String[] PAINKILLER_MEDS=new String[] {
			    	"Aminoglycosides:(Amikacin, Gentamicin, Kanamycin, Neomycin)",
			    	"Carbapenems:( Ertapenem, Doripenem, Imipenem/Cilastatin)",
			    	"Glycopeptides:( Teicoplanin, Vancomycin, Telavancin)",
			    	"Lincosamides(Bs):( Clindamycin, Lincomycin)",
			    	"Macrolides(Bs):( Azithromycin, Clarithromycin, Erythromycin)",
			    	"Penicillin combinations:( Amoxicillin/clavulanate, Ampicillin/sulbactam)",
			    	"Polypeptides:(Bacitracin, Colistin, Polymyxin B)",
			    	"Quinolones:( Ciprofloxacin, Enoxacin, Gatifloxacin, Gemifloxacin,Ofloxacin)",
			    	"Sulfonamides(Bs):( Mafenide, Sulfacetamide, Silver sulfadiazine)",
			    	"Tetracyclines(Bs):( Demeclocycline, Doxycycline, Minocycline, Oxytetracycline)"
			    };
	    ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,PAINKILLER_MEDS);
		
	    lv.setAdapter(adapter);
		lv.setOnItemClickListener(new OnItemClickListener() {
			 
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				switch(arg2) {
   		    case 0:  startanti1();
   		            break;
   	    	case 1:  startanti2();
   		            break;
   		    case 2: startanti3();
   		            break;
   		    case 3: startanti4();
   		    	    break;
   		    case 4: startanti5();
   		    	    break;
   		    case 5: startanti6();
   		    	    break;
   		    case 6: startanti7();
   		    	    break;
   		    case 7: startanti8();
   		    	    break;
   		    case 8: startanti9();
   		    	    break;
   		    case 9: startanti10();
   		    	    break;
   		    
        	}
				
    	}
	});
}
	
public void startanti1()
  { if (toast != null)
      toast.cancel();
	 toast=Toast.makeText(this,"This medication is used for infections caused by Gram-negative bacteria, such as Escherichia coli and Klebsiellaparticularly Pseudomonas aeruginosa. Effective against Aerobic bacteria (not obligate/facultative anaerobes) and tularemia."+
                               "\nside effects\n 	Hearing loss\n 	Vertigo\n 	Kidney damage",Toast.LENGTH_LONG);
    toast.setGravity(Gravity.CENTER, 50, 50);
    toast.getView().setPadding(10, 10, 20, 20);
    toast.getView().setBackgroundColor(Color.argb(220, 51, 61, 185));
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
public void startanti2()
  { if (toast != null)
      toast.cancel();
	toast=Toast.makeText(this,"This medication is used when the disease is bactericidal for both Gram-positive and Gram-negative organisms and therefore useful for empiric broad-spectrum antibacterial coverage.\nSide effects:\n  Gastrointestinal upset and   diarrhea\n  Nausea\n 	Seizures\n 	Headache\n 	Rash and allergic reactions",Toast.LENGTH_LONG);
    toast.setGravity(Gravity.CENTER, 50, 50);
    toast.getView().setPadding(10, 10, 20, 20);
    toast.getView().setBackgroundColor(Color.argb(220,30,206,43));
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
public void startanti3()
  { if (toast != null)
      toast.cancel();
	toast=Toast.makeText(this,"This medication is generally used for infections caused by gram-positive microorganisms. It is also used in the first line treatment of infections caused by MRSA, MRSE and enterococcal infections resistant to ampicillin and aminoglycosides.\nside effects:\n  Local reactions: pain, burning sensation at the injection site\n Allergic reactions: rash, hives, fever, anaphylactic shock\n  Gastrointestinal tract: nausea, vomiting, diarrhea\n  CNS: dizziness, headache",Toast.LENGTH_LONG);
    toast.setGravity(Gravity.CENTER, 50, 50);
    toast.getView().setPadding(10, 10, 20, 20);
    toast.getView().setBackgroundColor(Color.argb(220, 210, 26, 81));
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
public void startanti4()
  { 
	if (toast != null)
        toast.cancel();
	toast=Toast.makeText(this,"This medication is generally used for serious staph-, pneumo-, and streptococcal infections in penicillin-allergic patients.It can also be used for anaerobic infections.\nSide effect:\n  Possible C. difficile-related pseudomembranous enterocolitis",Toast.LENGTH_LONG);
    toast.setGravity(Gravity.CENTER, 50, 50);
    toast.getView().setPadding(10, 10, 20, 20);
    toast.getView().setBackgroundColor(Color.argb(220, 218, 44, 18));
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
public void startanti5()
  {
	if (toast != null)
        toast.cancel();
	toast=Toast.makeText(this,"This medication is generally used for Streptococcal infections, syphilis, upper respiratory tract infections, lower respiratory tract infections, mycoplasmal infections, Lyme disease\nSide effect:\n 	Nausea, vomiting, and diarrhea (especially at higher doses)\n 	Prolonged cardiac QT interval (especially erythromycin)\n 	Hearing loss (especially at higher doses)\n 	Jaundice",Toast.LENGTH_LONG);
    toast.setGravity(Gravity.CENTER, 50, 50);
    toast.getView().setPadding(10, 10, 20, 20);
    toast.getView().setBackgroundColor(Color.argb(220, 223, 66, 13));
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
public void startanti6()
  { if (toast != null)
     toast.cancel(); 
	 toast=Toast.makeText(this,"Both Amoxicillin/clavulanate and Ampicillin/sulbactam are effective againts non-recurrent acute Otitis. Only a few oral-antibiotics active for skin and soft tissue infections, one of it is Amoxicillin/clavulanate.\nside effects:\n  Hypersensitivity reactions including skin reactions\n  angioedema\n  drug fever\n  serum sickness\n  vasculitis\n  eosinophilia",Toast.LENGTH_LONG);
     toast.setGravity(Gravity.CENTER, 50, 50);
     toast.getView().setPadding(10, 10, 20, 20);
     toast.getView().setBackgroundColor(Color.argb(220, 216, 221, 15));
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
public void startanti7()
  { if (toast != null)
      toast.cancel();
    toast=Toast.makeText(this,"This medication is used for eye, ear or bladder infections. usually applied directly to the eye or inhaled into the lungs. rarely given by injection, although the use of intravenous colistin is experiencing a resurgence due to the emergence of multi drug resistant organisms.\nSide effect:\n  Kidney and nerve damage (when given by injection)",Toast.LENGTH_LONG);
    toast.setGravity(Gravity.CENTER, 50, 50);
    toast.getView().setPadding(10, 10, 20, 20);
    toast.getView().setBackgroundColor(Color.argb(220, 52, 164, 184));
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
public void startanti8()
  { if (toast != null)
      toast.cancel();
    toast=Toast.makeText(this,"This medication is used for Urinary tract infections, bacterial prostatitis, community-acquired pneumonia, bacterial diarrhea, mycoplasmal infections, gonorrhea\nSide effects:\n  Nausea (rare)\n  irreversible damage to central nervous system (uncommon)\n  tendinosis (rare)",Toast.LENGTH_LONG);
    toast.setGravity(Gravity.CENTER, 50, 50);
    toast.getView().setPadding(10, 10, 20, 20);
    toast.getView().setBackgroundColor(Color.argb(220, 63, 198, 38));
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
public void startanti9()
  { if (toast != null)
      toast.cancel();
    toast=Toast.makeText(this," This medication is used for urinary tract infections (except sulfacetamide, used for eye infections, and mafenide and silver sulfadiazine.It is also used topically for burns)\nSide effects:\n 	Nausea, vomiting, and diarrhea\n  Allergy (including skin rashes)\n  Crystals in urine\n  Kidney failure\n  Decrease in white blood cell count\n  Sensitivity to sunlight",Toast.LENGTH_LONG);
    toast.setGravity(Gravity.CENTER, 50, 50);
    toast.getView().setPadding(10, 10, 20, 20);
    toast.getView().setBackgroundColor(Color.argb(220, 228, 7, 46));
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
public void startanti10()
  { if (toast != null)
    toast.cancel();
    toast=Toast.makeText(this,"This medication can be used for many diseases such as syphilis, chlamydial infections, Lyme disease,mycoplasmal infections, acne rickettsial infections, malaria \nSide effects:\n  Gastrointestinal upset\n  Sensitivity to sunlight\n 	Potential toxicity to mother and fetus during pregnancy\n 	Enamel hypoplasia (staining of teeth; potentially permanent)\n 	transient depression of bone growth",Toast.LENGTH_LONG);
    toast.setGravity(Gravity.CENTER, 50, 50);
    toast.getView().setPadding(10, 10, 20, 20);
    toast.getView().setBackgroundColor(Color.argb(220, 120, 200, 100));
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