package com.williams.williamshwk7;

//import com.williams.williamshwk7.SplashScreen.HomeScreenActivator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends Activity {
	int Manage_assignment_request_code = 1,
			Retrieve_assignment = 2,
			Configure_preference = 3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homescreen);
	
final Button ManageButton = (Button) findViewById(R.id.ManageButton);

ManageButton.setOnClickListener(new Button.OnClickListener(){
	
	public void onClick(View v){
		try{
			startActivityForResult(new Intent(v.getContext(), ManageAssignment.class),Manage_assignment_request_code);
		}catch (Exception e){
			
		}
	}
});
final Button ConfigButton = (Button) findViewById(R.id.ConfigButton);

ConfigButton.setOnClickListener(new Button.OnClickListener(){
	
	public void onClick(View v){
		try{
			startActivityForResult(new Intent(v.getContext(), ManageAssignment.class),Configure_preference);
		}catch (Exception e){
			
		}
	}
});
final Button RetrieveButton = (Button) findViewById(R.id.RetrieveButton);

RetrieveButton.setOnClickListener(new Button.OnClickListener(){
	
	public void onClick(View v){
		try{
			startActivityForResult(new Intent(v.getContext(), Retrieve.class),Retrieve_assignment);
			
		}catch (Exception e){
			
		}
	}
});


}

}

	
