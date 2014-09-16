package com.example.uhack2013;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView tv = new TextView(this);
		tv.append("Welcome to My first Android Application");
		setContentView(R.layout.activity_main);
		setContentView(tv);
		
		TextView tv1 = new TextView(this);
		tv1 = new TextView(this);
		tv1.append("Y esto sigue!!");
		setContentView(tv1);
		
		Uhack myUhack = new Uhack(tv);
		
		  final Button button = (Button) findViewById(R.id.button_id);
	         button.setOnClickListener(new View.OnClickListener() {
	             public void onClick(View v) {
	                 // Perform action on click
	             }
	         });
	}

	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
