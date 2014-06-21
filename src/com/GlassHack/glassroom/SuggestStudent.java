package com.GlassHack.glassroom;

import java.util.List;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.glass.app.Card;

public class SuggestStudent extends Activity implements OnClickListener {
	
	
	DatabaseHandler db;
	private List<Student> students;
	private List<Student> sortedStudents;
	private String subject; 
	private Student currLowest;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		db = new DatabaseHandler(this);
		
		students = db.getAllContacts();
		currLowest = students.get(0);
		for(Student cn : students) {
//			currLowest.getEnglish() = cn.getId();
			
		}
		Card card = new Card(this);
		View vCard = card.getView();
		card.setImageLayout(Card.ImageLayout.LEFT);
		card.addImage(R.drawable.mattprof);
		card.setText("Matthew Normyle");
		card.setFootnote("Sanat Moningi \n Alex Cory");
		card.setFocusable(true);
		vCard.setOnClickListener(this);
    	setContentView(vCard);
	}
	
	@Override
	public void onClick(DialogInterface dialog, int which) {
		Intent suggestIntent = new Intent(this, QuestionActivity.class);
		suggestIntent.putExtra("subject", subject);
		startActivity(suggestIntent);
	}
}
