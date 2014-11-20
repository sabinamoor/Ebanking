package com.ebanking.http;

import com.ebanking.klase.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class HttpExample extends Activity {

	TextView httpStuff;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_http);
		httpStuff = (TextView) findViewById(R.id.tvHttp);
		GetMethodExample test = new GetMethodExample();
		String returned;
		try {
			returned = test.getInternetData();
			httpStuff.setText(returned);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
