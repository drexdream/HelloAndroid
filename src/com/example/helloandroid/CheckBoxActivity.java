package com.example.helloandroid;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends Activity implements AdapterView.OnItemClickListener {

	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);   
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    //버튼 메소드
    
    
    /**
     * 확인 버튼 클
     * @param v
     */
    public void btnOKOnClick(View v){
    	CheckBox chk1 = (CheckBox) findViewById(R.id.chk1);
        CheckBox chk2 = (CheckBox) findViewById(R.id.chk2);
        CheckBox chk3 = (CheckBox) findViewById(R.id.chk3);
    	
        String[] chkStrArr = new String[3];
        ArrayList<String> resultList = new ArrayList<String>();
        
    	if(chk1.isChecked()){
    		 chkStrArr[0] = chk1.getText().toString();
    	}else{
    		chkStrArr[0] = "";
    	}
    	
    	if(chk2.isChecked()){
    		chkStrArr[1] = chk2.getText().toString();
    	}else{
    		chkStrArr[1] = "";
    	}
    	
    	if(chk3.isChecked()){
    		chkStrArr[2] = chk3.getText().toString();
    	}else{
    		chkStrArr[2] = "";
    	}
    	
    	int chkSum = 0;
    	for(int i=0; i<chkStrArr.length; i++){
    		if(!chkStrArr[i].equals("")){
    			resultList.add(chkStrArr[i]);
    			chkSum++;
    		}
    	}
    	
    	if(chkSum == 0){
    		Toast.makeText(CheckBoxActivity.this, "체크박스를 체크하세요.", Toast.LENGTH_SHORT).show();
    		return;
    	}
    	
    	String resultStr = "";
    	for(int j=0; j<resultList.size(); j++) {
    		if(j < resultList.size() - 1){
    			resultStr += resultList.get(j) + ", ";
    		}else{
    			resultStr += resultList.get(j);
    		}
    	}
    	
    	Toast.makeText(CheckBoxActivity.this, resultStr, Toast.LENGTH_SHORT).show();    	
    }


	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
	}
    
}
