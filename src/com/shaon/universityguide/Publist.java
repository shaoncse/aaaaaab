package com.shaon.universityguide;

import android.app.Activity;
import android.app.LauncherActivity.ListItem;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Publist extends Activity {
	String pubname[]={"BUET","RUET","KUET","CUET","DU","JNU","JU","RU","KU","CU","BSMRSTU","SUST","JSTU","PUST","PSTU","SAU","BAU"};
	ListView list;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pub);
		
		list=(ListView) findViewById(R.id.listView1);
		
  list.setAdapter(new ArrayAdapter<String>(Publist.this,android.R.layout.simple_list_item_1,pubname));
	
		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				
					Toast.makeText(Publist.this,pubname[arg2]+" is selected  ",Toast.LENGTH_SHORT).show();
					Intent i=new Intent(Publist.this,Pubtwo.class);
					i.putExtra("name", pubname[arg2]);
					startActivity(i);
				}
		});
	}
	
	
	
	
}
  