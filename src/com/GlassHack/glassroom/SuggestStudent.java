package com.GlassHack.glassroom;

import com.google.android.glass.app.Card;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class SuggestStudent extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Card card = new Card(this);
		card.setImageLayout(Card.ImageLayout.LEFT);
		card.addImage(R.drawable.mattprof);
		card.setText("Matthew Normyle");
		card.setFootnote("Absolute idiot. 0/30");
    	setContentView(card.getView());
	}
}
