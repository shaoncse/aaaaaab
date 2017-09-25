package com.shaon.universityguide;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Pritwo extends Activity {

	
	
	protected void onCreate(Bundle savedInstanceState) {
		
		
		
		
		
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pritwo);
		
		
		Intent j=getIntent();
		String s=j.getStringExtra("name");
		
		TextView tx;
		Button inf,fa,lin,co;
		inf=(Button) findViewById(R.id.i);
		fa=(Button) findViewById(R.id.f);
		lin=(Button) findViewById(R.id.l);
		co=(Button) findViewById(R.id.c);
		tx=(TextView) findViewById(R.id.t);

		
		if(s.equals("AUST"))
		{
			
			inf.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tx;
					tx=(TextView) findViewById(R.id.t);
					tx.setText("Ahsanullah University of Science & Technology\r\n141 & 142, Love Road, Tejgaon Industrial Area, Dhaka-1208.\r\n\r\nTel. (8802) 8870422, Ext. 107, 114,\r\n\t Fax : (8802) 8870417-18\r\n\tEmail : info@aust.edu, regr@aust.edu");
				}
			}); 

			
               fa.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					TextView tx;
					tx=(TextView) findViewById(R.id.t);
					tx.setText("Faculty of Architecture and Planning\r\n\tDepartment of Architecture\r\n\tBachelor of Architecture (ARC)\r\n\tFaculty of Engineering\r\n\r\nDepartment of Electrical & Electronics Engineering\r\n\t Bachelor of Science in Electrical & Electronics Engineering (EEE)\r\n\tDepartment of Computer Science and Engineering\r\n\t Bachelor of Science in Computer Science and Engineering (CSE)\r\n\tDepartment of Civil Engineering\r\n\t Bachelor of Science in Civil Engineering (CE)\r\n\t Master of Science in Civil Engineering (Civil)\r\n\t Master of Science in Civil & Environmental Engineering\r\n\t Post Graduate Diploma (Civil)\r\n\tDepartment of Textile Engineering\r\n\t Bachelor of Science in Textile Engineering (TE)\r\n\tDepartment of Mechanical & Production Engineering\r\n\t Bachelor of Science in Mechanical Engineering (ME)\r\n\t Bachelor of Science in Industrial and Production Engineering (IPE)\r\n\tDepartment of Arts & Science\r\n\tMaster of Science in Mathematics\r\n\r\nFaculty of Business and Social Science\r\n\tSchool of Business\r\n\r\nBachelor of Business Administration\r\n\t Master of Business Administration (Regular) Master of Business Administration (Executive)\r\n\r\nFaculty of Education\r\n\tDepartment of Education\r\n\t Master of Education (M.Ed)\r\n\t Bachelor Degree in Primary Education (B.Ed. Primary)\r\n\t Bachelor Degree in Non-Formal Education (B.Ed. Non-Formal)\r\n\t");
					
				}
			});
                lin.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					Uri uri=Uri.parse("http://www.aust.edu");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
				}
			});
			
					
			
			
			
			co.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tx;
					tx=(TextView) findViewById(R.id.t);
					tx.setText("AUSTTTTTTTTT");
				}
				
			});
		
			tx.setText(s+": Ahsanullah University of Science and Technology (আহসানউল্লাহ্ বিজ্ঞান ও প্রযুক্তি বিশ্ববিদ্যালয়) (AUST) is a Private Technical University located in Dhaka, Bangladesh. This is one of the leading private universities in Bangladesh. The University was founded by the Dhaka Ahsania Mission in 1995. Dhaka Ahsania Mission is a non-profit voluntary organization in Bangladesh. The Mission was established in 1958 by Khan Bahadur Ahsanullah.It maintains close collaboration with the International Association of Universities (IAU), University Grants Commission (UGC), Bangladesh and many other National and International Education Institutions and Professional bodies. Ranking:World rank 9215");
		}
		
		if(s.equals("NSU"))
		{
			
			inf.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tx;
					tx=(TextView) findViewById(R.id.t);
					tx.setText("NSU");
				}
			}); 

			
               fa.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					TextView tx;
					tx=(TextView) findViewById(R.id.t);
					tx.setText("NSU");
					
				}
			});
                lin.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					Uri uri=Uri.parse("http://www.gsmarena.com/");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
					TextView tx;
					tx=(TextView) findViewById(R.id.t);
					tx.setText("naughtyuet egarite uthe jao");
				}
			});
			
					
			
			
			
			co.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tx;
					tx=(TextView) findViewById(R.id.t);
					tx.setText("nsu");
				}
			});
		}

		
			

		
	//else tx.setText(s);
			
}
}
