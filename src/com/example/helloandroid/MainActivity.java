package com.example.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        TextView myText = new TextView(this);
//        myText.setText("이재인입니다.!!!");
//        setContentView(myText);
        
        RadioGroup rg = (RadioGroup) findViewById(R.id.rgroup);
        rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				RadioButton radioButton = (RadioButton) findViewById(checkedId);
		    	String str = radioButton.getText().toString();
		    	Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    } 
    
    public void btnJaeinOnClick(View v){
    	String str = "사랑해";
    	Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
    }

    /**
     * 체크박스 페이지로 이동 
     * @param v
     */
    public void btnMoveCheckBoxPage(View v){
    	Intent intent = new Intent(this, CheckBoxActivity.class);
    	startActivity(intent);
    }
    
    /**
     * 아답터 뷰 페이지로 이동
     * @param v
     */
    public void btnMoveAdapterViewPage(View v){
    	Intent intent = new Intent(this, AdapterViewActivity.class);
    	startActivity(intent);
    }
    
    /**
     * Grid 뷰 페이지로 이동
     * @param v
     */
    public void btnMoveGridViewPage(View v){
    	Intent intent = new Intent(this, GridViewActivity.class);
    	startActivity(intent);
    }
    
    /**
     * Gallery 페이지로 이동
     * @param v
     */
    public void btnMoveGalleryPage(View v){
    	Intent intent = new Intent(this, GalleryActivity.class);
    	startActivity(intent);
    }
    
    public void btnCloseOnClick(View v){
    	finish();
    } 
}
