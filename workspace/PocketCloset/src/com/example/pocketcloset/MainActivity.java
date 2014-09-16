package com.example.pocketcloset;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.text.InputType;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	private EditText uName;
	private EditText uPass;
	private Button loginBtn;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//setUpViews();
	}/*
	@Override
	protected void onResume() {
		super.onResume();
		uName.setText("Enter User Name");
		uName.setTextColor(Color.parseColor("#888888"));
		uPass.setText("Enter Password");
		uPass.setInputType(InputType.TYPE_CLASS_TEXT);
		uPass.setTextColor(Color.parseColor("#888888"));
	}
	private void setUpViews() {
		uName=(EditText)findViewById(R.id.usrNameTxt);
		uPass=(EditText)findViewById(R.id.usrPassTxt);

		uName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				if(uName.getText().toString().equalsIgnoreCase("Enter User Name")){
					if(hasFocus){
						uName.setTextColor(Color.parseColor("#000000"));
						uName.setText("");
					}
				}
				else if(uName.getText().toString().equalsIgnoreCase("")){
					uName.setTextColor(Color.parseColor("#888888"));
					uName.setText("Enter User Name");
				}
			}
		});

		uPass.setOnFocusChangeListener(new View.OnFocusChangeListener(){
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				if(uPass.getText().toString().equalsIgnoreCase("Enter Password")){
					if(hasFocus){
						uPass.setInputType(InputType.TYPE_CLASS_TEXT| InputType.TYPE_TEXT_VARIATION_PASSWORD);
						uPass.setTextColor(Color.parseColor("#000000"));
						uPass.setText("");
					}
				}
				else if(uPass.getText().toString().equalsIgnoreCase("")){
					uPass.setInputType(InputType.TYPE_CLASS_TEXT);
					uPass.setTextColor(Color.parseColor("#888888"));
					uPass.setText("Enter Password");
				}
			}
		});
		
		loginBtn=(Button)findViewById(R.id.loginBtn);
		loginBtn.setFocusableInTouchMode(true);
		loginBtn.requestFocus();
		loginBtn.setOnClickListener(new OnClickListener() {
			private String pass;
			private String name;
			Intent myIntent;
			@Override
			public void onClick(View v) {
				name=uName.getText().toString();
				pass=uPass.getText().toString();
				if(name.equalsIgnoreCase("closet") && pass.equalsIgnoreCase("closet")){
					myIntent=new Intent(MainActivity.this,WelcomePage.class);
					System.out.println("---IF---");
				}
				else if(name.equalsIgnoreCase("closet")){
					myIntent=new Intent(MainActivity.this,ErrorPage.class);
					myIntent.putExtra("user", "ok");
					System.out.println("---ELSE IF---");
				}
				else{
					myIntent=new Intent(MainActivity.this,ErrorPage.class);
					System.out.println("---ELSEyooooo---");
				}
				//myIntent.putExtra("value", name);
				startActivity(myIntent);
				System.out.println("------We made it through the wilderness-----");
			}
		});
	}*/
	public void somethingFun(View view) {
		Intent intent = new Intent(this, WelcomePage.class);
		startActivity(intent);
	}
}
