package com.ebanking.klase;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class CustomList extends Activity {
	
	String[] myItems = { "Uplata", "Transakcije", "Detalji", "Više..." };
	ListView list;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list);
		list=(ListView) findViewById(R.id.lvLista);
		populateListView();
		registerClickCallback();

	}



	private void populateListView() {
		// TODO Auto-generated method stub
	
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, myItems);
		
		
		
		list.setAdapter(adapter);
	}
	
	private void registerClickCallback() {
		// TODO Auto-generated method stub
		
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View viewClicked,
					int position, long id) {
				// TODO Auto-generated method stub
				TextView tv=(TextView)viewClicked;
			
				String Kliknuti = myItems[position];

				try {
					if (Kliknuti == myItems[0]) {
						Intent intent = new Intent(CustomList.this, Tabs.class);
						startActivity(intent);
					} else {
						Class ourClass = Class
								.forName("com.ebanking.klase." + Kliknuti);
						Intent ourIntent = new Intent(CustomList.this, ourClass);
						startActivity(ourIntent);
					}
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
			
		});
	}

}
