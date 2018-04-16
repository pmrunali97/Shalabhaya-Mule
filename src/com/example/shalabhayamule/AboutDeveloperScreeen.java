package com.example.shalabhayamule;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


/**
 * 
 * @uther Mrunali Pawar
 * 
 */
public class AboutDeveloperScreeen extends Activity {
	
	
	TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11, t12;
	ImageButton b1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.about_developers);
		
		t1 = (TextView)findViewById(R.id.textView1);

		t2 = (TextView)findViewById(R.id.textView2);

		t3 = (TextView)findViewById(R.id.textView3);

		t4 = (TextView)findViewById(R.id.textView4);

		t5 = (TextView)findViewById(R.id.textDetails);

		t6 = (TextView)findViewById(R.id.textgmail);

		t7 = (TextView)findViewById(R.id.textName);
		
		t12 = (TextView)findViewById(R.id.textName1);

		t8 = (TextView)findViewById(R.id.textSuggestions);

		t9 = (TextView)findViewById(R.id.textVersion);

		t10 = (TextView)findViewById(R.id.textCreate);

		t11 = (TextView)findViewById(R.id.textabout);
		
		
		b1 = (ImageButton)findViewById(R.id.back);

		b1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				Intent b = new Intent(AboutDeveloperScreeen.this,OptionsScreen.class);
				startActivity(b);
			}
		});
	}

	}


