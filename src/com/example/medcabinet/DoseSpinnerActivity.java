package com.example.medcabinet;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;

public class DoseSpinnerActivity extends Activity implements OnItemSelectedListener {
	
	public static String DOSE_UNIT;
	
	public void onItemSelected(AdapterView<?> parent, View view, 
            int pos, long id) {

		Spinner spinner = (Spinner) findViewById(R.id.dose_spinner);
		spinner.setOnItemSelectedListener(this);
		// Retrieve selected item
		DOSE_UNIT = (String) parent.getItemAtPosition(pos);
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }

}
