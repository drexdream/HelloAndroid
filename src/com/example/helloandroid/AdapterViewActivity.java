package com.example.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AdapterViewActivity extends Activity{
	
	public static final String[] GUBUN = {"서울특별시", "경기도", "인천광역시", 
										  "강원도", 
										  "충청도", "대전광역시", 
										  "전라도", "광주광역시", 
										  "경상도", "대구광역시", "부산광역시", "울산광역시"};
	
	private ArrayAdapter<String> adapter;
	private ListView list;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);	
		setContentView(R.layout.activity_adapter_view);
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice, GUBUN);
		list = (ListView) findViewById(R.id.listView1);
		list.setAdapter(adapter);
		list.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
	};
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		return super.onCreateOptionsMenu(menu);
	}
}