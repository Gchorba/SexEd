package com.sexed.appdoctor;

import com.sexed.appdoctor.R.drawable;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.ImageButton;


public class Symptoms extends Activity {
    
    public static int count=0;
    class SymptomCheck {public boolean HIGHFEVER, MILDFEVER, CHILLS, HEADACHE, NAUSIA, SEVERECOUGH, MILDCOUGH,FATIGUE,ACHE,JOINTPAIN,SKINRASH,EYEPAIN,APETITE,WEIGHTLOSS,CHESTPAIN,SHORTBREATH,SORETHROAT,RUNNYNOSE,DIFFSWALLOW,LOWBP,HIGHBP,STIFFNESS,MUSCLECRAMP,DIZZINESS,LIGHTHEAD,BACKPAIN,HEARTRATE,DRYSKIN,WEIGHTGAIN,SWOLLENLEG,MEMORYPROBLEM,DIARRHEA,BLUESKIN,DROOLING,SWOLLENEYE,REDRASH,PALETONGUE,SWOLLENGUMS,LOOSETEETH,MOUTHSORES,JAUNDICE,HEPATITIS,YELLOWSKIN,LIGHTSTOOLS,DARKURINE,DIFFURINE,BLOODURINE,SPOTRASH,BLEEDSKIN,COUGHBLOOD,BRIGHTLIGHTS,SKINMOLE,COORDINATION,PELVICPAIN,RACEBEAT,SUDDENNUMB,SUDDENCONF,PARALYSIS,DOUBLEVISION,BLADDER;}
	final SymptomCheck sympt=new SymptomCheck();
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);	
		setContentView(R.layout.activity_symptoms);
		if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.JELLY_BEAN_MR2) 
		{
			ActionBar actionbar=getActionBar();
			actionbar.setDisplayHomeAsUpEnabled(true);
			actionbar.setHomeAsUpIndicator(drawable.action_previous);
		}
		
		final CheckBox checkbox[]={
				(CheckBox)findViewById(R.id.cb0),
				(CheckBox)findViewById(R.id.cb1),
				(CheckBox)findViewById(R.id.cb2),
				(CheckBox)findViewById(R.id.cb3),
				(CheckBox)findViewById(R.id.cb4),
				(CheckBox)findViewById(R.id.cb5),
				(CheckBox)findViewById(R.id.cb6),
				(CheckBox)findViewById(R.id.cb7),
				(CheckBox)findViewById(R.id.cb8),
				(CheckBox)findViewById(R.id.cb9),
				(CheckBox)findViewById(R.id.cb10),
				(CheckBox)findViewById(R.id.cb11),
				(CheckBox)findViewById(R.id.cb12),
				(CheckBox)findViewById(R.id.cb13),
				(CheckBox)findViewById(R.id.cb14),
				(CheckBox)findViewById(R.id.cb15),
				(CheckBox)findViewById(R.id.cb16),
				(CheckBox)findViewById(R.id.cb17),
				(CheckBox)findViewById(R.id.cb18),
				(CheckBox)findViewById(R.id.cb19),
				(CheckBox)findViewById(R.id.cb20),
				(CheckBox)findViewById(R.id.cb21),
				(CheckBox)findViewById(R.id.cb22),
				(CheckBox)findViewById(R.id.cb23),
				(CheckBox)findViewById(R.id.cb24),
				(CheckBox)findViewById(R.id.cb25),
				(CheckBox)findViewById(R.id.cb26),
				(CheckBox)findViewById(R.id.cb27),
				(CheckBox)findViewById(R.id.cb28),
				(CheckBox)findViewById(R.id.cb29),
				(CheckBox)findViewById(R.id.cb30),
				(CheckBox)findViewById(R.id.cb31),
				(CheckBox)findViewById(R.id.cb32),
				(CheckBox)findViewById(R.id.cb33),
				(CheckBox)findViewById(R.id.cb34),
				(CheckBox)findViewById(R.id.cb35),
				(CheckBox)findViewById(R.id.cb36),
				(CheckBox)findViewById(R.id.cb37),
				(CheckBox)findViewById(R.id.cb38),
				(CheckBox)findViewById(R.id.cb39),
				(CheckBox)findViewById(R.id.cb40),
				(CheckBox)findViewById(R.id.cb41),
				(CheckBox)findViewById(R.id.cb42),
				(CheckBox)findViewById(R.id.cb43),
				(CheckBox)findViewById(R.id.cb44),
				(CheckBox)findViewById(R.id.cb45),
				(CheckBox)findViewById(R.id.cb46),
				(CheckBox)findViewById(R.id.cb47),
				(CheckBox)findViewById(R.id.cb48),
				(CheckBox)findViewById(R.id.cb49),
				(CheckBox)findViewById(R.id.cb50),
				(CheckBox)findViewById(R.id.cb51),
				(CheckBox)findViewById(R.id.cb52),
				(CheckBox)findViewById(R.id.cb53),
				(CheckBox)findViewById(R.id.cb54),
				(CheckBox)findViewById(R.id.cb55),
				(CheckBox)findViewById(R.id.cb56),
				(CheckBox)findViewById(R.id.cb57),
				(CheckBox)findViewById(R.id.cb58),
				(CheckBox)findViewById(R.id.cb59)
								
				
				
		};
		
		
//		if (count ==0)
//        {
//     	View myView =  this.findViewById(R.id.LinearLayout1);
//     	myView.setBackgroundResource(R.drawable.sympback);
//        }
//     else
//        {
//     	View myView =  this.findViewById(R.id.LinearLayout1);
//
//        }
		
		
		checkbox[0].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.HIGHFEVER=true;
					++count;
				}
				else
				{
					sympt.HIGHFEVER=false;
					--count;
				}
            backgroundchange();   	
			
			}
		});
        checkbox[1].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.MILDFEVER=true;
				    ++count;
				}
				else
				{
					sympt.MILDFEVER=false;
					--count;
				}
				 backgroundchange();  	
			}
		});
        checkbox[2].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.CHILLS=true;
					++count;
				}
				else
				{
					sympt.CHILLS=false;
					--count;
				}
				 backgroundchange();  
			}
		});
        checkbox[3].setOnClickListener(new OnClickListener() {
	
	        @Override
       	  public void onClick(View v) {
		  // TODO Auto-generated method stub
		    if (((CheckBox)v).isChecked()) {
			    sympt.HEADACHE=true;
			    ++count;
		    }
		    else
		    {
			    sympt.HEADACHE=false;
			    --count;
		    }
		    backgroundchange();  
	      }
       });
       checkbox[4].setOnClickListener(new OnClickListener() {
	
	     @Override
	     public void onClick(View v) {
		   // TODO Auto-generated method stub
		   if (((CheckBox)v).isChecked()) {
			  sympt.NAUSIA=true;
		      ++count;
		   }
		   else
		   {
	     	  sympt.NAUSIA=false;
			  --count;
		   }
		   backgroundchange();   
	     }
      });
      checkbox[5].setOnClickListener(new OnClickListener() {
	
	     @Override
	     public void onClick(View v) {
		 // TODO Auto-generated method stub
		    if (((CheckBox)v).isChecked()) {
			   sympt.SEVERECOUGH=true;
		       ++count;
		    }
		    else
		    {
			   sympt.SEVERECOUGH=false;
		       --count;
		    }
		    backgroundchange(); 
	     }
      });
      checkbox[6].setOnClickListener(new OnClickListener() {
	
	      @Override
       	  public void onClick(View v) {
		  // TODO Auto-generated method stub
		     if (((CheckBox)v).isChecked()) {
			    sympt.MILDCOUGH=true;
			    ++count;
		     }
		     else
		     {
			    sympt.MILDCOUGH=false;
			    --count;
		     }
		     backgroundchange(); 
	      }
      });
      checkbox[7].setOnClickListener(new OnClickListener() {
	
	      @Override
	      public void onClick(View v) {
		  // TODO Auto-generated method stub
		      if (((CheckBox)v).isChecked()) {
			     sympt.FATIGUE=true;
			     ++count;
		      }
		      else
		      {
			     sympt.FATIGUE=false;
			     --count;
		      }
		      backgroundchange(); 
	      }
      });
      checkbox[8].setOnClickListener(new OnClickListener() {
	
	      @Override
	      public void onClick(View v) {
		  // TODO Auto-generated method stub
		    if (((CheckBox)v).isChecked()) {
			  sympt.ACHE=true;
			  ++count;
		    }
		    else
		    {
			  sympt.ACHE=false;
			  --count;
		    }
		    backgroundchange(); 
	     }
     });
     checkbox[9].setOnClickListener(new OnClickListener() {
	
	      @Override
	      public void onClick(View v) {
		  // TODO Auto-generated method stub
		     if (((CheckBox)v).isChecked()) {
			    sympt.JOINTPAIN=true;
			    ++count;
		     }
		     else
		     {
			    sympt.JOINTPAIN=false;
			    --count;
		     }
		     backgroundchange(); 
	      }
      });
     checkbox[10].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.SKINRASH=true;
					++count;
				}
				else
				{
					sympt.SKINRASH=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[11].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.EYEPAIN=true;
					++count;
				}
				else
				{
					sympt.EYEPAIN=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[12].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.APETITE=true;
					++count;
				}
				else
				{
					sympt.APETITE=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[13].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.WEIGHTLOSS=true;
					++count;
				}
				else
				{
					sympt.WEIGHTLOSS=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[14].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.CHESTPAIN=true;
					++count;
				}
				else
				{
					sympt.CHESTPAIN=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[15].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.SHORTBREATH=true;
					++count;
				}
				else
				{
					sympt.SHORTBREATH=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[16].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.SORETHROAT=true;
					++count;
				}
				else
				{
					sympt.SORETHROAT=false;
					--count;
				}
				backgroundchange(); 
			}
		});	
     checkbox[17].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.RUNNYNOSE=true;
					++count;
				}
				else
				{
					sympt.RUNNYNOSE=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[18].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.DIFFSWALLOW=true;
					++count;
				}
				else
				{
					sympt.DIFFSWALLOW=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[19].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.LOWBP=true;
					++count;
				}
				else
				{
					sympt.LOWBP=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[20].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.HIGHBP=true;
					++count;
				}
				else
				{
					sympt.HIGHBP=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[21].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.STIFFNESS=true;
					++count;
				}
				else
				{
					sympt.STIFFNESS=false;
					--count;
				}
				backgroundchange(); 
			}
		});     
     checkbox[22].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.MUSCLECRAMP=true;
					++count;
				}
				else
				{
					sympt.MUSCLECRAMP=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[23].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.DIZZINESS=true;
					++count;
				}
				else
				{
					sympt.DIZZINESS=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[24].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.LIGHTHEAD=true;
					++count;
				}
				else
				{
					sympt.LIGHTHEAD=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[25].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.BACKPAIN=true;
					++count;
				}
				else
				{
					sympt.BACKPAIN=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[26].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.HEARTRATE=true;
					++count;
				}
				else
				{
					sympt.HEARTRATE=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[27].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.DRYSKIN=true;
					++count;
				}
				else
				{
					sympt.DRYSKIN=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[28].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.WEIGHTGAIN=true;
					++count;
				}
				else
				{
					sympt.WEIGHTGAIN=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[29].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.SWOLLENLEG=true;
					++count;
				}
				else
				{
					sympt.SWOLLENLEG=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[30].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.MEMORYPROBLEM=true;
					++count;
				}
				else
				{
					sympt.MEMORYPROBLEM=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[31].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.DIARRHEA=true;
					++count;
				}
				else
				{
					sympt.DIARRHEA=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[32].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.BLUESKIN=true;
					++count;
				}
				else
				{
					sympt.BLUESKIN=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[33].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.DROOLING=true;
					++count;
				}
				else
				{
					sympt.DROOLING=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[34].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.SWOLLENEYE=true;
					++count;
				}
				else
				{
					sympt.SWOLLENEYE=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[35].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.REDRASH=true;
					++count;
				}
				else
				{
					sympt.REDRASH=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[36].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.PALETONGUE=true;
					++count;
				}
				else
				{
					sympt.PALETONGUE=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[37].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.SWOLLENGUMS=true;
					++count;
				}
				else
				{
					sympt.SWOLLENGUMS=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[38].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.LOOSETEETH=true;
					++count;
				}
				else
				{
					sympt.LOOSETEETH=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[39].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.MOUTHSORES=true;
					++count;
				}
				else
				{
					sympt.MOUTHSORES=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[40].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.JAUNDICE=true;
					++count;
				}
				else
				{
					sympt.JAUNDICE=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[41].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.HEPATITIS=true;
					++count;
				}
				else
				{
					sympt.HEPATITIS=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[42].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.YELLOWSKIN=true;
					++count;
				}
				else
				{
					sympt.YELLOWSKIN=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[43].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.LIGHTSTOOLS=true;
					++count;
				}
				else
				{
					sympt.LIGHTSTOOLS=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[44].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.DARKURINE=true;
					++count;
				}
				else
				{
					sympt.DARKURINE=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[45].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.DIFFURINE=true;
					++count;
				}
				else
				{
					sympt.DIFFURINE=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[46].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.BLOODURINE=true;
					++count;
				}
				else
				{
					sympt.BLOODURINE=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[47].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.SPOTRASH=true;
					++count;
				}
				else
				{
					sympt.SPOTRASH=false;
					--count;
				}
				backgroundchange(); 
			}
		});     
     checkbox[48].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.BLEEDSKIN=true;
					++count;
				}
				else
				{
					sympt.BLEEDSKIN=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[49].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.COUGHBLOOD=true;
					++count;
				}
				else
				{
					sympt.COUGHBLOOD=false;
					--count;
				}
				backgroundchange(); 	
			}
		});
     checkbox[50].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.BRIGHTLIGHTS=true;
					++count;
				}
				else
				{
					sympt.BRIGHTLIGHTS=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[51].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.SKINMOLE=true;
					++count;
				}
				else
				{
					sympt.SKINMOLE=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[52].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.COORDINATION=true;
					++count;
				}
				else
				{
					sympt.COORDINATION=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[53].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.PELVICPAIN=true;
					++count;
				}
				else
				{
					sympt.PELVICPAIN=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[54].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.RACEBEAT=true;
					++count;
				}
				else
				{
					sympt.RACEBEAT=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[55].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.SUDDENNUMB=true;
					++count;
				}
				else
				{
					sympt.SUDDENNUMB=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[56].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.SUDDENCONF=true;
					++count;
				}
				else
				{
					sympt.SUDDENCONF=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[57].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.PARALYSIS=true;
					++count;
				}
				else
				{
					sympt.PARALYSIS=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[58].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.DOUBLEVISION=true;
					++count;
				}
				else
				{
					sympt.DOUBLEVISION=false;
					--count;
				}
				backgroundchange(); 
			}
		});
     checkbox[59].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox)v).isChecked()) {
					sympt.BLADDER=true;
					++count;
				}
				else
				{
					sympt.BLADDER=false;
					--count;
				}
				backgroundchange(); 
			}
		});
    
        
		ImageButton done=(ImageButton)findViewById(R.id.medicineDone);
		done.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				startResultEvaluate();
				  
			}
		});

	}
    public void startResultEvaluate()
    {  
    	Intent data=new Intent(this,ResultEvaluate.class);
    	if (count<=2)
    	   {
    		if(sympt.DIARRHEA==true)
    		   {
    			
    		      data.putExtra("code", 1);
    	       }  
    		else if((sympt.BLUESKIN==true)||(sympt.DROOLING==true))
    		   { 
    		      data.putExtra("code", 2);	
    		   }
    		else if(sympt.SWOLLENEYE==true)
    		   {
    			  data.putExtra("code", 3);
    		   }
    		else if((sympt.REDRASH==true)||(sympt.PALETONGUE==true))
    		   {
    			  data.putExtra("code", 4);
    		   }
    		else if((sympt.SWOLLENGUMS==true)||(sympt.LOOSETEETH==true))
 		       {
 			      data.putExtra("code", 5);
 		       }
    		else if(sympt.MOUTHSORES==true)
 		       {
 			      data.putExtra("code", 6);
 		       }
    		else if((sympt.JAUNDICE==true)||(sympt.HEPATITIS==true))
 		       {
 			      data.putExtra("code", 7);
 		       }
    		else if(sympt.SPOTRASH==true)
 		       {
 			      data.putExtra("code", 8);
 		       }
    		else if((sympt.LIGHTSTOOLS==true)||(sympt.DARKURINE==true)||(sympt.BLOODURINE==true))
		       {
			      data.putExtra("code", 9);
		       }
		    else if((sympt.YELLOWSKIN==true)||(sympt.LIGHTSTOOLS==true))
 		       {
 			      data.putExtra("code", 10);
 		       }
    		else if(sympt.PELVICPAIN==true)
 		       {
 			      data.putExtra("code", 11);
 		       }
    		else if((sympt.BLEEDSKIN==true)&&(sympt.SKINMOLE==true))
		       {
			      data.putExtra("code", 12);
		       }
    		else if(sympt.COUGHBLOOD==true)
		       {
			      data.putExtra("code", 13);
		       }
    		else if(sympt.BRIGHTLIGHTS==true)
		       {
			      data.putExtra("code", 14);
		       }
    		else if((sympt.SUDDENCONF==true)||(sympt.SUDDENNUMB==true))
		       {
			      data.putExtra("code", 15);
		       }
    		else if((sympt.WEIGHTGAIN==true)||(sympt.SWOLLENLEG==true))
		       {
			      data.putExtra("code", 16);
		       }
    		else if((sympt.PARALYSIS==true)&&(sympt.DOUBLEVISION))
		       {
			      data.putExtra("code", 17);
		       }
    		else if(sympt.BLADDER==true)
		       {
			      data.putExtra("code", 18);
		       }
    		else if((sympt.DOUBLEVISION==true)&&(sympt.COORDINATION==true))
		       {
			      data.putExtra("code", 19);
		       }
    		else if(sympt.RACEBEAT==true)
		       {
			      data.putExtra("code", 20);
		       }
    		else if(sympt.BLEEDSKIN==true)
		       {
			      data.putExtra("code", 21);
		       }
    		else if((sympt.PARALYSIS==true))
		       {
			      data.putExtra("code", 22);
		       }
    		else 
		       {
			      data.putExtra("code", 23);
		       }
    	   }
    	else if((count>2)&&(count<8))
    	  {
    		
    		
    		//code 23 for else stmt when no condition match
    	    if((sympt.NAUSIA==true)&&(sympt.HEARTRATE==true)&&(sympt.DRYSKIN==true)&&(sympt.MEMORYPROBLEM==true)&&(sympt.DIARRHEA==true))
		       {
			      data.putExtra("code", 24);
		       }
    		else if((sympt.HIGHFEVER==true)&&(sympt.CHILLS==true)&&(sympt.SEVERECOUGH==true)&&(sympt.RUNNYNOSE==true)&&(sympt.SORETHROAT==true)&&(sympt.BLUESKIN==true)&&(sympt.DROOLING==true))
		       {
			      data.putExtra("code", 25);
		       }
    		else if((sympt.CHILLS==true)&&(sympt.HIGHFEVER==true)&&(sympt.HEADACHE==true)&&(sympt.NAUSIA==true)&&(sympt.FATIGUE==true))
		       {
			      data.putExtra("code", 26);
		       }
    		else if((sympt.DIFFSWALLOW==true)&&(sympt.SWOLLENEYE==true)&&(sympt.HIGHFEVER==true)&&(sympt.MILDCOUGH==true)&&(sympt.FATIGUE==true)&&(sympt.ACHE==true))
		       {
			      data.putExtra("code", 27);
		       }
    		else if((sympt.MILDFEVER==true)&&(sympt.HEADACHE==true)&&(sympt.FATIGUE==true)&&(sympt.WEIGHTLOSS==true)&&(sympt.DIFFSWALLOW==true))
		       {
			      data.putExtra("code", 28);
		       }
    		else if((sympt.HIGHFEVER==true)&&(sympt.CHILLS==true)&&((sympt.SEVERECOUGH==true)||(sympt.MILDCOUGH==true))&&(sympt.HEADACHE==true)&&(sympt.SORETHROAT==true)&&(sympt.RUNNYNOSE==true))
		       {
			      data.putExtra("code", 29);
		       }
    		
    		else if(((sympt.HIGHFEVER==true)||(sympt.MILDFEVER==true))&&(sympt.HEADACHE==true)&&(sympt.NAUSIA==true)&&(sympt.FATIGUE==true)&&(sympt.SORETHROAT==true))
		       {
			      data.putExtra("code", 30);
		       }
    		else if((sympt.HIGHFEVER==true)&&(sympt.SORETHROAT==true)&&(sympt.REDRASH==true)&&(sympt.PALETONGUE==true))
		       {
			      data.putExtra("code", 31);
		       }
    		else if((sympt.SWOLLENGUMS==true)&&(sympt.LOOSETEETH==true)&&(sympt.BLEEDSKIN==true))
		       {
			      data.putExtra("code", 32);
		       }
    		else if((sympt.FATIGUE==true)&&(sympt.NAUSIA==true)&&(sympt.SKINRASH==true)&&(sympt.HEADACHE==true)&&(sympt.ACHE==true)&&(sympt.MOUTHSORES==true))
		       {
			      data.putExtra("code", 33);
		       }
    		else if((sympt.APETITE==true)&&(sympt.HEADACHE==true)&&(sympt.ACHE==true)&&(sympt.HIGHFEVER==true)&&(sympt.DIARRHEA==true))
		       {
			      data.putExtra("code", 34);
		       }
    		else if((sympt.JAUNDICE==true)&&(sympt.HEPATITIS==true)&&(sympt.COUGHBLOOD==true))
		       {
			      data.putExtra("code", 35);
		       }
    		else if((sympt.HIGHFEVER==true)&&(sympt.HEADACHE==true)&&(sympt.SKINRASH==true)&&(sympt.APETITE==true))
    		   {
			      data.putExtra("code", 36);
		       }
    		else if((sympt.HIGHFEVER==true)&&(sympt.HEADACHE==true)&&(sympt.ACHE==true)&&(sympt.JAUNDICE==true))
		       {
			      data.putExtra("code", 37);
		       }
    		else if((sympt.HIGHFEVER==true)&&(sympt.CHILLS==true)&&(sympt.HEADACHE==true)&&(sympt.NAUSIA==true)&&(sympt.APETITE==true))
    		   {
			      data.putExtra("code", 38);
		       }
    		else if((sympt.SKINRASH==true)&&(sympt.LIGHTSTOOLS==true)&&(sympt.DARKURINE==true))
		       {
			      data.putExtra("code", 39);
		       }
    		else if(((sympt.HIGHFEVER==true)||(sympt.MILDFEVER==true))&&(sympt.SEVERECOUGH==true)&&(sympt.CHESTPAIN==true)&&(sympt.SHORTBREATH==true))
		       {
			      data.putExtra("code", 40);
		       }
    		else if((sympt.SEVERECOUGH==true)&&(sympt.CHILLS==true)&&(sympt.CHESTPAIN==true)&&(sympt.WEIGHTLOSS==true)&&(sympt.COUGHBLOOD==true))
		       {
			      data.putExtra("code", 41);
		       }
    		else if((sympt.MILDFEVER==true)&&(sympt.MILDCOUGH==true)&&(sympt.RUNNYNOSE==true))
		       {
			      data.putExtra("code", 42);
		       }
    		else if((sympt.FATIGUE==true)&&(sympt.ACHE==true)&&(sympt.CHESTPAIN==true))
		       {
			      data.putExtra("code", 43);
		       }
    		else if((sympt.SEVERECOUGH==true)&&(sympt.CHESTPAIN==true)&&(sympt.SHORTBREATH==true))
		       {
			      data.putExtra("code", 44);
		       }
    		else if((sympt.HIGHFEVER==true)&&(sympt.HEADACHE==true)&&(sympt.NAUSIA==true)&&(sympt.FATIGUE==true)&&(sympt.BRIGHTLIGHTS==true))
		       {
			      data.putExtra("code", 45);
		       }
    		else if((sympt.NAUSIA==true)&&(sympt.DIFFURINE==true)&&(sympt.PELVICPAIN==true))
		       {
			      data.putExtra("code", 46);
		       }
    		else if((sympt.SEVERECOUGH==true)&&(sympt.ACHE==true)&&(sympt.CHESTPAIN==true)&&(sympt.COUGHBLOOD==true))
		       {
			      data.putExtra("code", 47);
		       }
    		else if((sympt.HEADACHE==true)&&(sympt.NAUSIA==true)&&(sympt.DIZZINESS==true)&&(sympt.COORDINATION==true)&&(sympt.DOUBLEVISION==true))
		       {
			      data.putExtra("code", 48);
		       }
    		else if((sympt.FATIGUE==true)&&(sympt.CHILLS==true)&&(sympt.APETITE==true))
		       {
			      data.putExtra("code", 49);
		       }
    		else if((sympt.SKINRASH==true)&&(sympt.BLEEDSKIN==true)&&(sympt.SKINMOLE==true))
		       {
			      data.putExtra("code", 50);
		       }
    		else if((sympt.LIGHTSTOOLS==true)&&(sympt.DARKURINE==true)&&(sympt.DIFFURINE==true)&&(sympt.BLOODURINE==true))
		       {
			      data.putExtra("code", 51);
		       }
    		else if((sympt.BACKPAIN==true)&&(sympt.DIFFURINE==true)&&(sympt.BLOODURINE==true)&&(sympt.PELVICPAIN==true))
		       {
			      data.putExtra("code", 52);
		       }
    		else if((sympt.NAUSIA==true)&&(sympt.CHESTPAIN==true)&&(sympt.SHORTBREATH==true)&&((sympt.LOWBP==true)||(sympt.HIGHBP==true)))
		       {
			      data.putExtra("code", 53);
		       }
    		else if((sympt.CHESTPAIN==true)&&(sympt.SHORTBREATH==true)&&(sympt.LIGHTHEAD==true)&&(sympt.RACEBEAT==true))
		       {
			      data.putExtra("code", 54);
		       }
    	    else if((sympt.FATIGUE==true)&&(sympt.CHESTPAIN==true)&&(sympt.HEARTRATE==true))
		       {
			      data.putExtra("code", 55);
		       }
    	    else if((sympt.COORDINATION==true)&&(sympt.SUDDENNUMB==true)&&(sympt.SUDDENCONF==true))
		       {
			      data.putExtra("code", 56);
		       }
    	    else if((sympt.FATIGUE==true)&&(sympt.SHORTBREATH==true)&&(sympt.WEIGHTGAIN==true)&&(sympt.SWOLLENLEG==true))
		       {
			      data.putExtra("code", 57);
		       }
    	    else if((sympt.ACHE==true)&&(sympt.SEVERECOUGH==true)&&(sympt.SHORTBREATH==true)&&(sympt.RUNNYNOSE==true))
		       {
			      data.putExtra("code", 58);
		       }
    	    else if((sympt.FATIGUE==true)&&(sympt.DOUBLEVISION==true)&&(sympt.PARALYSIS==true))
		       {
			      data.putExtra("code", 59);
		       }
    	    else if((sympt.ACHE==true)&&(sympt.DIZZINESS==true)&&(sympt.DOUBLEVISION==true))
		       {
			      data.putExtra("code", 60);
		       }
    	    //case 1 conditions start
    	    else if(sympt.DIARRHEA==true) 
		       {
		          data.putExtra("code", 1);
	           }
		    else if((sympt.BLUESKIN==true)||(sympt.DROOLING==true))
		       { 
		          data.putExtra("code", 2);	
		       }
		    else if(sympt.SWOLLENEYE==true)
		       {
			      data.putExtra("code", 3);
		       }
		    else if((sympt.REDRASH==true)||(sympt.PALETONGUE==true))
		       {
			      data.putExtra("code", 4);
		       }
		    else if((sympt.SWOLLENGUMS==true)||(sympt.LOOSETEETH==true))
		       {
			      data.putExtra("code", 5);
		       }
		    else if(sympt.MOUTHSORES==true)
		       {
			      data.putExtra("code", 6);
		       }
		    else if((sympt.JAUNDICE==true)||(sympt.HEPATITIS==true))
		       {
			      data.putExtra("code", 7);
		       }
		    else if(sympt.SPOTRASH==true)
		       {
			      data.putExtra("code", 8);
		       }
		    else if((sympt.LIGHTSTOOLS==true)||(sympt.DARKURINE==true)||(sympt.BLOODURINE==true))
		       {
			      data.putExtra("code", 9);
		       }
		    else if((sympt.YELLOWSKIN==true)||(sympt.LIGHTSTOOLS==true))
		       {
			      data.putExtra("code", 10);
		       }
		    else if(sympt.PELVICPAIN==true)
		       {
			      data.putExtra("code", 11);
		       }
		    else if((sympt.BLEEDSKIN==true)&&(sympt.SKINMOLE==true))
		       {
			      data.putExtra("code", 12);
		       }
		    else if(sympt.COUGHBLOOD==true)
		       {
			      data.putExtra("code", 13);
		       }
		    else if(sympt.BRIGHTLIGHTS==true)
		       {
			      data.putExtra("code", 14);
		       }
		    else if((sympt.SUDDENCONF==true)||(sympt.SUDDENNUMB==true))
		       {
			      data.putExtra("code", 15);
		       }
		    else if((sympt.WEIGHTGAIN==true)||(sympt.SWOLLENLEG==true))
		       {
			      data.putExtra("code", 16);
		       }
		    else if(sympt.PARALYSIS==true)
		       {
			      data.putExtra("code", 17);
		       }
		    else if(sympt.DOUBLEVISION==true)
		       {
			      data.putExtra("code", 18);
		       }
		    else if((sympt.DOUBLEVISION==true)&&(sympt.COORDINATION==true))
		       {
			      data.putExtra("code", 19);
		       }
		    else if(sympt.RACEBEAT==true)
		       {
			      data.putExtra("code", 20);
		       }
		    else if(sympt.BLEEDSKIN==true)
		       {
			      data.putExtra("code", 21);
		       }
		    else if((sympt.PARALYSIS==true)&&(sympt.DOUBLEVISION))
		       {
			      data.putExtra("code", 22);
		       }
    	    //case 1 conditions over
    	    else if((sympt.HIGHFEVER==true)&&(sympt.CHILLS==true)&&(sympt.HEADACHE==true))
		       {
			      data.putExtra("code", 61);
		       }
    		//same disease sequence for different symptom combinations
    	    else if(((sympt.HIGHFEVER==true)||(sympt.MILDCOUGH==true))&&(sympt.CHILLS==true)&&(sympt.HEADACHE==true)&&(sympt.NAUSIA==true))
		       {
			      data.putExtra("code", 61);
		       }
    		//same disease sequence for different symptom combinations
    	    else if(((sympt.HIGHFEVER==true)||(sympt.MILDCOUGH==true))&&(sympt.CHILLS==true)&&(sympt.NAUSIA==true))
		       {
			      data.putExtra("code", 61);
		       }
    		//same disease sequence for different symptom combinations
    	    else if(((sympt.HIGHFEVER==true)||(sympt.MILDCOUGH==true))&&(sympt.HEADACHE==true)&&(sympt.NAUSIA==true))
		       {
			      data.putExtra("code", 61);
		       }
    	    else if(((sympt.HIGHFEVER==true)||(sympt.MILDCOUGH==true))&&(sympt.NAUSIA==true)&&(sympt.FATIGUE==true))
		       {
			      data.putExtra("code", 62);
		       }
    	    else if(sympt.NAUSIA==true)
		       {
			      data.putExtra("code", 63);
		       }
    	    else if(sympt.MUSCLECRAMP==true)
		       {
			      data.putExtra("code", 64);
		       }
    	    else if(sympt.SORETHROAT==true)
		       {
			      data.putExtra("code", 65);
		       }
    	    else if(sympt.RUNNYNOSE==true)
		       {
			      data.putExtra("code", 66);
		       }
    	    else if(sympt.BLEEDSKIN==true)
		       {
			      data.putExtra("code", 67);
		       }
    	    else if(sympt.DIZZINESS==true)
		       {
			      data.putExtra("code", 68);
		       }
    	    else if(sympt.APETITE==true)
		       {
			      data.putExtra("code", 69);
		       }
    	    else if(sympt.FATIGUE==true)
		       {
			      data.putExtra("code", 70);
		       }
    	    else if(sympt.SHORTBREATH==true)
		       {
			      data.putExtra("code", 71);
		       }
    	    else if(sympt.LIGHTHEAD==true)
		       {
			      data.putExtra("code", 72);
		       }
    	    else if(sympt.MEMORYPROBLEM==true)
		       {
			      data.putExtra("code", 73);
		       }
    	    else if((sympt.HEARTRATE==true)||(sympt.RACEBEAT==true))
		       {
			      data.putExtra("code", 74);
		       }
    	    else if(sympt.CHESTPAIN==true)
		       {
			      data.putExtra("code", 75);
		       }
    	    else if(sympt.ACHE==true)
		       {
			      data.putExtra("code", 76);
		       }
    	    else if(sympt.DRYSKIN==true)
		       {
			      data.putExtra("code", 77);
		       }
    	    else if(sympt.BLUESKIN==true)
		       {
			      data.putExtra("code", 78);
		       }
    	    else if(sympt.STIFFNESS==true)
		       {
			      data.putExtra("code", 79);
		       }
    	    else if(sympt.RUNNYNOSE==true)
		       {
			      data.putExtra("code", 80);
		       }
    	    else if(sympt.JOINTPAIN==true)
		       {
			      data.putExtra("code", 81);
		       }
    	    else if(sympt.SKINRASH==true)
		       {
			      data.putExtra("code", 82);
		       }
    	    else if(sympt.SEVERECOUGH==true)
		       {
			      data.putExtra("code", 83);
		       }
    	    else if((sympt.LOWBP==true)||(sympt.HIGHBP==true))
		       {
			      data.putExtra("code", 84);
		       }
    	    else if(sympt.DOUBLEVISION==true)
		       {
			      data.putExtra("code", 85);
		       }
    	    else
    	       {
    	    	  data.putExtra("code", 86);
    	       }
    	  }
    	else
    	  {
    		data.putExtra("code", 87);
    	  }
	    startActivity(data);
    }
    
    public void backgroundchange()
    {
//       if (count ==0)
//          {
//       	View myView =  this.findViewById(R.id.LinearLayout1);
//       	myView.setBackgroundResource(R.drawable.sympback);
//          }
//       else
//          {
//       	View myView =  this.findViewById(R.id.LinearLayout1);
//       	myView.setBackgroundResource(R.drawable.clickherewhendone);
//          }
    }   
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
    	MenuInflater inflater=getMenuInflater();
    	inflater.inflate(R.menu.done_details, menu);

    	return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
    	
    	switch (item.getItemId()) {
        case android.R.id.home:
            // app icon in action bar clicked; goto parent activity.
            this.finish();
            return true;
        case R.id.action_done:
        	startResultEvaluate();
        	return true; 
            
        default:
            return super.onOptionsItemSelected(item);
        }
    	
    	
    	
    }
    
    
}
