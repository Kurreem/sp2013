package com.williams.williamshwk7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen);
	

	Handler h = new Handler();
	h.postDelayed(new HomeScreenActivator(), 5000);

}

	class HomeScreenActivator implements Runnable{
		
		public void run(){
			// fire up homescreen activator
			startActivity(new Intent(getApplication(), HomeScreen.class));
			//gets rid of splashScreen activity
			finish();
		}
	}
}