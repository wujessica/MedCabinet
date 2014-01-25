package com.example.medcabinet;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MedListActivity extends Activity {

	public static final String NAME = "NameFile";
	public static final int TOTAL_MEDICATIONS = 0;
	
	public static final String MEDICINE_NAME = "nameKey";
	public static final String MEDICINE_DOSE = "dose";
	public static final String MEDICINE_DOSE_UNIT = "doseUnit";
	
//	public static String [] names = new String [10];
//    public static int [] doses = new int [10];
	public static String name;
	public static int dose;
	public static String doseUnit;
	
	SharedPreferences medicationInfo;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_med_list); 
		
		// Restore preferences
	    medicationInfo = getSharedPreferences(NAME, 0);
	    
	    name = medicationInfo.getString(MEDICINE_NAME, "No name");
	    dose = medicationInfo.getInt(MEDICINE_DOSE, 0);
	    doseUnit = medicationInfo.getString(MEDICINE_DOSE_UNIT,"");
	    
//	    for (int i = 0; i < 10; i++) {
//	    	names[i] = medicationInfo.getString(MEDICINE_NAME + i, "No name");
//	    	doses [i] = medicationInfo.getInt(MEDICINE_DOSE + i, 0);
//	    }
	     
		
	    //Display stored
		TextView textView = (TextView)findViewById(R.id.blah);
		textView.setTextSize(40);
		textView.setText(name + " " + dose + " " + doseUnit);
		
		
		
//		for (int i = 0; i < 10; i++) {
//			if (!names[i].equals("No name")&& doses[i]!=0) {
//				textView.setText (names[i]);
//				textView.setText (doses[i]);
//				setContentView(textView);
//			}
//		}
			
		
	}
}
