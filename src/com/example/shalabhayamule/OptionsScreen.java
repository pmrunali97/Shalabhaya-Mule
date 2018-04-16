package com.example.shalabhayamule;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OptionsScreen extends Activity {

	
	Button b1,b2,b3,b4,b5,b6;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_options);
		
		b1 = (Button)findViewById(R.id.b1);
		b2 = (Button)findViewById(R.id.b2);
		b3 = (Button)findViewById(R.id.b3);
		b4 = (Button)findViewById(R.id.b4);
		b5 = (Button)findViewById(R.id.b5);
		b6 = (Button)findViewById(R.id.b6);
		
		
		

		b1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(OptionsScreen.this, Home.class);
				startActivity(i);
			}
		});

		b2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(OptionsScreen.this, ChildDataRegister.class);
				startActivity(i);
			}
		});

		b3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(OptionsScreen.this,AboutDeveloperScreeen.class);
				startActivity(i);

			}
		});

		b4.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(OptionsScreen.this, ContactScreen.class);
				startActivity(i);
			}
		});

		b5.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(OptionsScreen.this, MyProfileScreen.class);
				startActivity(i);
			}
		});
		b6.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent i=new Intent(OptionsScreen.this, ShareScreen.class);
				startActivity(i);
			}
		});


	}


}
