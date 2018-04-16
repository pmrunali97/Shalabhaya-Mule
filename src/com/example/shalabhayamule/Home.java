package com.example.shalabhayamule;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * 
 * @uther Mrunali Pawar
 * 
 */
public class Home extends Activity {
	
	ImageView streetimg;
	TextView longText;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_home);
		
		
		streetimg = (ImageView)findViewById(R.id.streetpic);
		longText = (TextView)findViewById(R.id.longtext);
		
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		Intent m =  new Intent(Home.this, OptionsScreen.class);
		startActivity(m);
	}
}
