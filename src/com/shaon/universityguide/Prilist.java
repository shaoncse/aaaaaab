package com.shaon.universityguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class Prilist extends Activity{
	String pubname[]={"AUST","NSU","BRAC","AIUB","EASTWEST","UIU","IUB","STAMFORD","IUBAT","ASIAN","DIU","GREEN"};
	ListView list;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pri);
		
		list=(ListView) findViewById(R.id.listView1);
		
  list.setAdapter(new ArrayAdapter<String>(Prilist.this,android.R.layout.simple_list_item_1,pubname));
	
		list.setOnItemClickListener(new OnItemClickListener() {


			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				
					Toast.makeText(Prilist.this,pubname[arg2]+" is selected  ",Toast.LENGTH_SHORT).show();
					Intent i=new Intent(Prilist.this,Pritwo.class);
					i.putExtra("name", pubname[arg2]);
					startActivity(i);
			}
		});
	}
	
	
	
	
}
  
  
