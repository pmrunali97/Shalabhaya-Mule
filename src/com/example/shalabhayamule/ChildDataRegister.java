package com.example.shalabhayamule;

import android.app.Activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;



import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager.OnActivityResultListener;
import android.provider.MediaStore;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 
 * @uther Mrunali Pawar
 * 
 */
public class ChildDataRegister extends Activity {
	
	
	  RadioGroup gender;
	  RadioButton maleradio, femaleradio;
	  
	  ArrayAdapter<String> ad;
		//final CharSequence[] str;
	String[] str={"Take Photo","Choose from Library","Cancle"};
	
	SQLiteDatabase db;
	  
	  Button submit;
	  ImageView setPic;
	  
	  EditText et1, et2, et3, et4, et5,et6, et7, et8, et9;
	  DatePicker d1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.register_child_data);
		
		et1= (EditText)findViewById(R.id.childfirstname);
		et2= (EditText)findViewById(R.id.childlastname);
		et3= (EditText)findViewById(R.id.childcurrentadd);
		et4= (EditText)findViewById(R.id.childfathername);
		et5= (EditText)findViewById(R.id.childmobileno);
		et6= (EditText)findViewById(R.id.childage);
		et7= (EditText)findViewById(R.id.childmothername);
		et8= (EditText)findViewById(R.id.childpermanentadd);
		et9= (EditText)findViewById(R.id.childsituation);
		
		d1 = (DatePicker)findViewById(R.id.datePicker1);
		
		gender=(RadioGroup)findViewById(R.id.genderradioGroup);
        
        maleradio = (RadioButton)findViewById(R.id.btnmale);
        femaleradio = (RadioButton)findViewById(R.id.btnfemale);
        
        setPic = (ImageView)findViewById(R.id.childpic);
        submit = (Button)findViewById(R.id.datasubmitbutton);
        
        
        db=openOrCreateDatabase("childinformation", Context.MODE_PRIVATE, null);
		db.execSQL("CREATE TABLE IF NOT EXISTS childrensdata(FirstName VARCHAR, LastName VARCHAR, MotherName VARCHAR, FatherName VARCHAR, CurrentAddress VARCHAR,PermanentAddress VARCHAR,Contactno INTEGER,Age INTEGER, Situation VARCHAR);");

		ad=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,str);
        
		et1.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View arg0, MotionEvent arg1) {
				// TODO Auto-generated method stub
				et1.setText(" ");
				
				return false;
			}
		});
		
et2.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View arg0, MotionEvent arg1) {
				// TODO Auto-generated method stub
				et2.setText(" ");
				
				return false;
			}
		});
et3.setOnTouchListener(new View.OnTouchListener() {
	
	@Override
	public boolean onTouch(View arg0, MotionEvent arg1) {
		// TODO Auto-generated method stub
		et3.setText(" ");
		
		return false;
	}
});
et4.setOnTouchListener(new View.OnTouchListener() {
	
	@Override
	public boolean onTouch(View arg0, MotionEvent arg1) {
		// TODO Auto-generated method stub
		et4.setText(" ");
		
		return false;
	}
});
et5.setOnTouchListener(new View.OnTouchListener() {
	
	@Override
	public boolean onTouch(View arg0, MotionEvent arg1) {
		// TODO Auto-generated method stub
		et5.setText(" ");
		
		return false;
	}
});
et6.setOnTouchListener(new View.OnTouchListener() {
	
	@Override
	public boolean onTouch(View arg0, MotionEvent arg1) {
		// TODO Auto-generated method stub
		et6.setText(" ");
		
		return false;
	}
});

et7.setOnTouchListener(new View.OnTouchListener() {
	
	@Override
	public boolean onTouch(View arg0, MotionEvent arg1) {
		// TODO Auto-generated method stub
		et7.setText(" ");
		
		return false;
	}
});
et8.setOnTouchListener(new View.OnTouchListener() {
	
	@Override
	public boolean onTouch(View arg0, MotionEvent arg1) {
		// TODO Auto-generated method stub
		et8.setText(" ");
		
		return false;
	}
});

et9.setOnTouchListener(new View.OnTouchListener() {
	
	@Override
	public boolean onTouch(View arg0, MotionEvent arg1) {
		// TODO Auto-generated method stub
		et9.setText(" ");
		
		return false;
	}
});
        
        submit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				// TODO Auto-generated method stub
				if(v==submit)
				{
					if(et1.getText().toString().trim().length()==0||
							et2.getText().toString().trim().length()==0||
							et3.getText().toString().trim().length()==0 ||
							et4.getText().toString().trim().length()==0 ||
							et5.getText().toString().trim().length()==0)
					{
						showMessage("Error", "Please enter all values");
						return;
					}
					db.execSQL("INSERT INTO childrensdata VALUES('"+et1.getText()+"','"+et2.getText()+
							"','"+et3.getText()+"', '"+et4.getText()+"', '"+
							et5.getText()+"', '"+et6.getText()+"', '"+et7.getText()+"', '"
							+et8.getText()+"','"+et9.getText()+"');");
					//showMessage("Success", "Records added");
					Toast.makeText(getApplicationContext(), "Records saved Successfully", 8000).show();
					clearText();
				}
				Intent i = new Intent(ChildDataRegister.this,OptionsScreen.class);
				startActivity(i);
			}
			
		});
        
        
    
        
        setPic.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Toast.makeText(getApplicationContext(), "presses",2000).show();
				final Dialog dialog=new Dialog(ChildDataRegister.this);
				dialog.setContentView(R.layout.dialog);
				dialog.setTitle(" Add Photo");
				ListView lv=(ListView)dialog.findViewById(R.id.listView1);
				lv.setAdapter(ad);
				
				lv.setOnItemClickListener(new OnItemClickListener() {

					@Override
					public void onItemClick(AdapterView<?> parent, View view, int position,
							long id) {
						// TODO Auto-generated method stub
					switch (position) {
					case 0:
						Intent i=new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
						startActivityForResult(i,0);

						dialog.dismiss();
						
						break;
					case 1:
						Intent i2=new Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
						startActivityForResult(i2,1);
						dialog.dismiss();
						break;
					case 2:
						
						dialog.dismiss();
						break;

					default:
						break;
					}
						
					}
				});

				dialog.show();
			}
			
        });
	}
		
		
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		
		super.onActivityResult(requestCode,resultCode,data);
		if(requestCode==0)
		{
			Bitmap bp=(Bitmap)data.getExtras().get("data");
			setPic.setImageBitmap(bp);
		}
		if(requestCode==1)
		{
			Uri image=data.getData();
			setPic.setImageURI(image);
		}
	
	}
	
	public void showMessage(String title,String message)
	{
		Builder builder=new Builder(this);
		builder.setCancelable(true);
		builder.setTitle(title);
		builder.setMessage(message);
		builder.show();
	}
	public void clearText()
	{
		et1.setText("");
		et2.setText("");
		et3.setText("");
		et4.setText("");
		et5.setText("");
		et6.setText("");
		et7.setText("");
		et8.setText("");
		et9.setText("");
		et1.requestFocus();
	}
        
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		Intent m =  new Intent(ChildDataRegister.this, OptionsScreen.class);
		startActivity(m);
	}  
    	
}      
	


