package fi.sulautetut.android.BoxingClock;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;
import android.os.Handler;


public class MainActivity extends Activity {
	private Handler handler;
	private TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		tv = new TextView(this);
		tv.append("My Closet");
		setContentView(tv);
		
		handler = new Handler();
		handler.removeCallbacks(update);
		handler.postDelayed(update, 50);
	}
	private Runnable update = new Runnable() {
		public void run(){
			tv.append("Bling");
			handler.removeCallbacks(update);
			handler.postDelayed(this,10*1000);
		}
	};
}
