	package com.example.pocketcloset;
	import android.app.Activity;
	import android.content.Intent;
	import android.os.Bundle;
	import android.view.View;
	import android.view.View.OnClickListener;
	import android.widget.Button;
	//import android.widget.TextView;
	
public class WelcomePage extends Activity implements OnClickListener {
		Bundle myValues;
		private Button toCloset;
		private Button toScan;
		@Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.welcome);
	        myValues=getIntent().getExtras();
	        setupOnClickListeners();
	    }
		
		private void setupOnClickListeners() {
			toScan=(Button)findViewById(R.id.scannewbutton);
			toScan.setOnClickListener(this);
			toCloset=(Button)findViewById(R.id.gotoClosetbutton);
			toCloset.setOnClickListener(this);
		}
			Intent Intent1;
			Intent Intent2;

		@Override
		public void onClick(View v) {
			switch (v.getId())
			{
			case R.id.gotoClosetbutton:
				Intent1 = new Intent(WelcomePage.this, MyCloset.class);
				break;
			case R.id.scannewbutton:
				Intent2 = new Intent(WelcomePage.this, Scan.class);
				break;
			}
		}
	}
