package com.sexed.appdoctor;


import com.sexed.appdoctor.R.drawable;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Diseases extends ListActivity {
    static final String[] DISEASE_NAMES = new String[]{
    	"cholera",
    	"Diphtheria",
    	"Malaria",
    	"Measles",
    	"Mumps",
    	"Influenza",
    	"Poliomyelitis",
    	"Scarlet Fever",
    	"Scurvy",
    	"Smallpox",
    	"Typhoid Fever",
    	"Yellow Fever",
    	"Dengue Fever",
    	"Chickenpox(varicella)",
    	"Leptospirosis( field fever)",
    	"Jaundice",
    	"Bronchopneumonia",
    	"Tuberculosis(TB)",
    	"Whooping cough (pertussis)",
    	"Coronary artery disease(angina pectoris)",
    	"Asthma",
    	"Meningitis",
    	"Nephritis",
    	"Lung Cancer",
    	"Brain cancer",
    	"Leukemia",
    	"Melanoma(Skin Cancer)",
    	"Prostate Cancer ",
    	"Bladder Cancer ",
    	"heart attack (myocardial infarction)",
    	"Coronary artery disease",
    	"Arrhythmia",
    	"Congenital Heart Disease",
    	"Cardiomyopathy",
    	"Vascular disease (blood vessel disease)",
    	"Peripheral Artery Disease",
    	"Aortic Aneurysm",
    	"Stroke",
    	"Transient ischaemic attack (TIA)",
    	"Subarachnoid haemorrhage",
    	"Vascular dementia"
    	
    	
    	
    	
    };
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_diseases);
		if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.JELLY_BEAN_MR2) 
		{
			ActionBar actionbar=getActionBar();
			actionbar.setDisplayHomeAsUpEnabled(true);
			actionbar.setHomeAsUpIndicator(drawable.action_previous);
		}
		
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,DISEASE_NAMES);

        // Assign adapter to List
        setListAdapter(adapter); 
	}
	@Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
                        
        super.onListItemClick(l, v, position, id);
                
         // ListView Clicked item index
         int itemPosition     = position;
         startDiseaseDescription(itemPosition);
	  }          
    public void startDiseaseDescription(int pos){
    	
    	Intent launchDisease=new Intent(this,DiseaseExplanation.class);
    	launchDisease.putExtra("code",pos);
    	startActivity(launchDisease);
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
