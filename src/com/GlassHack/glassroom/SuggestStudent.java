package com.GlassHack.glassroom;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SuggestStudent extends Activity {
	
	DatabaseHandler db;
	private List<Student> students;
	private List<Student> sortedStudents;
	private String subject; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		db = new DatabaseHandler(this);
		subject = getIntent().getExtras().getString("subject");
		students = db.getAllContacts();
		Comparator<Student> subjectComp = new SubjectComparator(subject);
		Collections.sort(students, subjectComp);
		
		LinearLayout ll = new LinearLayout(this);
		setContentView(ll);
		
		for(Student cn : students) {
			TextView current = new TextView(this);
			current.setText(cn.toString());
			ll.addView(current);
		}
		
	}
	
	@Override
    public boolean onKeyDown(int keycode, KeyEvent event) {
        if (keycode == KeyEvent.KEYCODE_DPAD_CENTER) {
            Intent intent = new Intent(this,QuestionActivity.class);
            intent.putExtra("subject", subject);
            startActivity(intent);
            return true;
        }
        super.onKeyDown(keycode, event);
        return false;
    }
}
