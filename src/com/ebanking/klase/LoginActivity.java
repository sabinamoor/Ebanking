package com.ebanking.klase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends Activity implements OnClickListener {

	Button login;
	EditText username, password;

	CheckBox check;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		username = (EditText) findViewById(R.id.etUsername);
		password = (EditText) findViewById(R.id.etPassword);
		login = (Button) findViewById(R.id.bLogin);
		check = (CheckBox) findViewById(R.id.cbCheck);

		login.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {

		Intent intent = new Intent(this, CustomList.class);

		// calling an activity using <intent-filter> action name
		// Intent inent = new Intent("com.hmkcode.android.ANOTHER_ACTIVITY");
		finish();
		startActivity(intent);
	}

}