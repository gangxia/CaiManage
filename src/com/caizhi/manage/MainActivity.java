package com.caizhi.manage;

import cn.bmob.v3.Bmob;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	private EditText mPassword;
	private Button mSure;
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		  Bmob.initialize(this, "be6d4c3ee21034082084d0b53005a37d");
		  mPassword=(EditText)findViewById(R.id.password);
		  mSure=(Button)findViewById(R.id.sure);
		  mSure.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if ("12345654321".equals(mPassword.getText().toString())) {
					
				
				Intent intent=new Intent(MainActivity.this,ManageActivity.class);
				startActivity(intent);
			}
			}
		});
	}
}
