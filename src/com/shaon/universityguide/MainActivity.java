package com.shaon.universityguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button pub,pri,cr;
		
		pub=(Button) findViewById(R.id.button1);
		pri=(Button) findViewById(R.id.button2);
		cr=(Button) findViewById(R.id.button3);
		
		
		pub.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(MainActivity.this,Publist.class));
				// TODO Auto-generated method stub
				
			}
		});
		
		pri.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(MainActivity.this,Prilist.class));
				// TODO Auto-generated method stub
				
			}
		});
		
cr.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(MainActivity.this,Cr.class));
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
	}

	 

}
