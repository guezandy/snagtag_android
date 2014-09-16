package com.example.pocketcloset;
	import android.app.Activity;
	import android.content.Intent;
	import android.os.Bundle;
	import android.view.View;
	import android.view.View.OnClickListener;
	import android.widget.Button;
	import android.widget.TextView;
	
	public class Scan extends Activity {
		
		@Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.scanning);
	        //setUpViews();
	    }
	/*	
		private void setUpViews() {
//ALOT TO DO!!!!
		
			toScan.setOnClickListener(new OnClickListener() {
				Intent myIntent;
				@Override
				public void onClick(View v) {
					myIntent=new Intent(WelcomePage.this,scan.class);
					System.out.println("---IF---");
				}
			});
		}
		*/
	}
