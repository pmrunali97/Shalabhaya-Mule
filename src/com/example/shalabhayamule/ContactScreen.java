package com.example.shalabhayamule;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


/**
 * 
 * @uther Mrunali Pawar
 * 
 */
public class ContactScreen extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_contact);
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		Intent m =  new Intent(ContactScreen.this, OptionsScreen.class);
		startActivity(m);
	}
}
