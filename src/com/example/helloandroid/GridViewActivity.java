package com.example.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class GridViewActivity extends Activity implements AdapterView.OnItemClickListener{
	
	private TextView tv;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);	
		setContentView(R.layout.activity_gridview);
		
		System.out.println("GUBUN.length = " + AdapterViewActivity.GUBUN.length);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.layout_gridview, AdapterViewActivity.GUBUN);
		GridView gridView = (GridView) findViewById(R.id.gridView1);
		gridView.setAdapter(adapter);
		gridView.setOnItemClickListener(this);
		tv = (TextView) findViewById(R.id.textView);
	};
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		tv.setText(AdapterViewActivity.GUBUN[position]);	
	}
}