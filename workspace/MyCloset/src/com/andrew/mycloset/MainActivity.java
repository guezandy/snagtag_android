package com.andrew.mycloset;

import com.andrew.mycloset.R;
import com.andrew.mycloset.ScanScreen;
import com.andrew.mycloset.ClosetScreen;
import com.kinvey.android.*;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	Bundle myValues;
	private Button toCloset;
	private Button toScan;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		System.out.println("launched main");
		startUpScreen();
		System.out.println("function executed");
	}

	private void startUpScreen() {
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
			System.out.println("Got to closet");
			Intent1 = new Intent(MainActivity.this, ClosetScreen.class);
			startActivity(Intent1);
			break;
		case R.id.scannewbutton:
			System.out.println("Got to scan");
			Intent2 = new Intent(MainActivity.this, ScanScreen.class);
			System.out.println("Intent defined");
			startActivity(Intent2);
			System.out.println("Case complete problem isn't in main");
			break;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
