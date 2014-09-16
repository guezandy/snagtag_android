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

public class MyCloset extends Activity {
	
	private EditText uName;
	private EditText uPass;
	private Button loginBtn;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.closet_main);
        runit();
    }
	
	public void runit() {
		//do stufffffff!!!!!!
	}
}