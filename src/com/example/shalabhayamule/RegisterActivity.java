package com.example.shalabhayamule;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends Activity {
	
	
	 EditText first;
	 EditText last;
	 EditText email;
	 EditText mobile;
	 EditText pass;
	 EditText confpass;
       TextView fname, lname, tmail, tmono, tpass, tconpass;
       Button save, cancel;
       DatabaseHandler db;
   
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_register);
	      
	       first= (EditText)findViewById(R.id.editfirstname);
           last =(EditText)findViewById(R.id.editlastname);
           email=(EditText)findViewById(R.id.editemail);
           mobile =(EditText)findViewById(R.id.editmobileno);
           pass=(EditText)findViewById(R.id.editpassword);
           confpass=(EditText)findViewById(R.id.editconfirmpassword);
           save=(Button)findViewById(R.id.btnsave);
           cancel=(Button)findViewById(R.id.btncancel);
           
           fname = (TextView)findViewById(R.id.editfirstname); 
	       lname = (TextView)findViewById(R.id.textLastName);
	       tmail = (TextView)findViewById(R.id.txttextemail);
	       tmono = (TextView)findViewById(R.id.txttextmobileno);
	       tpass = (TextView)findViewById(R.id.textpassword);
	       tconpass = (TextView)findViewById(R.id.textconformpassword);
	       
	       
	       save.setOnClickListener(new OnClickListener() {
               
               @Override
               public void onClick(View arg0) {
                     // TODO Auto-generated method stub
                    
               String edfirst = first.getText().toString();
               String edlast = last.getText().toString();
               String edemail = email.getText().toString();
               String edmobile = mobile.getText().toString();
               String edpass = pass.getText().toString();
               String edConf = confpass.getText().toString();
              
               if(edConf.equals(edpass) ){
                    
                    
                     db = new DatabaseHandler(RegisterActivity.this, null, null, 2);
                     RegisterData reg = new RegisterData();
                    
                     reg.setfirstName(edfirst);
                     reg.setlastName(edlast);
                     reg.setEmailId(edemail);
                     reg.setMobNo(edmobile);
                     reg.setPassword(edpass);
                     db.addregister(reg);
                    
                     Toast.makeText(getApplicationContext(), "Registered", Toast.LENGTH_LONG).show();
                     startActivity(new Intent(getApplicationContext(), LoginActivity.class));
               }
               else{
                    
                     Toast.makeText(getApplicationContext(), "Password doesn't match", Toast.LENGTH_LONG).show();
                     pass.setText("");
                     confpass.setText("");
               }
               }
        });
 }

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		Intent m =  new Intent(RegisterActivity.this, MainActivity.class);
		startActivity(m);
	}
	
	      
	}


