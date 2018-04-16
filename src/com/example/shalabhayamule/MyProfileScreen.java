package com.example.shalabhayamule;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MyProfileScreen extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.my_profile);
		
		
	}
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		Intent m =  new Intent(MyProfileScreen.this, OptionsScreen.class);
		startActivity(m);
	}

}
