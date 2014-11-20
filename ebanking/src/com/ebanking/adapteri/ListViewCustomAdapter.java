package com.ebanking.adapteri;

import java.util.ArrayList;

import com.ebanking.klase.R;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListViewCustomAdapter extends BaseAdapter {
	
	public ArrayList<String> class_names;
	public ArrayList<String>photos;
	public Activity context;
	public LayoutInflater inflater;
	
	


	public ListViewCustomAdapter(Activity context,
			ArrayList<String> class_names, ArrayList<String> photos) {
		super();
		this.class_names = class_names;
		this.photos = photos;
		this.context = context;
		
		this.inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}
	
	
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
public class ViewHolder{
	ImageView thumbnail;
	TextView tvClass;

}

public View getView(int position, View convertView, ViewGroup parent) {
	// TODO Auto-generated method stub
	ViewHolder holder;
	if(convertView==null){
		holder=new ViewHolder();
		convertView=inflater.inflate(R.layout.listview_row, null);
		holder.thumbnail=(ImageView) convertView.findViewById(R.id.ivNext);
		holder.tvClass=(TextView) convertView.findViewById(R.id.tvKlase);
		convertView.setTag(holder);
	}else{
		holder=(ViewHolder) convertView.getTag();
		holder.thumbnail.setImageResource(R.drawable.ic_list_more);
		holder.tvClass.setText(class_names.get(position));
	}
	return convertView;
}

}
