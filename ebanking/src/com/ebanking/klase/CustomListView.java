package com.ebanking.klase;

import java.util.ArrayList;

import com.ebanking.adapteri.ListViewCustomAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class CustomListView extends Activity {
	
	ListView izbornik;
	ArrayList<String>klase;
	ArrayList<String>photos;
	
	ListViewCustomAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list);
		
		izbornik=(ListView) findViewById(R.id.lvLista);
		fillData();
		
		adapter=new ListViewCustomAdapter(this,klase,photos);
		izbornik.setAdapter(adapter);
		
	}

	private void fillData() {
		// TODO Auto-generated method stub
		klase = new ArrayList<String>();
		  photos = new ArrayList<String>();
		  
		  klase.add("Uplata");
		  klase.add("Transakcije");
		  klase.add("Detalji");
		  klase.add("Više..");
		
		  
		  photos.add("1 photo");
		 
	
	}

}
