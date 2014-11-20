package com.ebanking.klase;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class Tabs extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tabs);
		TabHost th=(TabHost) findViewById(R.id.tabhost);
		th.setup();
		TabSpec specs = th.newTabSpec("tag1");
		specs.setContent(R.id.tab1);
		specs.setIndicator("Uplata");
		th.addTab(specs);
		specs = th.newTabSpec("tag2");
		specs.setContent(R.id.tab2);
		specs.setIndicator("Transakcije");
		th.addTab(specs);
	    specs = th.newTabSpec("tag3");
		specs.setContent(R.id.tab3);
		specs.setIndicator("Detalji");
		th.addTab(specs);
	}

}
