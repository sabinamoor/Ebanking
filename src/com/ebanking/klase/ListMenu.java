package com.ebanking.klase;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListMenu extends ListActivity {

	String classes[] = { "Uplata", "Transakcije", "Detalji", "Više..." };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(ListMenu.this,
				android.R.layout.simple_list_item_1, classes));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String Kliknuti = classes[position];

		try {
			if (Kliknuti == classes[0]) {
				Intent intent = new Intent(this, Tabs.class);
				startActivity(intent);
			} else {
				Class ourClass = Class
						.forName("com.ebanking.klase." + Kliknuti);
				Intent ourIntent = new Intent(ListMenu.this, ourClass);
				startActivity(ourIntent);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}