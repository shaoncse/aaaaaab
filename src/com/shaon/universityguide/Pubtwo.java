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

public class Pubtwo extends Activity {

	
	
	protected void onCreate(Bundle savedInstanceState) {
		
		
		
		
		
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test);
		
		
		Intent j=getIntent();
		String s=j.getStringExtra("name");
		
		TextView tv;
		Button info,fac,link,com,mp;
		info=(Button) findViewById(R.id.info);
		fac=(Button) findViewById(R.id.fac);
		link=(Button) findViewById(R.id.link);
		com=(Button) findViewById(R.id.com);
		mp=(Button) findViewById(R.id.map);
		tv=(TextView) findViewById(R.id.textView1);

		
		if(s.equals("BUET"))
		{
			
			info.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("BUET  ,DHAKA-1000:\r\nBANGLADESH UNIVERSITY OF ENGINEERING AND TECHNOLOGY\r\n\r\npbax :(02)9665650-56,8614640-44\r\nfax:(02)8613046,9665622\r\nemail:vcoffice@vc.buet.ac.bd\r\nwebsite:www.buet.ac.bd\r\nvc:8652068,/7122   8651311,/7123\r\nregistrar :9665616,/7141   9665628,/7263\r\nassistant director(pub & info):9665622,/7493/7472 ");
				}
			}); 

			
               fac.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("Faculty of Architecture and Planning\r\n\tDept. of Architecture (Arch)\r\n\tDept. of Urban & Regional Planning (URP)\r\n\tDept. of Humanities (Hum)\r\n\r\nFaculty of Civil Engineering\r\n\tDept. of Civil Engineering (CE)\r\n\tDept. of Water Resources Engineering (WRE)\r\n\r\nFaculty of Electrical and Electronic Engineering\r\n\tDept. of Electrical & Electronic Engineering (EEE)\r\n\tDept. of Computer Science & Engineering (CSE)\r\n\tDept. of Biomedical Engineering\r\n\r\nFaculty of Engineering\r\n\tDept. of Chemical Engineering (Ch.E)\r\n\tDept. of Materials & \r\n\tDept. of Chemistry (Chem)Metallurgical Engineering (MME)\r\n\tDept. of Mathematics (Math)\r\n\tDept. of Physics (Phys)\r\n\tDept. of Petroleum & Mineral Resources Engineering (PMRE)\r\n\tDept. of Glass and Ceramics Engineering\r\n\r\nFaculty of Mechanical Engineering\r\n\tDept. of Mechanical Engineering (ME)\r\n\tDept. of Naval Architecture & Marine Engineering (NAME)\r\n\tDept. of Industrial & Production Engineering (IPE)");
					
				}
			});
                link.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					Uri uri=Uri.parse("http://www.buet.ac.bd");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
				}
			});
			
					
			
			
			
			com.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("Bangladesh University of Engineering and Technology,jahir raihan road ,dhaka 1000.\r\nবাংলাদেশ প্রকৌশল বিশ্ববিদ্যালয়, জহির রায়হান রোড, ঢাকা  ১000\r\nCoordinates:   23.726996°N, 90.392858°E");
				}
			});
			
			mp.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					Uri uri=Uri.parse("https://www.google.com.bd/maps/place/%E0%A6%AC%E0%A6%BE%E0%A6%82%E0%A6%B2%E0%A6%BE%E0%A6%A6%E0%A7%87%E0%A6%B6+%E0%A6%AA%E0%A7%8D%E0%A6%B0%E0%A6%95%E0%A7%8C%E0%A6%B6%E0%A6%B2+%E0%A6%AC%E0%A6%BF%E0%A6%B6%E0%A7%8D%E0%A6%AC%E0%A6%AC%E0%A6%BF%E0%A6%A6%E0%A7%8D%E0%A6%AF%E0%A6%BE%E0%A6%B2%E0%A6%AF%E0%A6%BC/@23.725599,90.392495,17z/data=!3m1!4b1!4m2!3m1!1s0x3755b8dd18d3706f:0x28da0995a424ee6f?hl=bn");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
				}
			});
			tv.setText((s)+" : Bangladesh University of Engineering and Technology (বাংলাদেশ প্রকৌশল বিশ্ববিদ্যালয়)\r\nBUET is a Public Engineering University in Bangladesh. It is the oldest Engineering institution in the region.n this institution, every year around 1000 students get enrolled in undergraduate and postgraduate programs to study engineering, architecture, and planning. In undergraduate admission test, only about top 17% students can get admitted among 8,000 selected candidates. The total number of teachers are about 500. The University has continued to expand over the last three decades. This includes the construction of new academic buildings, auditorium complex, halls of residence.\r\nThere are 5 Faculties and 18 Departments in BUET.\r\n\r\nEstablished	1876: Dhaka Survey School\r\n1912: Ahsanullah School of Engineering\r\n1947: Faculty of Engineering, University of Dhaka\n1962:EPUET\r\n1971: BUET\r\nType :	Public, Coeducational\r\nChancellor :	President of Bangladesh\r\nVice-Chancellor: Professor Khaleda Ekram\r\nAcademic staff :500\r\nStudents:5500\r\nLocation :	Bangladesh Dhaka, Bangladesh\r\nCampus	 : Urban, 76.85 acres (0.31 km²)\r\nNickname :	BUETWebsite	 :www.buet.ac.bd");
		}
		
		if(s.equals("RUET"))
		{
			
			info.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("RUET  ,RAJSHAHI-6204:\r\nRAJSHAHI UNIVERSITY OF ENGINEERING AND TECHNOLOGY\r\n\r\npbax :(0721) 750742-3,  751320-1\r\nfax:(0721) 750105\r\nemail:vicechancellor@ruet.ac.bd\r\nwebsite:www.ruet.ac.bd\r\nvc:750256. /103, 750345,\104\r\nregistrar :750798, 01711-403978\r\nPR Officer: 169, 01916-150450");
				}
			}); 

			
               fac.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("Faculty of Mechanical Engineering\r\n\tDept. of Industrial & Production Engineering (IPE)\r\n\tDept. of Glass & Ceramic Engineering (GCE):30\r\n\tDept. of Mechatronics Engineering (MTE);30\r\n\tDept. of Mechanical Engineering (ME);120\r\n\r\n Faculty of Civil Engineering\r\n\tDept. of Civil Engineering (CE)\r\n\tDept. of Chemistry (Chem)\r\n\tDept. of Mathematics (Math)\r\n\tDept. of Physics (Phy)\r\n\tDept. of Humanities (Hum)\r\n\r\nFaculty of Electrical and Computer Engineering\r\n\tDept. of Computer Science & Engineering \r\n\tDept. of Electrical and Electronic Engineering (EEE) \r\n\tDept. of Electronics and Telecommunication Engineering (ETE)\r\n\r\nFaculty of Architecture and Planning\r\n\tDept. of Urban & Regional Planning (URP)\r\n\tDept. of Architecture");
					
				}
			});
                link.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					Uri uri=Uri.parse("http://www.ruet.ac.bd");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
				}
			});
			
					
			
			
			
			com.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("Rajshahi University of Engineering & Technology, Kazla,Rajshahi-6204, Bangladesh\r\nরাজশাহী প্রকৌশল ও প্রযুক্তি বিশ্ববিদ্যালয়বীরশ্রেষ্ঠ  শহীদ ক্যাপ্টেন মহিউদ্দিন জাহাঙ্গীর স্মরণী রাজশাহী\r\n Coordinates: 24.3634972°N 88.628044°E");
				}
			});
mp.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					Uri uri=Uri.parse("https://www.google.com.bd/maps/place/%E0%A6%B0%E0%A6%BE%E0%A6%9C%E0%A6%B6%E0%A6%BE%E0%A6%B9%E0%A7%80+%E0%A6%AA%E0%A7%8D%E0%A6%B0%E0%A6%95%E0%A7%8C%E0%A6%B6%E0%A6%B2+%E0%A6%93+%E0%A6%AA%E0%A7%8D%E0%A6%B0%E0%A6%AF%E0%A7%81%E0%A6%95%E0%A7%8D%E0%A6%A4%E0%A6%BF+%E0%A6%AC%E0%A6%BF%E0%A6%B6%E0%A7%8D%E0%A6%AC%E0%A6%AC%E0%A6%BF%E0%A6%A6%E0%A7%8D%E0%A6%AF%E0%A6%BE%E0%A6%B2%E0%A6%AF%E0%A6%BC/@24.3686771,88.6265265,15z/data=!3m1!4b1!4m2!3m1!1s0x39fbefd0a55ea957:0x2f9cac3357d62617?hl=bn");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
				}
			});
		
			tv.setText((s)+" :Rajshahi University of Engineering & Technology (Bengali: রাজশাহী প্রকৌশল ও প্রযুক্তি বিশ্ববিদ্যালয় (Rajshahi Prokoushol o Projukti Bishshobiddalôe)) or RUET (Bengali : রুয়েট) formerly known as BIT Rajshahi, is the second oldest engineering university in Bangladesh. It was founded in 1964 as a faculty of Engineering under the University of Rajshahi.There are 4 Faculties and 14 Departments in RUET. It is now providing four years Bachelor degree in Civil Engineering, Electrical and Electronic Engineering, Electronics and Telecommunication Engineering, Mechanical Engineering, Industrial and Production Engineering, Computer Science and Engineering, Glass and Ceramic Engineering, Urbanization & Regional Planning Architecture,Mechatronics Engineering, . It is widely reputed as one of the best engineering universities in Bangladesh. About 2400[2] students are enrolled in Undergraduate and Postgraduate Engineering and Science with over 200[1] teachers. This university has a reputation for having a very good relationship between students and teachers. RUET has continued to expand with the construction of new academic buildings, auditorium complex, halls of residence, etc.\r\n\r\nEstablished   : 1964\r\nMotto	:Heaven's Light is Our Guide(ঐশী জ্যোতিই আমাদের পথ প্রদর্শক)\r\nType	      : Public\r\nChancellor	:  President Abdul Hamid\r\nVice-Chancellor:   Professor Dr Mohd. Rafiqul Alam Beg\r\nAcademic staff : 254 \r\nStudents : 2600 plus\r\nLocation : Rajshahi, Bangladesh\r\nCampus: Urban, 152 acres (0.61 km²)\r\nWebsite	 : www.ruet.ac.bd");
		
			
		}
		
		
		if(s.equals("KUET"))
		{
			
			info.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("KUET  ,KHULNA-9203:\r\nKHULNA UNIVERSITY OF ENGINEERING AND TECHNOLOGY\r\n\r\npbax :(041)769468-75\r\nfax:(041)774403\r\nemail:vc@kuet.ac.bd\r\nwebsite:www.kuet.ac.bd\r\nvc:(041) 774584, /111  774298\r\nregistrar :/113,2870038, 01714-087411\r\nPR Officer: 169, 01916-150450");
				}
			}); 

			
               fac.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("Faculty of Civil Engineering\r\n\tDepartment of Civil Engineering ( CE )\r\n\tDepartment of Urban and Regional Planning ( URP )\r\n\tDepartment of Building Engineering & Construction Management ( BECM)\r\n\tDepartment of Mathematics ( MATH )\r\n\tDepartment of Chemistry ( CH )\r\n\tDepartment of Physics ( PH )\r\n\tDepartment of Humanities ( HUM )\r\n\r\nFaculty of Electrical and Electronic Engineering\r\n\tDepartment of Electrical & Electronic Engineering ( EEE )\r\n\tDepartment of Computer Science & Engineering ( CSE )\r\n\tDepartment of Electronics & Communication Engineering ( ECE )\r\n\tDepartment of Biomedical Engineering ( BME )\r\n\r\nFaculty of Mechanical Engineering\r\n\tDepartment of Mechanical Engineering ( ME )\r\n\tDepartment of Industrial Engineering and Management ( IEM )\r\n\tDepartment of Leather Engineering ( LE )\r\n\tDepartment of Textile Engineering ( TE )\r\n\tDepartment of Energy  Technology ( ET )");
					
				}
			});
                link.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					Uri uri=Uri.parse("http://www.kuet.ac.bd");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
				}
			});
			
					
			
			
			
			com.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("Khulna University of Engineering & Technology (KUET), Khulna-9203\r\nখুলনা প্রকৌশল ও প্রযুক্তি বিশ্ববিদ্যালয় খুলনা 9203\r\nCoordinates:  22.8996895°N 89.5026112°E");
				}
			});
mp.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					Uri uri=Uri.parse("https://www.google.com.bd/maps/place/%E0%A6%96%E0%A7%81%E0%A6%B2%E0%A6%A8%E0%A6%BE+%E0%A6%AA%E0%A7%8D%E0%A6%B0%E0%A6%95%E0%A7%8C%E0%A6%B6%E0%A6%B2+%E0%A6%93+%E0%A6%AA%E0%A7%8D%E0%A6%B0%E0%A6%AF%E0%A7%81%E0%A6%95%E0%A7%8D%E0%A6%A4%E0%A6%BF+%E0%A6%AC%E0%A6%BF%E0%A6%B6%E0%A7%8D%E0%A6%AC%E0%A6%AC%E0%A6%BF%E0%A6%A6%E0%A7%8D%E0%A6%AF%E0%A6%BE%E0%A6%B2%E0%A6%AF%E0%A6%BC/@22.900471,89.501779,17z/data=!3m1!4b1!4m2!3m1!1s0x39ff9bda1d0ff6e5:0x123a926908efcd0c?hl=bn");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
				}
			});
		
			tv.setText(s+" :Khulna University of Engineering & Technology (খুলনা প্রকৌশল ও প্রযুক্তি বিশ্ববিদ্যালয়,কুয়েট), formerly BIT, Khulna, is one of the leading public universities of Bangladesh emphasizing education and research on engineering and technology.Primary focus of KUET is to offer undergraduate academic programs in engineering fields. It also offer post-graduate level degrees and conducts research in basic sciences along with advanced engineering fields. With over two hundred academic stuff it is engaged in teaching some three thousand local and few international students through sixteen academic departments within three faculties.The university has a 101-acre campus with academic buildings, auditorium complex, halls of residence, teachers dormitory and residences, laboratories, engineering workshops, administrative building, cafeteria, gymnasium and other facilities.\r\n\r\nFormer name:\r\nKhulna Engineering College (1967-1986)\r\nBangladesh Institute of Technology (BIT), Khulna (1986-2003)\r\nMotto	:Oh Lord! Bestow me with Knowledge(প্রভু আমায় জ্ঞান দাও)\r\nEstablished   : 1969, granted university status on 2003\r\nType   :   Public, Coeducational\r\nChancellor      :President of Bangladesh\r\nVice Chancellor	:Dr. Muhammed Alamgir\r\nAcademic staff  :202\r\nStudents	:3460 approx.\r\nUndergraduates	:2900 approxPostgraduates	:150 approx\r\nLocation	:Bangladesh Khulna, Bangladesh.\r\nCampus	        :Urban, 101 acres\r\nNickname	:KUET\r\nWebsite	www.kuet.ac.bd");
		
			
		}
		
		if(s.equals("CUET"))
		{
			
			info.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("CUET  ,CHITTAGONG:\r\nCHITTAGONG UNIVERSITY OF ENGINEERING AND TECHNOLOGY\r\n\r\npbax :(031)714911\r\nfax:(031)714910\r\nemail:registrar@cuet.ac.bd\r\nwebsite:www.cuet.ac.bd\r\nvc:714911, 714912\r\nregistrar :714946, 01711-884043\r\nPR Officer: /8101, 01673-764560");
				}
			}); 

			
               fac.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("Faculty of Electrical & Computer Engineering\r\n\tDept. of Electrical and Electronic Engineering\r\n\tDept. of Computer Science and Engineering\r\n\tDept. of Electronic & Telecommunication Engineering\r\n\r\nFaculty of Civil Engineering\r\n\tDept. of Civil Engineerin\r\n\tDept. of Disaster & Environmental Engineering\r\n\r\nFaculty of Mechanical Engineering\r\n\tDept. of Mechanical Engineering\r\n\tDept. of Petroleum & Mining Engineering\r\n\r\nFaculty of Architecture & Planning\r\n\tDept. of Architecture\r\n\tDept. of Urban & Regional Planning\r\n\tDept. of Humanities\r\n\r\nFaculty of Engineering & Technology\r\n\tDept. of Physics\r\n\tDept. of Mathematics\r\n\tDept. of Chemistry)");
					
				}
			});
                link.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					Uri uri=Uri.parse("http://www.www.cuet.ac.bd");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
				}
			});
			
					
			
			
			
			com.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("Chittagong University of Engineering and Technology (CUET),Kaptai Road C - Rangunia Highway,Chittagong - 4349\r\nCoordinates: 22°27′43.50″N 91°58′22.60″E");
				}
			});
mp.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					Uri uri=Uri.parse("https://www.google.com.bd/maps/place/%E0%A6%9A%E0%A6%9F%E0%A7%8D%E0%A6%9F%E0%A6%97%E0%A7%8D%E0%A6%B0%E0%A6%BE%E0%A6%AE+%E0%A6%AA%E0%A7%8D%E0%A6%B0%E0%A6%95%E0%A7%8C%E0%A6%B6%E0%A6%B2+%E0%A6%93+%E0%A6%AA%E0%A7%8D%E0%A6%B0%E0%A6%AF%E0%A7%81%E0%A6%95%E0%A7%8D%E0%A6%A4%E0%A6%BF+%E0%A6%AC%E0%A6%BF%E0%A6%B6%E0%A7%8D%E0%A6%AC%E0%A6%AC%E0%A6%BF%E0%A6%A6%E0%A7%8D%E0%A6%AF%E0%A6%BE%E0%A6%B2%E0%A6%AF%E0%A6%BC/@22.460023,91.971,17z/data=!3m1!4b1!4m2!3m1!1s0x30ad2fca34ae5549:0x35c88a37b3e90e97?hl=bn");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
				}
			});
			tv.setText(s+" :Chittagong University of Engineering and Technology (চট্টগ্রাম প্রকৌশল ও প্রযুক্তি বিশ্ববিদ্যালয় , চুয়েট), located in Chittagong, Bangladesh, is renowned as one of the most prominent and prestigious Public Engineering Universities of Bangladesh. The university maintains a special emphasis on Research.The university offers degrees in engineering disciplines in undergraduate and post-graduate levels and also conducts research and provides degrees in basic sciences in post-graduate level. There are 13 academic departments under five faculties emphasizing teaching and research of Engineering, Technology, Architecture and Planning.The university undertakes research works sponsored by local industries and national/international organizations, such as United Nations organizations, Commonwealth Foundation, University Grants Commission, Bangladesh Power Development Board, Bangladesh Road & Transport Corporation, Chittagong Development Authority, Bangladesh Telecommunications Company Limited etc.\r\n\r\nEstablished	1968: Engineering College, Chittagong\r\n1986: Bangladesh Institute of Technology, Chittagong\r\n2003: Chittagong University of Engineering & Technology\r\nType	:Public, Engineering\r\nChancellor      : President of Bangladesh\r\nVice-Chancellor : Professor Dr. Md. Jahangir Alam\r\nPro-Vice-Chancellor : Professor Dr. Md. Rafiqul Alam\r\nAcademic staff :309\r\nAdministrative staff :291\r\nStudents	: 2500+\r\nLocation        :Raozan, Chittagong, BangladeshBangladesh\r\nCampus	        :Sub-urban, 163 acres (0.66 km2)\r\nNickname	:CUET\r\nSporting affiliations:University Grants Commission, Institution of Engineers, Bangladesh\r\nWebsite	:www.cuet.ac.bd");
		}
		
		if(s.equals("DU"))
		{
			
			info.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("DHAKA UNIVERSITY :\r\n\r\npabx :(02)9661900-73\r\nfax:(02)8615583\r\nemail:vcoffice@du.ac.bd\r\nwebsite :www.univdhaka.edu\r\nvc :8618383,8613141\r\npro vc(education):9675192,9896588\r\nnpro vc(adminst) :8615147,8610699\r\nregistrar :8614150,9668828\r\ndirector(public relations):8613306,9661900/5100");
				}
			}); 

			
               fac.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("Faculty of Arts\r\n\t Department of Arabic\r\n\tDepartment of Bengali\r\n\tDepartment of English\r\n\t Department of Persian Language and Literature\r\n\t Department of History\r\n\t Department of Islamic Studies\r\n\t Department of Pali and Buddhist Studies\r\n\t Department of Sanskrit\r\n\t Department of Urdu\r\n\t Department of Theater and Performance Studies\r\n\t Department of Linguistics\r\n\t Department of Music\r\n\t Department of Islamic History and Culture\r\n\t Department of World Religions and Culture\r\n\t Department of Information Science and Library Management\r\n\r\nFaculty of Business Studies\r\n\t Department of Finance\r\n\t Department of Accounting and Information System (AIS)\r\n\t Department of Marketing\r\n\t Department of Management\r\n\t Department of Banking and Insurance\r\n\t Department of Management Information System (MIS)\r\n\t Department of International Business\r\n\t Department of Tourism and Hospitality Management\r\n\r\nFaculty of Biological Science\r\n\t Department of Botany\r\n\t Department of Soil, Water and Environment\r\n\t Department of Microbiology\r\n\t Department of Biochemistry and Molecular Biology\r\n\t Department of Fisheries\r\n\t Department of Genetic Engineering and Bio-technology\r\n\t Department of Psychology\r\n\t Department of Clinical Psychology\r\n\t Department of Zoology\r\n\t Department of Educational and Counseling Psychology\r\n\r\nFaculty of Engineering and Technology\r\n\t Department of Applied Chemistry and Chemical Engineering\r\n\t Department of Electrical and Electronic Engineering\r\n\t Department of Computer Science and Engineering\r\n\t Department of Nuclear Engineering\r\n\r\nFaculty of Education\r\n\r\nFaculty of Fine Artsr\n\t Department of crafts\r\n\t Department of Drawing and Painting\r\n\t Department of Graphics Design\r\n\t Department of printmaking\r\n\t Department of Oriental Art\r\n\t Department of Sculpture\r\n\t Department of History of Art\r\n\t Department of ceramics\r\n\r\nFaculty of Law\r\n\t Department of Law\r\n\r\nFaculty of Mediciner\n\r\rFaculty of Postgraduates Medical Sciences & Research\r\n\r\nFaculty of Pharmacy\r\n\t Department of Pharmaceutical Chemistry\r\n\t Department of Clinical Pharmacy and Pharmacology\r\n\t Department of Pharmaceutical Technology\r\n\r\nFaculty of Science\r\n\t Department of Chemistry\r\n\t Department of Physics\r\n\t Department of Mathematics\r\n\t Department of Statistics, Biostatistics & Informatics\r\n\t Department of Theoretical Physics\r\n\t Department of Biomedical Physics and Technology\r\n\r\nFaculty of Social Sciences\r\n\t Department of Anthropology\r\n\t Department of Criminology\r\n\t Department of Development Studies\r\n\t Department of Economics\r\n\t Department of International Relations\r\n\t Department of Sociology\r\n\t Department of Mass Communication and Journalism\r\n\t Department of Population Sciences\r\n\t Department of Political Science\r\n\t Department of Public Administration\r\n\t Department of Peace and Conflict Studies\r\n\t Department of Women's and Gender Studies\r\n\t Department of Television and Film Studies\r\nFaculty of Earth and Environmental Sciences[edit]\r\n\t Department of Geography and Environment\r\n\t Department of Geology\r\n\t Department of Oceanography\r\n\t Department of Disaster Science and Management");
					
				}
			});
                link.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					Uri uri=Uri.parse("http://www.univdhaka.edu");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
				}
			});
			
					
			
			
			
			com.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("University of dhaka,	Nilkhet Road, dhaka 1000\r\nCoordinates: 23°43′53.57″N 90°23′32.99″E");
				}
			});
mp.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					Uri uri=Uri.parse("https://www.google.com.bd/maps/place/%E0%A6%A2%E0%A6%BE%E0%A6%95%E0%A6%BE+%E0%A6%AC%E0%A6%BF%E0%A6%B6%E0%A7%8D%E0%A6%AC%E0%A6%AC%E0%A6%BF%E0%A6%A6%E0%A7%8D%E0%A6%AF%E0%A6%BE%E0%A6%B2%E0%A7%9F/@23.731549,90.392495,17z/data=!3m1!4b1!4m2!3m1!1s0x3755b8e90a449e4f:0xb7092a9c25197fa4?hl=bn");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
				}
			});
			tv.setText(s+" :The University of Dhaka (ঢাকা বিশ্ববিদ্যালয় ), is the oldest university in modern Bangladesh. Established during the British Raj in 1921, it gained a reputation as the (Oxford of the East) during its early years and has been a significant contributor to the modern history of Bangladesh.After the partition of India, it became the focal point of progressive and democratic movements in Pakistan. Its students and teachers played a central role in the rise of Bengali nationalism and the independence of Bangladesh.The university's distinguished alumni include Satyendra Nath Bose (pioneer of Bose–Einstein statistics), Fazlur Rahman Khan (pioneer of modern structural engineering), Muhammad Yunus (winner of the 2006 Nobel Peace Prize), Vijayaraghavan (co-discoverer of the PV number), Rehman Sobhan (social democratic economist), Buddhadeb Bose (20th century Bengali poet) and Sheikh Mujibur Rahman (the founding father of Bangladesh). It also enjoyed associations with Kazi Nazrul Islam, Rabindranath Tagore and Faiz Ahmed Faiz.Today, it is the largest public university in Bangladesh, with a student body of 33,000 and a faculty of 1,800. It was identified by AsiaWeek as one of the top 100 universities in Asia.[ However since the 1990s, the university has suffered from intensely politicized, partisan and violent campus politics promoted by Bangladesh's political parties.\r\n\r\nEstablished	:1921\r\nMotto	        : Truth Will Prevail(সত্যের জয় সুনিশ্চিত )\r\nType	        :Public, Coeducational\r\nChancellor	:Abdul Hamid\r\nVice-Chancellor:AAMS Arefin Siddique\r\nAcademic staff  :3,408\r\nStudents	:37,800\r\nLocation	:Dhaka,  Bangladesh\r\nCampus :	Urban, 600 acres (2.43 km²)\r\nWebsite :	www.du.ac.bd; www.univdhaka.edu\r\n");
		}
		
		
		if(s.equals("KU"))
		{
			
			info.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("KHULNA UNIVERSITY,KHULNA-9028 :\r\n\r\npabx :(041) 720171-3 ,2832580-3, 721791\r\nfax :(041) 731244\r\nemail :vc@ku.ac.bd\r\nwebsite:www.ku.ac.bd\r\nvc :721393\r\nregistrar:720663,  /5004, 01712-984823\r\nDeputy Director(public relations & publications):724260,/5080, 01711-965254");
				}
			}); 

			
               fac.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("Science, Engineering and Technology (SET) School\r\n\tArchitecture (ARCHI) Discipline\r\n\tChemistry (CHEM) Discipline\r\n\tComputer Science and Engineering (CSE) Discipline\r\n\tElectronics and Communication Engineering (ECE) Discipline\r\n\tMathematics (MATH) Discipline\r\n\tPhysics (PHY) Discipline\r\n\tStatistics (STAT) Discipline\r\n\tUrban and Rural Planning (URP) Discipline\r\n\r\nLife Science (LS) School\r\n\tAgrotechnology (AT) Discipline\r\n\tBiotechnology and Genetic Engineering (BGE) Discipline\r\n\tEnvironmental Science (ES) Discipline\r\n\tFisheries and Marine Resources Technology (FMRT) Discipline\r\n\tForestry and Wood Technology (FWT) Discipline\r\n\tPharmacy (PHARM) Discipline\r\n\tSoil Science (SS) Discipline\r\n\r\nSchool of Management & Business Administration (SOMBA) \r\n\tBusiness Administration (BA) Discipline\r\n\r\nSocial ScienceSchool\r\n\tEconomics (ECON) Discipline\r\n\tDevelopment Studies (DS) Discipline\r\n\tSociology (SOC)\r\n\tDiscipline\r\n\r\nArts and Humanities School\r\n\tBangla Language and Literature (BNL) Discipline\r\n\tEnglish (ENG) Discipline");
					
				}
			});
                link.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					Uri uri=Uri.parse("http://www.ku.ac.bd");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
				}
			});
			
					
			
			
			
			com.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("খুলনা বিশ্ববিদ্যালয়,শের-ই-বাংলা রোড,খুলনা 9208");
				}
			});
mp.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					Uri uri=Uri.parse("https://www.google.com.bd/maps/place/%E0%A6%96%E0%A7%81%E0%A6%B2%E0%A6%A8%E0%A6%BE+%E0%A6%AC%E0%A6%BF%E0%A6%B6%E0%A7%8D%E0%A6%AC%E0%A6%AC%E0%A6%BF%E0%A6%A6%E0%A7%8D%E0%A6%AF%E0%A6%BE%E0%A6%B2%E0%A6%AF%E0%A6%BC/@22.8019904,89.5339031,16z/data=!3m1!4b1!4m2!3m1!1s0x39ff85490c50d28f:0xadae6f7b93b7069a?hl=bn");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
				}
			});
			tv.setText(s+" : Khulna University (খুলনা বিশ্ববিদ্যালয়) is a public university in Bangladesh.It is situated at Gollamari, Khulna, Bangladesh, by the river Moyur, beside the Khulna-Satkhira highway. The academic programs of Khulna University started on 31 August 1991 with only 80 students in four disciplines.Khulna University has 22 disciplines under five schools and one institute. It is the only university in Bangladesh where student politics is not allowed.There is also no session jam which has created a stable facility of study. Students passing Higher Secondary Certificate (HSC) examination are very much interested in their admission in Khulna University for this politics-free, session-jam free environment. Khulna is an administrative Division as well as the third largest metropolitan city in Bangladesh. The Mongla Sea Port, the Shipyard, the Bangladesh Naval Base are in Khulna. Khulna is well known as industrial city and famous for the Sundarbans.");
		}
		
		
		if(s.equals("RU"))
		{
			
			info.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("RAJSHAHI UNIVERSITY,RAJSHAHI-6205 :\r\n\r\npabx :0721-750041-54\r\nfax :0721-726310,0721-750064\r\nemail :registrar@ru.ac.bd\r\nwebsite:www.ru.ac.bd\r\nvc :750783,750420\r\npro vc:750367,750992\r\nregistrar:750244,750658\r\nadministrator(public relations):750025,750446 ");
				}
			}); 

			
               fac.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("Faculty of Arts\r\n\tBengali\r\n\tEnglish\r\n\t History\r\n\t Philosophy\r\n\t Languages\r\n\t Fine Arts\r\n\t Islamic History & Culture\r\n\t Arabic\r\n\tIslamic Studies\r\n\tTheatre & Music\r\n\r\nFaculty of Science\r\n\tPhysics\r\n\tChemistry\r\n\tStatistics\r\n\tPharmacy\r\n\tMathematics\r\n\tBiochemistry & Molecular Biology\r\n\tApplied Mathematics\r\n\tPopulation Science & Human Resource Development\r\n\r\n Faculty of Engineering\r\n\tApplied Physics & Electronic Engineering\r\n\tComputer Science & Engineering\r\n\tInformation & Communication Engineering\r\n\tApplied Chemistry & Chemical Engineering\r\n\tMaterials Science and Engineering\r\n\r\nFaculty of Agriculture\r\n\tAgronomy & Agricultura Extension\r\n\tFisheries\r\n\tAnimal Husbandry & Veterinary Science\r\n\tCrop Science and Technology\r\n\r\nFaculty of Social Science\r\n\tEconomics\r\n\tPolitical Science\r\n\tSocial Work\r\n\tSociology\r\n\tMass Communication and Journlism\r\n\tPublic Administration\r\n\tInformation Sc. & Library Management\r\n\tAnthropology\r\n\tFolklore\r\n\r\nFaculty of Life & Earth Science\r\n\tGeography & Environmental Studies\r\n\tPsychology\r\n\tBotany\r\n\tZoologyv\r\n\tGeology & Mining\r\n\tGenetic Engineering & Biotechnology\r\n\r\nFaculty of Business Studies\r\n\t Accounting and Information Systems\r\n\tManagement\r\n\tMarketing\r\n\tFinance\r\n\r\n Faculty of law\r\n\tLaw & Justice");
					
		}
			});
                link.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					Uri uri=Uri.parse("http://www.ru.ac.bd");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
				}
			});
			
					
			
			
			
			com.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("রাজশাহী বিশ্ববিদ্যালয় ঢাকা - রাজশাহী মহাসড়ক ,রাজশাহী 6205");
				}
			});
mp.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					Uri uri=Uri.parse("https://www.google.com.bd/maps/place/%E0%A6%B0%E0%A6%BE%E0%A6%9C%E0%A6%B6%E0%A6%BE%E0%A6%B9%E0%A7%80+%E0%A6%AC%E0%A6%BF%E0%A6%B6%E0%A7%8D%E0%A6%AC%E0%A6%AC%E0%A6%BF%E0%A6%A6%E0%A7%8D%E0%A6%AF%E0%A6%BE%E0%A6%B2%E0%A6%AF%E0%A6%BC/@24.3714488,88.6420083,15z/data=!3m1!4b1!4m2!3m1!1s0x39fbf02db6d04b59:0xaa58eb411ea3ec5c?hl=bn");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
				}
			});
			tv.setText(s+" :University of Rajshahi or Rajshahi University ( রাজশাহী বিশ্ববিদ্যালয় ) is a public university located in Rajshahi, a city in north-western Bangladesh. University of Rajshahi was established in 1953, the second university to be established in what was then East Pakistan.The university's forty-seven departments are organized into nine faculties. Rajshahi University is located in a 753 acres (3 km2) campus in Motihar, 3 kilometres (2 mi) from the Rajshahi city center. With 25,000 students and close to 1000 academic staff, it is one of the largest universities in Bangladesh.[3] In addition to hosting programs in the Engineering, arts, sciences, agriculture, social sciences, business studies and medical sciences, the university houses a number of institutes of higher studies. This is the premier university in Bangladesh to have online subscription of world renowned journals.");
		}
		
		if(s.equals("JU"))
		{
			
			info.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("JAHANGIRNAGAR UNIVERSITY ,SAVAR,DHAKA-1342 :\r\n\r\npabx :(02)7791045-51\r\nfax:(02)7791052\r\nemail:registrarju@gmail.com\r\nwebsite :www.juniv.edu\r\nvc :7791033, 7791044\r\npro vc(education):7791039, 9142498\r\nnpro vc(adminst) :7791034, 7708794\r\nregistrar :7791040,7791850\r\ndirector(public relations):7791045-51, /1232, 7791733");
				}
			}); 

			
               fac.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("Faculty of Mathematical and Physical Science\r\n\tDepartment of Computer Science & Engineering\r\n\tDepartment of Environmental Sciences\r\n\tDepartment of Physics\r\n\tDepartment of Chemistry (JU) \r\n\tDepartment of Statistics\r\n\tDepartment of Mathematics(JU) \r\n\tDepartment of Geological Science\r\n\r\nFaculty of Biological Science\r\n\tDepartment of Botany\r\n\tDepartment of Zoology\r\n\tDepartment of Biochemistry and Molecular Biology\r\n\tDepartment of Microbiology\r\n\tDepartment of Pharmacy\r\n\tDepartment of Public health & Informatics\r\n\tDepartment of Genetic Engineering and Biotechnology\r\n\r\nFaculty of Social Science\r\n\tDepartment of Anthropology\r\n\tDepartment of Economics\r\n\tDepartment of Government and Politics\r\n\tDepartment of Geography and Environment\r\n\tDepartment of Public Administration\r\n\tDepartment of Urban and Regional Planning (JU)\r\n\r\nFaculty of Arts and Humanities\r\n\tDepartment of Archaeology\r\n\tDepartment of Bangla\r\n\tDepartment of English\r\n\tDepartment of History\r\n\tDepartment of Philosophy\r\n\tDepartment of International relations\r\n\tDepartment of Journalism & Media studies\r\n\tDepartment of Drama and Dramatics\r\n\r\nFaculty of Business Studies\r\n\tDepartment of Accounting and Information Systems\r\n\tDepartment of Finance & Banking\r\n\tDepartment of Marketing\r\n\tDepartment of Management Studies\r\n\r\nFaculty of Law\r\n\tDepartment of Law & Justice\r\n\t");
					
				}
			});
                link.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					Uri uri=Uri.parse("http://www.juniv.edu");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
				}
			});
			
					
			
			
			
			com.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("জাহাঙ্গীরনগর বিশ্ববিদ্যালয়,ঢাকা - আরিচা মহাসড়ক,সাভার 1342");
				}
			});
mp.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					Uri uri=Uri.parse("https://www.google.com.bd/maps/place/%E0%A6%9C%E0%A6%BE%E0%A6%B9%E0%A6%BE%E0%A6%99%E0%A7%8D%E0%A6%97%E0%A7%80%E0%A6%B0%E0%A6%A8%E0%A6%97%E0%A6%B0+%E0%A6%AC%E0%A6%BF%E0%A6%B6%E0%A7%8D%E0%A6%AC%E0%A6%AC%E0%A6%BF%E0%A6%A6%E0%A7%8D%E0%A6%AF%E0%A6%BE%E0%A6%B2%E0%A6%AF%E0%A6%BC/@23.881505,90.267203,17z/data=!3m1!4b1!4m2!3m1!1s0x3755e99896467ea9:0x4ccd962e53b18cf3?hl=bn");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
				}
			});
			tv.setText(s+" :Jahangirnagar University (জাহাঙ্গীরনগর বিশ্ববিদ্যালয় ,জাবি ) is a public university in Bangladesh, located in Savar Upazila, Dhaka.It is the only one fully residential[2] university in Bangladesh.The university was established in 1970 by the government of Pakistan by the Jahangirnagar Muslim University Ordinance, 1970. During the first two years, it operated as a project. Its first Vice-Chancellor, Professor Mafiz Uddin Ahmad (Ph.D in Chemistry, University of Illinois, Chicago) took up office on September 24, 1970. The first group of students, a total of 150, was enrolled in four departments: Economics, Geography, Mathematics and Statistics. Its formal inauguration was delayed until January 12, 1971, when the university was launched by Rear Admiral S. M. Ahsan, the Chancellor.Until 1973, it operated as a project. In 1973 Jahangirnagar Muslim University Act was amended as Jahangirnagar University Act.In 2014 the university had a total of 14,500 students, 672 teachers, 206 staffs and 1,200 other employees. The university boasts to have the first ever female Vice-Chancellor of any public university in Bangladesh.\r\n\r\nEstablished	1970\r\nType	       Public, Coeducational\r\nChancellor	Abdul Hamid\r\nVice-Chancellor	Prof. Dr. Farzana Islam\r\nPro-Vice-Chancellor	Prof. Dr. Md. Abul Hossain\r\nAcademic staff  672\r\nStudents	14500\r\nLocation	Savar, Bangladesh\r\nCampus	        Rural, 697 acres (2.8 km²)\r\nWebsite 	www.juniv.edu");
		}
		
		
		if(s.equals("CU"))
		{
			
			info.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("CHITTAGONG UNIVERSITY, CHITTAGONG-4331 :\r\n\r\npabx :(031)2606001-10, 714923 ,726311-14\r\nfax:(031) 726310\r\nemail:vc_cu66@yahoo.com\r\nwebsite :www.cu.ac.bd\r\nvc :714949, 651287\r\npro vc:2606011,2606012\r\nregistrar :/4201 ,01819-328908\r\npro-registrar(information):/4287, /4404");
				}
			}); 

			
               fac.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("Faculty of Science\r\n\t Department of Chemistry\r\n\tDepartment of Physics\r\n\tDepartment of Mathematics\r\n\tDepartment of Statistics\r\n\tDepartment of Applied and Environmental Chemistry\r\n\r\nFaculty of Engineering\r\n\tDepartment of Applied Physics, Electronics & Communication Engineering (APECE)\r\n\tDepartment of Computer Science and Engineering\r\n\r\nFaculty of Biological Sciences\r\n\tDepartment of Botany\r\n\tDepartment of Zoology\r\n\tDepartment of Microbiology\r\n\tDepartment of Biochemistry and Molecular Biology\r\n\tDepartment of Geography and Environmental Science\r\n\tDepartment of Soil Science\r\n\tDepartment of Genetic Engineering and Biotechnology\r\n\tDepartment of Psychology\r\n\tDepartment of Pharmacy\r\n\r\nFaculty of Arts\r\n\tDepartment of Sanskrit\r\n\tDepartment of Bengali\r\n\tDepartment of English\r\n\tDepartment of Pali\r\n\tDepartment of History\r\n\tDepartment of Philosophy\r\n\tDepartment of Fine Arts\r\n\tDepartment of Islamic History & Culture\r\n\tDepartment of Islamic Studies\r\n\tDepartment of Arabic & Persian\r\n\tDepartment of Linguistic\r\n\r\nFaculty of Social Science\r\n\tDepartment of Anthropology\r\n\tDepartment of Communication & Journalism\r\n\tDepartment of Economics\r\n\tDepartment of Political Science\r\n\tDepartment of Public Administration\r\n\tDepartment of Sociology\r\n\tDepartment of Information Science & Library Management\r\n\tDepartment of International Relations (IR) \r\n\tDepartment of Home Economics\r\n\tDepartment of Urban & Rural Development\r\n\r\nFaculty of Business Administration\r\n\t Department of Accounting and Information System\r\n\tDepartment of Finance and Banking\r\n\tDepartment of Management Studies\r\n\tDepartment of Marketing studies and International Marketing\r\n\tDepartment of Human Resource Management\r\n\tDepartment of Banking\r\n\r\nFaculty of Law\r\n\tDepartment of Law");
					
				}
			});
                link.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					Uri uri=Uri.parse("http://www.cu.ac.bd");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
				}
			});
			
					
			
			
			
			com.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("garite uthe jao");
				}
			});
mp.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					Uri uri=Uri.parse("https://www.google");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
				}
			});
			tv.setText(s+":The University of Chittagong (চট্টগ্রাম বিশ্ববিদ্যালয়) is a public research university located in the suburban area of the Hathazari, Chittagong district, Bangladesh. Established in 1966, the campus is 22 kilometers north of Chittagong City. It is a multidisciplinary research university and one of the largest universities in Bangladesh with about 22,000 students and about 750 faculty members.");
		}
		
		
		if(s.equals("JNU"))
		{
			
			info.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("JAGANNATH UNIVERSITY ,DHAKA-1100 :\r\n\r\npabx :(02)7110415\r\nfax :(02)7113752\r\nemail :registrar@jnuni.net\r\nwebsite:www.jnun.ac.bd\r\nvc :7119731, 9340921\r\nregistrar:7110415\r\nDeputy Director(public relations & info):717673");
				}
			}); 

			
               fac.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("Faculty of Business Studies\r\n\tDepartment of Accounting & Information Systems\r\n\tDepartment of Marketing\r\n\tDepartment of Finance\r\n\tDepartment of Management Studies\r\n\r\nFaculty of Life and Earth Sciences[edit]Department of Pharmacy\r\n\tDepartment of Microbiology and Biotechnology\r\n\tDepartment of Zoology\r\n\tDepartment of Botany\r\n\tDepartment of Psychology\r\n\tDepartment of Geography and Environment\r\n\r\nFaculty of Science\r\n\tDepartment of Computer Science and Engineering(CSE) \r\n\tDepartment of Chemistry\r\n\tDepartment of Physics\r\n\tDepartment of Mathematics\r\n\tDepartment of Statistics\r\n\r\nFaculty of Arts\r\n\tDepartment of Bengali\r\n\tDepartment of English\r\n\tDepartment of History\r\n\tDepartment of Philosophy\r\n\tDepartment of Islamic History and Culture\r\n\tDepartment of Islamic Studies\r\n\r\nFaculty of Law\r\n\tDepartment of Law\r\n\r\nFaculty of Social Science\r\n\tDepartment of Sociology\r\n\tDepartment of Anthropology\r\n\tDepartment of Economics\r\n\tDepartment of Political Science\r\n\tDepartment of Public Administration\r\n\tDepartment of Social Work\r\n\tDepartment of Mass Communication and Journalism\r\n\r\nFaculty of Fine Arts\r\n\tDepartment of Fine Arts and Graphics\r\n\tDepartment of Drama and music\r\n\t");
					
				}
			});
                link.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					Uri uri=Uri.parse("http://www.jnun.ac.bd");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
				}
			});
			
					
			
			
			
			com.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("জগন্নাথ বিশ্ববিদ্যালয় 9-10,চিত্তরঞ্জন এভিনিউ ঢাকা 1100");
				}
			});
mp.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					Uri uri=Uri.parse("https://www.google.com.bd/maps/place/%E0%A6%9C%E0%A6%97%E0%A6%A8%E0%A7%8D%E0%A6%A8%E0%A6%BE%E0%A6%A5+%E0%A6%AC%E0%A6%BF%E0%A6%B6%E0%A7%8D%E0%A6%AC%E0%A6%AC%E0%A6%BF%E0%A6%A6%E0%A7%8D%E0%A6%AF%E0%A6%BE%E0%A6%B2%E0%A6%AF%E0%A6%BC/@23.708816,90.411045,17z/data=!3m1!4b1!4m2!3m1!1s0x3755b9072bf8919b:0x345933e6dc9c0d6?hl=bn");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
				}
			});
			tv.setText(s+" :Jagannath University (Bengali: জগন্নাথ বিশ্ববিদ্যালয় Jogonnoth Bishobidæloe) is a Government-Financed Public University[2] in Sadarghat, Dhaka the capital of Bangladesh. Jagannath University is in the southern part of Dhaka city near the river Buriganga.\r\n\r\nEstablished	: 1858 ,University - 2005\r\nMotto	        :Education, Faith, Discipline(শিক্ষা, ঈমান, শৃঙ্খলা)\r\nType	        :Public, Coeducational\r\nChancellor	:Abdul Hamid\r\nVice-Chancellor	:Professor Dr.Mijanur Rahman \r\nAcademic staff  : 750\r\nAdministrative staff : 950\r\nStudents	:25000\r\nLocation	:Bangladesh Dhaka, Bangladesh\r\nCampus	       :Urban\r\nNickname       :JnU (জবি)\r\nWebsite	       :www.jnu.ac.bd");
		}
		
		
		if(s.equals("SUST"))
		{
			
			info.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("SHAHJALAL UNIVERSITY OF SCIENCE AND TECHNOLOGY(SUST), SYLHET-3114 :\r\n\r\npabx :(0821) 713491, 714479, 716123\r\nfax:(0821)715257, 725050\r\nemail:registrar@sust.edu\r\nwebsite :www.sust.edu\r\nvc :714306, 715134,/301\r\nregistrar :712784, 724690\r\npro-registrar(public relations):/223,2831486 ");
				}
			}); 

			
               fac.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("School of Agriculture and Mineral Sciences\r\n\tDepartment of Forestry and Environmental Science\r\n\r\nSchool of Applied Sciences & Technology\r\n\tDepartment of Architecture\r\n\tDepartment of Chemical Engineering and Polymer Science\r\n\tDepartment of Civil and Environmental Engineering\r\n\tDepartment of Computer Science and Engineering\r\n\tDepartment of Electrical and Electronic Engineering\r\n\tDepartment of Food Engineering & Tea Technology\r\n\tDepartment of Industrial and Production Engineering\r\n\tDepartment of IT & Software Engineering (under consideration) \r\n\tDepartment of Materials Science & Design Engineering (under consideration) \r\n\tDepartment of Petroleum & Mining Engineering\r\n\tDepartment of Mechanical Engineering (under consideration) \r\n\tDepartment of Urban and Regional Planning (under consideration) \r\n\r\nSchool of Life Sciences\r\n\tDepartment of Bio-Chemistry and Molecular Biology\r\n\tDepartment of Genetic Engineering and Biotechnology\r\n\r\nSchool of Law\r\n\tDepartment of Law (under consideration)\r\n\r\nSchool of Management and Business Administration\r\n\tDepartment of Business Administration\r\n\tDepartment of Business & ICT (under consideration) \r\n\r\nSchool of Medical Sciences\r\n\r\nSchool of Physical Sciences\r\n\tDepartment of Chemistry\r\n\tDepartment of Geography and Environment\r\n\tDepartment of Mathematics\r\n\tDepartment of Physics\r\n\tDepartment of Statistics\r\n\r\nSchool of Social Sciences\r\n\tDepartment of Anthropology\r\n\tDepartment of Bengali\r\n\tDepartment of Economics\r\n\tDepartment of English\r\n\tDepartment of Political science|Political Studies\r\n\tDepartment of Public Administration\r\n\tDepartment of Social work\r\n\tDepartment of Sociology\r\n\t");
					
				}
			});
                link.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					Uri uri=Uri.parse("http://www.sust.edu");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
				}
			});
			
					
			
			
			
			com.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("Shahjalal University of Science & Technology,Sylhet 3114");
				}
			});
mp.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					Uri uri=Uri.parse("https://www.google.com.bd/maps/place/%E0%A6%B6%E0%A6%BE%E0%A6%B9%E0%A6%9C%E0%A6%BE%E0%A6%B2%E0%A6%BE%E0%A6%B2+%E0%A6%AC%E0%A6%BF%E0%A6%9C%E0%A7%8D%E0%A6%9E%E0%A6%BE%E0%A6%A8+%E0%A6%93+%E0%A6%AA%E0%A7%8D%E0%A6%B0%E0%A6%AF%E0%A7%81%E0%A6%95%E0%A7%8D%E0%A6%A4%E0%A6%BF+%E0%A6%AC%E0%A6%BF%E0%A6%B6%E0%A7%8D%E0%A6%AC%E0%A6%AC%E0%A6%BF%E0%A6%A6%E0%A7%8D%E0%A6%AF%E0%A6%BE%E0%A6%B2%E0%A6%AF%E0%A6%BC/@24.921215,91.833074,17z/data=!3m1!4b1!4m2!3m1!1s0x3750fff54ec1d345:0xdec4aded0892689c?hl=bn");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
				}
			});
			tv.setText(s+" : Shahjalal University of Science and Technology (শাহজালাল বিজ্ঞান ও প্রযুক্তি বিশ্ববিদ্যালয়) also known as SUST is a state supported not-for-profit research university located in Sylhet, Bangladesh.It is also one of the nine PhD granting research universities of Bangladesh.The university was founded by the Government of Bangladesh according to a university act in 1986 to give special importance in science and technology education. It is the first specialized science & technology university of the country. After SUST, seven more science and technology universities have been established in Bangladesh.SUST is traditionally known for research and education in the physical sciences and engineering. It is one of the most selective higher learning institutions, and received 40,881 undergraduate applicants for 2012-2013 session—only admitting 1,385, an acceptance rate of 3.39%.");
		}
		
		
		if(s.equals("BSMRSTU"))
		{
			
			info.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("BANGABANDHU SHEIKH MUJIBUR RAHMAN SCIENCE AND TECHNOLOGY UNIVERSITY, GOPALGANJ-8100 :\r\npabx :()\r\nfax :02-6682173\r\nemail :registrar@bsmrstu.edu.bd\r\nwebsite:www.bsmrstu.edu.bd\r\nvc :02-6682174  02-6682172\r\nregistrar:02-6682257\r\nDeputy Director:02-6682258");
				}
			}); 

			
               fac.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("Faculty of Engineering\r\n\tComputer Science & Engineering(50) \r\n\tElectrical and Electronics Engineering(40) \r\n\tApplied Physics, Electronics & Communication Engineering(50) \r\n\r\nFaculty of Science\r\n\tMathematics(50) \r\n\tAnalytical and Environmental Chemistry(40) \r\n\tStatistics(50) \r\n\r\nFaculty of Business Studies\r\n\tManagement Studies(50) \r\n\tAccounting & System Information(50) \r\n\r\nFaculty of Arts & Humanities\r\n\tEnglish(50) \r\n\tBangla(50) \r\n\r\nFaculty of Social ScienceSociology(50) \r\n\tEconomics(50) \r\n\tPublic Administration(50)\r\n\r\nFaculty of Life-science\r\n\tPharmacy(40) \r\n\t");
					
				}
			});
                link.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					Uri uri=Uri.parse("http://www.bsmrstu.edu.bd");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
				}
			});
			
					
			
			
			
			com.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("Bangabandhu Sheikh Mujibur Rahman Science and Technology University,Gopalganj Town Road,Gopalganj\r\nবঙ্গবন্ধু শেখ মুজিবুর রহমান বিজ্ঞান ও প্রযুক্তি বিশ্ববিদ্যালয়,গোপালগঞ্জ  টাউন রোড,গোপালগঞ্জ\r\nCoordinates :22.9661°N 89.8171°E ");
				}
			});
mp.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					Uri uri=Uri.parse("https://www.google.com.bd/maps/place/%E0%A6%AC%E0%A6%99%E0%A7%8D%E0%A6%97%E0%A6%AC%E0%A6%A8%E0%A7%8D%E0%A6%A7%E0%A7%81+%E0%A6%B6%E0%A7%87%E0%A6%96+%E0%A6%AE%E0%A7%81%E0%A6%9C%E0%A6%BF%E0%A6%AC%E0%A7%81%E0%A6%B0+%E0%A6%B0%E0%A6%B9%E0%A6%AE%E0%A6%BE%E0%A6%A8+%E0%A6%AC%E0%A6%BF%E0%A6%9C%E0%A7%8D%E0%A6%9E%E0%A6%BE%E0%A6%A8+%E0%A6%93+%E0%A6%AA%E0%A7%8D%E0%A6%B0%E0%A6%AF%E0%A7%81%E0%A6%95%E0%A7%8D%E0%A6%A4%E0%A6%BF+%E0%A6%AC%E0%A6%BF%E0%A6%B6%E0%A7%8D%E0%A6%AC%E0%A6%AC%E0%A6%BF%E0%A6%A6%E0%A7%8D%E0%A6%AF%E0%A6%BE%E0%A6%B2%E0%A6%AF%E0%A6%BC/@22.966095,89.817135,17z/data=!3m1!4b1!4m2!3m1!1s0x39ffe84dfd30f8ed:0x1f01d1b3db61f9d2?hl=bn");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
				}
			});
			tv.setText(s+" : Bangabandhu Sheikh Mujibur Rahman Science and Technology University is a public university located in Ghonapara, Gopalganj,It is a prominent public university of Bangladesh. It is named in the memory of Father of the nation Bangabandhu Sheikh Mujibur Rahman. The University is located at the birth place of Bangabandhu, Gopalganj. Sheikh Mujibur Rahman dreamt to establish a university at its birth place. His dream came true in 2009 when his daughter Sheikh Hasina Wajid came to power and inaugurated university at Gopalganj.\r\nBSMRSTU has 6 faculties named as Faculty of Engineering, Faculty of Science, Faculty of Life Science, Faculty of Business Studies, Faculty of Social Science and Faculty of Humanities.Campus is located at Gopalganj with an area of 55 acres.\r\n\r\nMotto	        :Learn.Think.Innovate\r\nEstablished	:2011\r\nType	        :Public Research University\r\nChancellor	:Abdul Hamid (President of Bangladesh)\r\nVice-Chancellor :\r\nStudents	:2000+\r\nLocation	:Gopalganj (Latitude 22.966095, Longitude 89.817135), Bangladesh\r\nCampus	        :55 acres ( 0.223km² )\r\nSporting affiliations :University Grants Commission (Bangladesh)\r\nWebsite	        :www.bsmrstu.edu.bd");
		}
		
		
		if(s.equals("JSTU"))
		{
			
			info.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("JESSORE SCIENCE AND TECHNOLOGY UNIVERSITY ,KARBALA,JESSORE-7407 :\r\n\r\npabx :(0421) 62020, 62030 ,62080\r\nfax:(0421) 62238, 61199\r\nemail:satter_ac@yahoo.com\r\nwebsite:www.jstu.adu.bd\r\nvc :61111, /101, 51081\r\nregistrar :61333, /104\r\nofficer(public relations):01929-913419");
				}
			}); 

			
               fac.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("Faculty of Engineering & Technology\r\n\tComputer Science and Engineering (CSE) \r\n\tElectrical and Electronic Engineering (EEE) \r\n\tIndustrial & Production Engineering (IPE) \r\n\tPetroleum & Mining Engineering (PME) \r\n\tChemical Engineering (ChE) \r\n\r\nFaculty of Applied Science & Technology\r\n\tEnvironmental Science & Technology (EST) \r\n\tNutrition & Food Technology (NFT) \r\n\r\nFaculty of Biological Science & Technology\r\n\tMicrobiology(MB) \r\n\tFisheries & Marine Bioscience (FMB) \r\n\tGenetic engineering & Biotechnology(GEBT) \r\n\tPharmacy(Pharm) \r\n\r\nFaculty of Physical Education, Language and Ethical StudiesPhysical Education & Sports Science (PESS) \r\n\tEnglish\r\n\r\nFaculty of Science\r\n\tChemistry\r\n\tMathematics & Statistics\r\n\tPhysics\r\n\t");
					
				}
			});
                link.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					Uri uri=Uri.parse("http://www.jstu.edu.bd");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
				}
			});
			
					
			
			
			
			com.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("garite uthe jao");
				}
			});
			tv.setText(s+" : Jessore University of Science and Technology (যশোর বিজ্ঞান ও প্রযুক্তি বিশ্ববিদ্যালয়) also known as JUST (যবিপ্রবি) is a government-financed public university in Bangladesh.This is the fourth public university in Khulna Division and the first public university in Jessore. It was established in 25 January 2007 and started four-year undergraduate courses from the 2008-2009 session.");
		}
		
		
		if(s.equals("PUST"))
		{
			
			info.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("PABNA SCIENCE AND TECHNOLOGY UNIVERSITY,,PABNA\r\n\r\nFAX :0731-64970\r\nemail:vcpust@gmail.com\r\nwebsite:www.pust.ac.bd\r\nvc :0731-65790,66379\r\nsub registrar :0731-66742,01715-229922\r\nofficer(pub. relations) :0731-62092,01711-942212");
				}
			}); 

			
               fac.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("Faculty of Engineering and Technology\r\n\tDepartment of Computer Science and Engineering\r\n\tDepartment of Electrical and Electronic Engineering\r\n\tDepartment of Electronic and Telecommunication Engineering\r\n\tDepartment of Information and Communication Engineering\r\n\tDepartment of Civil Engineering\r\n\tDepartment of Architecture\r\n\nFaculty of Science\r\n\tDepartment of Physics\r\n\tDepartment of Pharmacy\r\n\tDepartment of Mathematics\r\n\nFaculty of Business Studies\r\n\tDepartment of Business Administration\r\n\r\nFaculty of Humanities and Social Science\r\n\tDepartment of Bengali\r\n\tDepartment of Economics\r\n\r\nFaculty of Life and Earth Science\r\n\tDepartment of Geography, Environment and Urban Planning\r\n\t");
					
				}
			});
                link.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					Uri uri=Uri.parse("http://www.pust.ac.bd");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
				}
			});
			
					
			
			
			
			com.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("garite uthe jao");
				}
			});
			tv.setText(s+" :Pabna University of Science and Technology (পাবনা বিজ্ঞান ও প্রযুক্তি বিশ্ববিদ্যালয়) is a Public Engineering University in Bangladesh. This is the third public university in Rajshahi Division and first public university in Pabna. PUST was established in 2008 and started four-year undergraduate programme from 2009.");
		}
		
		
		if(s.equals("PSTU"))
		{
			
			info.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("PATUAKHALI SCIENCE AND TECHNOLOGY UNIVERSITY ,DUMKI,PATUAKHALI-8602 :\r\n\r\npabx :(04427) 56014\r\nfax:(04427) 56009\r\nemail:vc@pstu.ac.bd\r\nwebsite:www.pstu.ac.bd\r\nvc :56011, 56010\r\nregistrar :56008, 56180\r\npro-director(public relations): 56176,01711-357376");
				}
			}); 

			
               fac.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("Faculty of Agriculture\r\n\r\nFaculty of Computer Science and Engineering\r\n\r\nFaculty of Business Administration\r\n\r\nFaculty of Animal Science and Veterinary Medicine\r\n\r\nFaculty of Fisheries\r\n\r\nFaculty of Disaster Management\r\n\r\nFaculty of Nutrition and Food Science\r\n\r\n");
					
				}
			});
                link.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					Uri uri=Uri.parse("http://www.pstu.ac.bd");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
				}
			});
			
					
			
			
			
			com.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("garite uthe jao");
				}
			});
			tv.setText(s+" :Patuakhali Science and Technology University (পটুয়াখালী বিজ্ঞান ও প্রযুক্তি বিশ্ববিদ্যালয়) is a government financed public university in Patuakhali, Bangladesh. PSTU has given affiliation to the Barisal Government Veterinary College as its constituent faculty. This is the only science and technological university in Barisal division.");
		}
		
		
		if(s.equals("SAU"))
		{
			
			info.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("SHER-E-BANGLA AGRICULTURAL UNIVERSITY,SHER-E-BANGLA NAGAR,DHAKA-1207:\r\n\r\npabx :(02)9144270-79\r\nfax :(02)8155800\r\nemail :vcsau@yahoo.com\r\nwebsite:www.sau.edu.bd\r\nvc :9111610,812106\r\nregistrar:9131162, 01913-521028\r\nofficers(public relation):312,9130989, 01552-386529");
				}
			}); 

			
               fac.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("Fa i     )");
					
				}
			});
                link.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					Uri uri=Uri.parse("http://www.sau.ac.bd");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
				}
			});
			
					
			
			
			
			com.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("garite uthe jao");
				}
			});
			tv.setText(s+" :Sher-e-Bangla Agricultural University (শেরেবাংলা কৃষি বিশ্ববিদ্যালয়) or SAU is the oldest agricultural institution in Bangladesh and South Asia, situated in Sher-e-Bangla Nagar, Dhaka. It was established on December 11, 1938 as Bengal Agricultural Institute (BAI) and later upgraded to university in 2001 renaming Sher-e-Bangla Agricultural University.Since its establishment, this university is playing a role in agricultural research and development (R&D) of the region through creation of knowledge, agricultural technology generation and transfer, crop diversification and intensification for the benefit of farming communities. SAU offers undergraduate and post graduate degrees through course credit system and also Ph.D. courses.");
		}
		
		
		if(s.equals("BAU"))
		{
			
			info.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("BANGLADESH AGRICULTURAL UNIVERSITY\r\nBAU,MYMENSINGH-2202 :\r\n\r\npabx :(091)66016-18,67401-06\r\nfax :(091)67407,61510\r\nemail :vcbau@yahoo.com\r\nwebsite:www.ru.ac.bd\r\nvc :(091)67333,67433\r\nregistrar:66846,54896\r\nadministrator(public relations & publications):63778,66294");
				}
			}); 

			
               fac.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("Faculty of Agricultural Engineering and Technology\r\n\tDepartment of Farm Structure and Enviro\r\n\t nmental Engineering\r\n\tDepartment of Farm Power and Machinery\r\n\tDepartment of Irrigation and Water Management\r\n\tDepartment of Food Technology and Rural Industries\r\n\tDepartment of Computer Science and Mathematics\r\n\r\nFaculty of Veterinary Science\r\n\tDepartment of Anatomy and Histology\r\n\tDepartment of Physiology\r\n\tDepartment of Microbiology and Hygiene\r\n\tDepartment of Pharmacology\r\n\tDepartment of Parasitology\r\n\tDepartment of Pathology\r\n\tDepartment of Medicine\r\n\tDepartment of Surgery and Obstetrics\r\n\r\nFaculty of Agriculture\r\n\tDepartment of Agronomy\r\n\tDepartment of Soil Science\r\n\tDepartment of Entomology\r\n\tDepartment of Horticulture\r\n\tDepartment of Plant Pathology\r\n\tDepartment of Crop Botany\r\n\tDepartment of Genetics and Plant Breeding\r\n\tDepartment of Agricultural Extension Education\r\n\tDepartment of Agricultural Chemistry\r\n\tDepartment of Biochemistry and Molecular Biology\r\n\tDepartment of Physics\r\n\tDepartment of Chemistry\r\n\tDepartment of Languages\r\n\tDepartment of Agroforestry\r\n\tDepartment of Biotechnology\r\n\tDepartment of Environmental Science\r\n\r\nFaculty of Animal Husbandry\r\n\tDepartment of Animal Breeding and Genetics\r\n\tDepartment of Animal Science\r\n\tDepartment of Animal Nutrition\r\n\tDepartment of Poultry Science\r\n\tDepartment of Dairy Science\r\n\r\nFaculty of Agricultural Economics & Rural Sociology\r\n\tDepartment of Agricultural Economics\r\n\tDepartment of Agricultural Finance\r\n\tDepartment of Agricultural Statistics\r\n\tDepartment of Agribusiness and Marketing\r\n\tDepartment of Rural Sociology\r\n\r\nFaculty of Fisheries\r\n\tDepartment of Fisheries Biology and Genetics\r\n\tDepartment of Aquaculture\r\n\tDepartment of Fisheries Management\r\n\tDepartment of Fisheries Technology\r\n\t");
					
				}
			});
                link.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					Uri uri=Uri.parse("http://www.bau.edu.bd");
					Intent intent=new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);;
				}
			});
			
					
			
			
			
			com.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv;
					tv=(TextView) findViewById(R.id.textView1);
					tv.setText("garite uthe jao");
				}
			});
			tv.setText(s+" :Bangladesh Agricultural University ( বাংলাদেশ কৃষি বিশ্ববিদ্যালয় )BAU was established as the only university of its kind in Bangladesh in 1961. The scheme for the establishment of BAU was finalized on 8 June 1961 and its ordinance was promulgated on 18 August 1961. With the appointment of its first Vice-Chancellor,the university formally came into existence on 2 September 1961 and started functioning with the College of Animal Husbandry and Veterinary Science at Mymensingh as its nucleus. The university has six faculties and 43 departments covering all aspects of agricultural education and research.\r\nBAU is the second highest budgeted public university in Bangladesh for the year 2013-2014. BAU's unparalleled research in agriculture has made it very recognized university in whole ASIA continent. Having a very low ratio of teacher-student, quality of education in BAU is brilliant and remarkable.");
		}
		
		
		
		
	//else tv.setText(s);
		
		
			
}
}