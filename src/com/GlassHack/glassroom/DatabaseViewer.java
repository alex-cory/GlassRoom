package com.GlassHack.glassroom;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DatabaseViewer extends Activity {
	
	DatabaseHandler db;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		db = new DatabaseHandler(this);
		LinearLayout ll = new LinearLayout(this);
		setContentView(ll);
		List<Student> students = db.getAllContacts();
		for(Student cn : students) {
			String current = cn.toString();
			TextView txtview = new TextView(this);
			txtview.setText(current);
			ll.addView(txtview);
		}

	}


}
