package com.example.shalabhayamule;


import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
public class LoginActivity extends Activity {
	
	
	EditText user, pass;
    Button login, not_reg;
    DatabaseHandler db;
    RadioGroup r1;
    RadioButton userradio, adminradio;
    Cursor cursor;

                    @Override
                    protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_login);

                    r1=(RadioGroup)findViewById(R.id.radioGroup);
                    
                    userradio = (RadioButton)findViewById(R.id.btnuser);
                    adminradio = (RadioButton)findViewById(R.id.btnadmin);
                    user =(EditText)findViewById(R.id.eduser);
                    pass = (EditText)findViewById(R.id.edpass);
                    login =(Button)findViewById(R.id.btnlogin);
                    not_reg =(Button)findViewById(R.id.btnregister);
                   
                    login.setOnClickListener(new OnClickListener() {
                                   
                                    @Override
                                    public void onClick(View arg0) {
                                                    // TODO Auto-generated method stub
                                                    db=new DatabaseHandler(LoginActivity.this, null, null, 2);
                                    String username=user.getText().toString();
                                    String password= pass.getText().toString();
                                   
                                    String StoredPassword =db.getregister(username);
                                    if(password.equals(StoredPassword)){
                                                   
                                                    Toast.makeText(getApplicationContext(), StoredPassword+"Login Successfully", Toast.LENGTH_LONG).show();
                                                    Intent i = new Intent(LoginActivity.this, OptionsScreen.class);
                                                    startActivity(i);
                                                   
                                    }
                                    else{
                                                    Toast.makeText(getApplicationContext(), "Username/Password incorrect", Toast.LENGTH_LONG).show();
                                    user.setText("");
                                    pass.setText("");
                                    }
                                   
                                   
                                    }
                    });
                   
                    not_reg.setOnClickListener(new OnClickListener() {
                                   
                                    @Override
                                    public void onClick(View arg0) {
                                                    // TODO Auto-generated method stub
                                                   
                                    startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
                                    }
                    });
                   
                   
                   
                   

                    }
                   
                    /* @Override
                                    public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.action_settings, menu);
                            return super.onCreateOptionsMenu(menu);    
                           //
                     }
                     */
                      public boolean onOptionsItemSelected(MenuItem item) {
                            // Take appropriate action for each action item click
                            switch (item.getItemId()) {
                            case R.id.action_settings:
                                // search action
                                                      Intent i=new Intent(LoginActivity.this,RegisterActivity.class);
                                                                    startActivity(i);
                                return true;
                        }
                                                    return false;

                      }
    /*             @Override
                    protected void onResume() {
                                    // TODO Auto-generated method stub
                                     list = db.getAllRegister();
                    //            list=((alertv) alert).showAlert();
                                                    Customlist adapter = new Customlist(MainActivity.this, list);
                                    //            mylistview.setAdapter(adapter);
                                                   
                                                    if(adapter.getCount()!=0){
                                                          mylistview.setAdapter(adapter);
                                                   
                                                   
                                                    }else{
                                                         Toast.makeText(MainActivity.this, "No Items Available",Toast.LENGTH_SHORT).show();
                                                    }
                                    super.onResume();
                      }
*/
                      
                      @Override
                  	public void onBackPressed() {
                  		// TODO Auto-generated method stub
                  		super.onBackPressed();
                  		Intent m =  new Intent(LoginActivity.this, MainActivity.class);
                  		startActivity(m);
                  	}

}

	
	

