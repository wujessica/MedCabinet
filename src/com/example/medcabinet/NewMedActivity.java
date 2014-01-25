package com.example.medcabinet;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class NewMedActivity extends Activity {
	
	private String medName;
	private int dose;
	private int totalMeds = 0;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_med);
		Intent intent = getIntent();
		
	}
	
	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display_message, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	} 
	
	public void onSave (View view) {
		//Stores total amount of medicines inputed 
		totalMeds++;
		
		//Saves the inputed crap
		EditText editText = (EditText) findViewById(R.id.medication_name);
		medName = editText.getText().toString();
		
		EditText editText1 = (EditText) findViewById(R.id.medication_dose);
		dose = Integer.parseInt(editText1.getText().toString());
		
		//EditText editText2 = (EditText) findViewById(R.id.medication_frequency)
		
		
		//Saves into shared preferences
		SharedPreferences medicationInfo = getSharedPreferences(MedListActivity.NAME, 0);
		SharedPreferences.Editor editor = medicationInfo.edit();
		
		editor.putString(MedListActivity.MEDICINE_NAME, medName);
		editor.putInt(MedListActivity.MEDICINE_DOSE, dose);
		editor.commit();
		
//		for (int i = 0; i < 10; i++) {
//			editor.putString(MedListActivity.MEDICINE_NAME + i, medName);
//			editor.putInt(MedListActivity.MEDICINE_DOSE + i, dose);
//			editor.commit();
//		}
		
		
	}

}
