package com.mc.app5;

import android.app.Activity;
import android.os.Bundle;

public class EndActivity extends Activity {
	
	public void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.end_page);
		
		Thread timer = new Thread() {
			public void run(){
				try{
					sleep(3000);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		timer.start(); 
		//finish();
		//System.exit(1);
	}
	
}
