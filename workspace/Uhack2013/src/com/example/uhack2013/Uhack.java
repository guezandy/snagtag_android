package com.example.uhack2013;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class Uhack extends Activity {
	private Handler handler;
	private TextView tv1;
	
	public Uhack() {
		handler=null;
		tv1=null;
	}
	public Uhack(TextView t){
		tv1=t;
		handler = new Handler();
	}
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		tv1 = new TextView(this);
		tv1.append("Y esto sigue!!");
		setContentView(tv1);
		handler.removeCallbacks(update);
		handler.postDelayed(update, 50);
		
	}
	private Runnable update = new Runnable() {
		public void run() {
			tv1.append("uno mas!");
			handler.removeCallbacks(update);
			handler.postDelayed(this, 10*1000);
		}
	};
}