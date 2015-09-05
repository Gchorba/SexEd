package com.sexed.appdoctor;


import com.sexed.appdoctor.R.drawable;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;

import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DiseaseExplanation extends Activity {
    TextView tv1;
    int position;
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_disease_explanation);
        Intent i=getIntent();
        tv1=(TextView)findViewById(R.id.DiseaseTextView1);
       
        tv1.setTextColor(Color.argb(255, 100, 46, 160));
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.JELLY_BEAN_MR2) 
		{
			ActionBar actionbar=getActionBar();
			actionbar.setDisplayHomeAsUpEnabled(true);
			actionbar.setHomeAsUpIndicator(drawable.action_previous);
		}
     
        position=i.getIntExtra("code", position);
		switch(position)
		{
		case 0:  tv1.setText("Cholera is caused by a bacterial infection of the intestine. In many cases the infection is mild   sometimes producing no symptoms at all. " +
				"But approximately one in 20 people infected with cholera has a serious case, with symptoms including severe diarrhea, vomiting, and leg cramps." +
				" These symptoms quickly cause dehydration and shock, and can result in death within hours if the infected person doesn t receive treatment." +
				"Cholera is typically transmitted by contaminated food or water. In areas with poor treatment of sewage and drinking water, the feces of people with cholera can enter the water supply and spread quickly, resulting in an epidemic." +
				"Although some cholera infections can be very severe, and even fatal, the disease can be easily and successfully treated by quickly replacing the fluid and salts lost through diarrhea.");
		         break;
		case 1:  tv1.setText("Diphtheria is a serious bacterial disease that affects the respiratory system or the skin." +
				" Respiratory diphtheria causes a sore throat and fever, and sometimes swelling of the neck. " +
				"In severe cases it can cause a membrane to form over the throat, which results in breathing problems. Cutaneousdiphtheria affects the skin, causing infected lesions to form." +
				" Diphtheria can lead to coma and death if it goes untreated.An infected person usually spreads the disease by coughing or sneezing. The person expels droplets containing the diphtheria bacteria, which are then inhaled by another person. The disease is treated by hospitalization and antibiotics." +
				" But eventhough vaccines have been found to neutralize diphtheria, this disease is still endemic in many developing countries.");
		         break;
		case 2: tv1.setText("Malaria is caused by a parasite transmitted by infected mosquitoes. Symptoms occur ten days to four weeks after being bitten and are similar to symptoms brought on by the flu   chills, fever, sweating, headache, and muscle pain. In serious cases, malaria may cause vomiting, anemia (iron deficiency), kidney failure, coma, and death." +
				"The disease can be prevented by taking anti-malarial drugs and by avoiding mosquito bites in areas where malaria infection is common. Those infected with malaria can be treated with prescription drugs, which are most effective when taken early in the course of the disease." +
				"The parasite that most often causes malaria needs warm temperatures to grow and thrive, so the disease is typically found in tropical and subtropical countries.");         
		        break;
		case 3:tv1.setText("Measles is a highly contagious disease caused by a virus. Early symptoms include fever, cough, red eyes, and a runny nose. During the first few days, the characteristic measles rash appears, beginning with white spots in the mouth and spreading to a red rash that covers the entire body."+
		        "The rash typically lasts four to seven days. Severe cases of measles can cause diarrhea, ear infection, pneumonia, encephalitis (swelling of the brain), and death.The measles virus is easily spread through airborne droplets expelled by coughing or sneezing, and can live in the air for up to two hours after an infected person has been present."+
				"After exposure, the virus lives in the body for about two weeks before symptoms appear. There is no specific remedy available for measles, so treatment usually consists of bed rest and easing symptoms.");
			    break;
		case 4:tv1.setText("Mumps is a contagious viral disease that causes painful swelling of the salivary glands. As a result, people infected with mumps sometimes appear to have  chipmunk cheeks.  Other symptoms include fever, headache, sore muscles, and fatigue. Serious complications are rare, and may include encephalitis (swelling of the brain), inflammation of the sex organs, and deafness.The mumps virus is transmitted by contact with the respiratory secretions of an infected person."+
			    "Like measles, mumps has a relatively long incubation period, with symptoms appearing more than two weeks after exposure. There are no specific treatments available for mumps, but the disease can be prevented by immunization.");
		        break;			    
		
		case 5:tv1.setText("Influenza, more commonly known as  the flu,  is caused by a contagious virus. Symptoms include body aches, sore throat, headache, fever, coughing, and chills. Perhaps because influenza is so common, misconceptions about the disease abound. Often, people who experience a bad cold say they have the flu, but this is incorrect: Unlike influenza, colds rarely cause headaches or fever. And despite widespread use of the term  stomach flu,  true influenza does not cause gastrointestinal symptoms."+
               "The flu is spread through airborne respiratory secretions. Symptoms can be serious, and the disease can be fatal   especially for babies, the elderly, and people with weakened immune systems. When influenza pandemics occur, they spread quickly, often killing large numbers of previously healthy people.The disease can be treated by antiviral medicines, and a seasonal vaccine is available to protect against it.");
			    break;
		case 6:tv1.setText("Poliomyelitis (often shortened to  polio ) is a viral infection spread by person-to-person contact. Symptoms vary according to the type of infection, and three basic patterns are common:\n  	Subclinical infections, which account for the vast majority of polio cases. Symptoms may include fatigue, headache, sore throat, mild fever, and vomiting."+
			    " 	Nonparalytic poliomyelitis: Symptoms include back pain, neck pain, headache, leg pain, fever, muscle stiffness, painful rash,and vomiting.\n  	Paralytic poliomyelitis: Symptoms include fever, breathing difficulty, constipation, headache, muscle pain, muscle spasms, and muscle weakness on one side of the body. Muscle weakness comes on quickly and progresses to paralysis.\nTreatments may include antibiotics, pain-relieving medication, and physical therapy to strengthen weak muscles.");
			    break;
		case 7:tv1.setText("Scarlet fever is a disease caused by Streptococcus bacteria   the same bacteria that cause strep throat. The bacteria are spread through contact with the oral or nasal fluids of an infected person. Scarlet fever begins with a fever and sore throat, and later causes a red rash that starts at the chest and spreads over the body. Most cases of scarlet fever occur in children under the age of 18, and it was once a very serious childhood disease. Before effective treatments became available it often led to rheumatic fever and death, but the availability of antibiotics has dramatically reduced the scarlet fever mortality rate.");
			    break;
		case 8:tv1.setText("Scurvy is a disease caused by a vitamin C deficiency. Symptoms of scurvy include weakness, anemia, gum disease, and bleeding from the mucus membranes. The disease was once common among sailors who were at sea for long periods without access to fresh fruit. When it became widely known that citrus fruits (with their abundant vitamin C) could prevent scurvy, sailors began taking lemon juice on long voyages and incidences of scurvy diminished greatly. Cases of scurvy in the U.S. are now rare, but the disease occasionally appears in older, malnourished adults.");
			    break;
		case 9: tv1.setText("Smallpox is a serious, contagious, and sometimes fatal infectious disease caused by a virus. There is no specific treatment for smallpox disease, and the only prevention is vaccination.\nSymptoms of smallpox include:\n   Flu-like fatigue, headache, body ache, and occasionally vomiting.\n   High fever.\n   Mouth sores and blisters that spread the virus into the throat.\n   A progressive skin rash \n   Blindness commonly resulted when blisters formed near the eyes.");
			    break;
		case 10:tv1.setText("Typhoid fever is a bacterial infection caused by Salmonella typhi bacteria.In the begining stages, symptoms include fever, malaise, and stomach pain. As the disease progresses,the fever increases to over 103 degrees Fahrenheit and diarrhea begins. Eventually weakness and delirium develop,in some cases a rash appears on the chest and abdomen.This bacteria is spread by contaminated food or water. The bacteria live in the intestinal tracts of infected humans and can enter the food supply as a result of improper hand-washing. Bacteria may also enter the water supply in places where sewage is improperly treated. Typhoid bacteria can live in the intestines of healthy people who carry and spread the disease without ever experiencing symptoms.The most effective prevention method is proper hygiene and sanitation, but vaccines against the disease are also available.");
		        break;
		case 11: tv1.setText("Yellow fever is a viral infection transmitted by mosquitoes that carry the virus.Yellow fever symptoms usually appear three to six days after being bitten by an infected mosquito, and they develop in three stages. In the first stage, symptoms include fever, headache, muscle aches, vomiting, and jaundice. This lasts for three to four days before the second stage   remission   begins. During remission, the fever and other symptoms go away. Most people recover at this stage, but some move on to the third stage   intoxication. This stage is the most serious, and involves liver and kidney failure, bleeding disorders, delirium, coma, and seizures. Yellow fever that reaches this third stage is often fatal."+
				" Although individual symptoms can be treated, no effective treatments exist for the disease itself. A vaccine that effectively prevents yellow fever has been widely available since the 1950s.");
	            break;
		case 12: tv1.setText("Dengue  fever is a painful, debilitating mosquito-borne disease caused by any one of four closely related dengue viruses. These viruses are related to the viruses that cause West Nile infection and yellow fever. Dengue fever is transmitted by the bite of an Aedes mosquito infected with a dengue virus. The mosquito becomes infected when it bites a person with dengue virus in their blood. It can t be spread directly from one person to another person.\nSymptoms, which usually begin four to six days after infection and last for up to 10 days, may include\n 	Sudden, high fever, severe headaches\n 	Pain behind the eyes\n 	Severe joint and muscle pain\n 	Nausea\n 	Vomiting\n 	Skin rash\n 	Mild bleeding ");
	            break;        
		case 13: tv1.setText("Chickenpox is a common illness that causes an itchy rash and red spots or blisters (pox) all over the body. It is most common in childrenAfter you have had chickenpox, you aren't likely to get it again. But the virus stays in your body long after you get over the illness. If the virus becomes active again, it can cause a painful viral infection called shingles. Chickenpox is caused by the varicella-zoster virus. It can spread easily. You can get it from an infected person who sneezes, coughs, or shares food or drinks.\nFirst symptoms (14 to 16 days after contact).\n    Fever, Headache, Cough\n 	Decreased appetite\n 	Sore throat,Itchy  rash\nAfter a chickenpox red spot appears, it usually takes about 1 or 2 days for the spot to go through all its stages. This includes blistering, bursting, drying, and crusting over.");
                break;
		case 14: tv1.setText("Leptospirosis  is an infection caused by bacteria of the Leptospira type. Symptoms can range from none to mild such as headaches, muscle pains, and fevers. To severe with bleeding from the lungs or meningitis. If the infection causes the person to turn yellow, have kidney failure and bleeding.The symptoms of leptospirosis usually develop abruptly seven to 14 days after exposure to the leptospira bacteria.About 90% of leptospirosis infections only cause mild symptoms, including:\n 	a high temperature (fever) that is usually between 38 and 40 C (100.4-104 F)\n 	chills\n   sudden headaches\n 	nausea and vomiting\n 	loss of appetite\n 	 muscle pain, particularly affecting the muscles in the calves and lower back\n   conjunctivitis ,cough ,rash");
                break;
		case 15: tv1.setText("Jaundice can occur in babies, children, and adults. Jaundice is not an illness in itself, but a medical condition in which too much bilirubin -- a compound produced by the breakdown of hemoglobin from red blood cells -- is circulating in the blood. The excess bilirubin causes the skin, eyes, and mucus membranes in the mouth to turn a yellowish color. Because bilirubin is processed by the liver, the symptoms of jaundice may indicate damage to the liver in adults. If the cause is not treated, it can lead to liver failure.In newborn babies, though, jaundice is common because their liver is often slower to process bilirubin and because they have extra red blood cells that begin to break down soon after they are born. In otherwise healthy newborns, jaundice usually peaks at about three to five days of life and then begins to go away on its own.");
                break;
		case 16: tv1.setText("Bronchopneumonia is inflammation of the lungs, caused by infection from viruses, bacteria, or fungi. The infection causes inflammation in the alveoli  in the lungs, causing the alveoli to become filled with pus or fluid.There are two types of pneumonia: lobar and bronchial. Lobar pneumonia affects one or more sections, or lobes, or the lungs. Bronchopneumonia affects both lungs and the bronchi. Bronchopneumonia can be mild or severe.\nSymptoms of bronchopneumonia include:\n 	 fever\n   cough that brings up mucus\n   shortness of breath, chest pain\n   rapid breathing, sweating\n 	chills 	 headache\n   muscle aches\n   fatigue\n   confusion or delirium, especially in older people");
                break;        
		case 17: tv1.setText("Tuberculosis is a bacterial infection that can spread through the lymph nodes and bloodstream to any organ in your body. It is most often found in the lungs. Most people who are exposed to TB never develop symptoms because the bacteria can live in an inactive form in the body. But if the immune system weakens, such as in people with HIV or elderly adults, TB bacteria can become active. In their active state, TB bacteria cause death of tissue in the organs they infect. Active TB disease can be fatal if left untreated.Because the bacteria that cause tuberculosis are transmitted through the air, the disease can be contagious. People show no signs of infection and won't be able to spread the disease to others, unless their disease becomes active.Medication can help get rid of the inactive bacteria before they become active.");
                break;   
		case 18: tv1.setText("Whooping cough is a highly contagious respiratory tract infection. In many people, it's marked by a severe hacking cough followed by a high-pitched intake of breath that sounds like 'whoop'.Once you become infected with whooping cough, it can take one to three weeks for signs and symptoms to appear. \n 	Runny nose, Nasal congestion, Sneezing\n 	Red, watery eyes\n    mild fever\n    Dry cough\nAfter a week or two, signs and symptoms worsen. Severe and prolonged coughing attacks may:\n 	 Provoke vomiting\n 	 Result in a red or blue face\n    Cause extreme fatigue\n 	End with a high-pitched 'whoop' sound during the next breath of air");
                break; 
		case 19: tv1.setText("Angina pectoris is also known simply as chest pain. Angina can be described as a discomfort, heaviness, pressure, aching, burning, fullness, squeezing, or painful feeling due to coronary heart disease. Often, it can be mistaken for indigestion.Angina is usually felt in the chest, but may also be felt in the shoulders, arms, neck, throat, jaw, or back.Angina is caused when blood flow to an area of the heart is decreased, impairing the delivery of oxygen and vital nutrients to the heart muscle cells. When this happens, the heart muscle must use alternative, less efficient forms of fuel so that it can perform its function of pumping blood to the body. \nsymptoms:\n   sweating\n 	weakness\n   faintness\n   numbness or tingling\n   nausea");
                break;    
		case 20: tv1.setText("Asthma symptoms, which include coughing, wheezing, and chest tightness, are common in an asthma attack. Sometimes asthma is called bronchial asthma or reactive airway disease. Asthma can be controlled with proper treatment.Asthma is characterized by inflammation of the bronchial tubes with increased production of sticky secretions inside the tubes. People with asthma experience symptoms when the airways tighten, inflame, or fill with mucus.\nCommon asthma symptoms include:\n 	Coughing, especially at night\n   Wheezing\n   Shortness of breath\n 	 Chest tightness, pain, or pressure\nSome people with asthma may go for extended periods without having any symptoms, interrupted by periodic worsening of their symptoms called asthma attacks. ");
                break; 
		case 21: tv1.setText("Meningitis is an inflammation of the membranes surrounding your brain and spinal cord. Symptoms of this condition include headache, fever and a stiff neck.Viral meningitis may improve without treatment, but bacterial meningitis is serious, can come on very quickly and requires prompt antibiotic treatment to improve the chances of a recovery. Delaying treatment for bacterial meningitis increases the risk of permanent brain damage or death. In addition, bacterial meningitis can prove fatal in a matter of days.\nPossible symptoms include:\n   Sudden high fever\n   Severe headache that isn't easily confused with other types of headache\n 	Stiff neck\n 	Vomiting or nausea with headache\n   Confusion or difficulty concentrating\n   Seizures\n 	 Sleepiness or difficulty waking up\n 	Sensitivity to light");
                break; 
		case 22: tv1.setText("Nephritis essentially means inflammation of the kidney. Nephritis may involve the glomerulus, tubule, or the interstitial renal tissue.Nephrosis is a descriptive histopathological term for renal disease without an inflammatory component.Your symptoms will vary depending on the type of acute nephritis you have. The most common symptoms for all three types of acute nephritis are:\n 	pain in the pelvis\n 	pain or a burning sensation while urinating\n 	 frequent need to urinate\n 	 cloudy urine\n 	 blood or pus may be present in urine\n   pain in the kidney area and/or abdomen\n 	swelling in the body, commonly in the face, legs, and feet\n 	vomiting\n 	 fever\n   high blood pressure (glomerulonephritis)");
                break;
		case 23: tv1.setText("Lung cancer and smoking often, but not always, go hand in hand. As lung cancer stages advance, lung cancer symptoms include coughing, wheezing, shortness of breath, and bloody mucus.In its early stages, lung cancer normally has no symptoms. When symptoms start to appear, they are usually caused by blocked breathing passages or the spread of cancer further into the lungs and other parts of the body.\nCommonly found symptoms  include:\n   Chronic, hacking, raspy coughing, sometimes with blood-streaked mucus\n   Recurring respiratory infections, including bronchitis or pneumonia\n  Shortness of breath,wheezing,chest pain\n 	Hoarseness\n 	Swelling of the neck and face\n   Pain/weakness in shoulder, arm,or hand\n 	Fatigue, weakness, loss of appetite");
                break;
		case 24: tv1.setText("Brain cancer can have a wide variety of symptoms including seizures, sleepiness, confusion, and behavioral changes. Not all brain tumors are cancerous, and benign tumors can result in similar symptoms.\nThe following symptoms are most common:\n 	  Headache\n    Weakness\n 	  Clumsiness\n 	Difficulty walking\n 	Seizures\nOther nonspecific symptoms and signs include the following:\n    Altered mental status -- changes in concentration, memory, attention, or alertness\n 	Nausea, vomiting\n 	  Abnormalities in vision\n 	 Difficulty with speech\n 	Gradual changes in intellectual or emotional capacity");
                break;
		case 25: tv1.setText("Leukemia is an abnormal rise in the number of white blood cells. The white blood cells crowd out other blood cell elements such as red blood cells and platelets. The elevated white blood cells are immature and do not function properly.\nCommon Leukemia symptoms include:\n 	Anemia and related symptoms, such as fatigue, pallor, and a general feeling of illness.\n 	 A tendency to bruise or bleed easily, including bleeding from the gums or nose, or blood in the stool or urine.\n 	 Susceptibility to infections such as sore throat or bronchial pneumonia, which may be accompanied by headache, low-grade fever, mouth sores, or skin rash.\n 	Swollen lymph nodes, typically in the throat, armpits, or groin.\n 	  Loss of appetite and weight.\n 	  Discomfort under the left lower ribs).\n  Visual problems and stroke.");
                break;
		case 26: tv1.setText("Melanoma is  the most common and dangerous type of skin cancer. Malignant melanoma can be difficult to treat. Early diagnosis and treatment can increase the survival rate from melanoma.\nThe general warning signs of skin cancer include:\n 	 Any change in size, color, shape, or texture of a mole or other skin growth\n 	 An open or inflamed skin wound that won't heal\nMelanoma may appear as:\n 	 A change in an existing mole\n 	 A small, dark, multicolored spot with irregular borders -- either elevated or flat -- that may bleed and form a scab\n 	  A cluster of shiny, firm, dark bumps\n 	  A mole larger than a pencil eraser");
                break;
		case 27: tv1.setText("The prostate is a gland in the male reproductive system. It makes most of the semen that carries sperm. The walnut-sized gland is located beneath the bladder and surrounds the upper part of the urethra, the tube that carries urine from the bladder.Prostate cancer is usually a very slow growing cancer, often causing no symptoms until it is in an advanced stage. Most men with prostate cancer die of other causes, and many never know that they have the disease. But once prostate cancer begins to grow quickly or spreads outside the prostate, it is dangerous.There are often no early prostate cancer symptoms. Prostate cancer treatment includes surgery, chemotherapy, cryotherapy, hormonal therapy, and/or radiation. In some instances, doctors recommend 'watchful waiting.'");
                break;
		case 28: tv1.setText("Bladder cancer symptoms include painless blood in the urine or frequent and painful urination.The cause of bladder cancer is not known. Changes in the genetic material (DNA) of bladder cells may play a role. Chemicals in the environment and cigarette smoking also may play a role. And when the lining of the bladder is irritated for a long time, cell changes that lead to cancer may occur. \nThe most common symptoms of bladder cancer include:\n     Blood or blood clots in the urine (hematuria). \n 	 Pain during urination (dysuria).\n     Urinating small amounts frequently.\n 	 Frequent urinary tract infections (UTIs).");
                break;
		case 29:tv1.setText("A heartattack is permanent damage to the heart muscle. The heart muscle requires a constant supply of oxygen-rich blood to nourish it. The coronary arteries provide the heart with this critical blood supply. If you have coronary artery disease, those arteries become narrow and blood cannot flow as well as they should. The plaque deposits are hard on the outside and soft and mushy on the inside.\nSymptoms of a heart attack include:\n 	Discomfort, pressure, heaviness, or pain in the chest, arm\n 	 Discomfort radiating to the back, jaw, throat, or arm\n 	Fullness, indigestion, or choking feeling \n 	 Sweating, nausea, vomiting, or dizziness\n 	  Extreme weakness, anxiety, or shortness of breath\n 	Rapid or irregular heartbeats");
		        break;
		case 30: tv1.setText("Coronary artery disease, also called coronary heart disease is a result of plaque build up in your arteries, which heightens the risk for heart attack and stroke.The heart becomes starved of oxygen and the vital nutrients it needs to pump properly.The most common symptom of coronary artery disease is angina, or chest pain. Angina can be described as a heaviness, pressure, aching, burning, numbness, fullness, squeezing or painful feeling. Angina is usually felt in the chest, but may also be felt in the left shoulder, arms, neck, back, or jaw.\nOther symptoms include:\n 	 Shortness of breath\n    Palpitations (irregular/skipped heart beats)\n 	A faster heartbeat\n 	  Weakness or dizziness\n   Nausea\n 	 Sweating");
		        break;
		case 31: tv1.setText("An irregular heartbeat is called an arrhythmia, which is not the same as an irregular heart rate. In fact, the two don't necessarily occur together.A normal heart rate is 50 to 100 beats per minute. Arrhythmias can occur with a normal heart rate, or with heart rates that are slow or rapid.\nArrhythmias may be caused by many different factors, including:\n 	 Coronary artery disease.\n 	 Electrolyte imbalances in your blood (such as sodium or potassium).\n 	 Changes in your heart muscle.\n     Injury from a heart attack.\n 	 Healing process after heart surgery.");
		        break;
		case 32: tv1.setText("Congenital heart disease is a category of heart disease that includes abnormalities in cardiovascular structures that occur before birth.\nIn the majority of people, the cause of congenital heart disease is unknown. However, there are some factors that are associated with an increased chance of having congenital heart disease. \nThese risk factors include:\n 	Genetic or chromosomal abnormalities in the child, such as Down syndrome\n 	 Taking certain medications or alcohol or drug abuse duringpregnancy\n 	 Maternal viral infection, such as rubella (German measles) in the first trimester of pregnancy\nThe risk of having a child with congenital heart disease may double if a parent or a sibling has a congenital heart defect.");
                break;
		case 33: tv1.setText("Cardiomyopathy, or heart muscle disease, is a type of progressive heart disease in which the heart is abnormally enlarged, thickened, and/or stiffened. As a result, the heart muscle's ability to pump blood is weakened, often causing heart failure and the backup of blood into the lungs or rest of the body.\nSymptoms include:\n 	Heart failure symptoms (shortness of breath and fatigue).\n 	Swelling of the lower extremities.\n 	Fatigue(feeling overly tired).\n 	Weight gain.\n 	Fainting \n 	Palpitations (fluttering in the chest)\n 	Dizziness or light headedness\n 	Stroke\n 	Chest pain or pressure.\n 	 Sudden death.");
                break;
		case 34: tv1.setText("Vascular disease (blood vessel disease) Vascular disease includes any condition that affects the circulatory system. As the heart beats, it pumps blood through a system of blood vessels called the circulatory system. The vessels are elastic tubes that carry blood to every part of the body. Arteries carry blood away from the heart while veins return it.Vascular disease ranges from diseases of your arteries, veins, and lymph vessels to blood disorders that affect circulation. The following are conditions that fall under the category of vascular disease.");
                break;
		case 35: tv1.setText("Like the blood vessels of the heart (coronary arteries), your peripheral arteries (blood vessels outside your heart) also may develop atherosclerosis, the build-up of fat and cholesterol deposits, called plaque, on the inside walls. Over time, the build-up narrows the artery. Eventually the narrowed artery causes less blood to flow and a condition called 'ischemia' can occur. Ischemia is inadequate blood flow to the body's tissue.\nIt can cause problems such as:\n 	  Chest pain (angina) or heart attack.\n 	Transient ischemic attack (TIA) or stroke.\n 	Leg pain, cramps, changes in skin color, sores or ulcers, Gangrene and loss of a limb.\n 	  Uncontrolled hypertension, heart failure, and abnormal kidney function.");
                break;
		case 36: tv1.setText("An aneurysm is an abnormal bulge in the wall of an artery. Normally, the walls of arteries are thick and muscular, allowing them to withstand a large amount of pressure. Occasionally, however, a weak area develops in the wall of an artery. This allows the pressure within the artery to push outwards, creating a bulge or ballooned area called an 'aneurysm'.Aneurysms can form in any blood vessel, but they occur most commonly in the aorta. \nAortic aneurysms may be caused by:\n 	Atherosclerosis, or hardening of the arteries, which weakens arterial walls\n 	Hypertension (high blood pressure)\n 	Local injury to the artery\n 	Congenital abnormality.\n 	Syphilis used to be a common cause of thoracic aneurysms, but it is no longer as common.");
                break;
		case 37: tv1.setText("A stroke is a medical emergency. Prompt treatment is essential as the sooner treatment is received, the less damage is likely to occur.A stroke occurs when the brain's blood supply is blocked or interrupted   for example, by a blood clot, where the blood thickens and becomes solid. This is the most common cause of stroke.The main symptoms of a stroke can be remembered using the acronym FAST, which stands for Face-Arms-Speech-Time. Each symptom is explained below.\n 	Face   the person's face may have fallen on one side, they may be unable to smile, or their mouth or eye may have drooped\n 	Arms   they may be unable to raise both arms and keep them there due to weakness or numbness\n 	 Speech   they may have slurred speech");
                break;
		case 38: tv1.setText("A TIA or 'mini-stroke' is caused by temporary disruption in the blood supply to part of the brain. This results in a lack of oxygen to the brain.This can cause symptoms that are similar to a stroke, although they tend to last for a short time (less than 24 hours).A TIA should be taken seriously, as it's an early warning sign of further TIAs or a stroke. If you or someone you know has had a TIA, you should contact your GP, local hospital or out-of-hours service immediately to arrange for a specialist assessment.");
                break;         
		case 39: tv1.setText("A subarachnoid haemorrhage is a medical emergency that requires immediate medical treatment to prevent serious complications, brain damage and death. It occurs when blood leaks from blood vessels onto the surface of the brain.The bleeding occurs in the arteries that run underneath a membrane in the brain known as the arachnoid, which is located just below the surface of the skull.Three quarters of all subarachnoid haemorrhages are the result of an aneurysm rupturing (bursting). An aneurysm is a bulge in a blood vessel caused by a weakness in the blood vessel wall.\nOther causes of a subarachnoid haemorrhage include:\n     severe head injury \n 	 arteriovenous malformations   a rare type of birth defect that affects normal blood vessel formation");
                break; 
		case 40: tv1.setText("Vascular dementia is a common form of dementia.The term 'dementia' describes a loss of mental ability associated with gradual death of brain cells.It is caused by reduced blood flow to the brain as a result of a problem with the blood vessels that supply it. Parts of the brain become damaged and eventually die from a lack of oxygen and nutrients");
                break; 
		}         
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

	


