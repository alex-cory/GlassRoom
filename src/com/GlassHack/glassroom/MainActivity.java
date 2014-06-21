package com.GlassHack.glassroom;


import java.util.ArrayList;
import java.util.List;

import com.google.android.glass.app.Card;
import com.google.android.glass.view.WindowUtils;
import com.google.android.glass.widget.CardScrollAdapter;
import com.google.android.glass.widget.CardScrollView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;

public class MainActivity extends Activity implements OnItemClickListener{

    private List<Card> mCards;
    private CardScrollView mCardScrollView;
    DatabaseHandler db;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // NOT SURE WHAT THIS NEXT LINE DOES. HOW DO I SPECIFY WHAT COMMAND?
        // HELP ME GET HERE BY SAYING. "GLASS IN SESSION" or "HOST A GLASSROOM"
        // getWindow().requestFeature(WindowUtils.FEATURE_VOICE_COMMANDS);
        
        createCards();

        mCardScrollView = new CardScrollView(this);
     // To receive touch events from the touchpad, the view should be focusable.
        // mGestureDetector = createGestureDetector(this);
        mCardScrollView.setOnItemClickListener(this);
        CardScrollAdapter adapter = new ExampleCardScrollAdapter();
        mCardScrollView.setAdapter(adapter);
        mCardScrollView.activate();
        setContentView(mCardScrollView);
        db = new DatabaseHandler(this);
        //fake data
        fakeData();
    }

    private void createCards() {
        mCards = new ArrayList<Card>();

        Card card;

        card = new Card(this);
        card.setText("Biology");
        card.setFootnote("Chapter 13, Biospheres");
        mCards.add(card);

        card = new Card(this);
        card.setText("Literature");
        card.setFootnote("19th Century English");
        mCards.add(card);

        card = new Card(this);
        card.setText("Mathematics");
        card.setFootnote("Elementary differentiation");
        mCards.add(card);
    }
    
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		Intent suggestIntent = new Intent(this, SuggestStudent.class);
		suggestIntent.putExtra("subject", mCards.get(position).getText());
		startActivity(suggestIntent);
	}
    
    private class ExampleCardScrollAdapter extends CardScrollAdapter {

        @Override
        public int getPosition(Object item) {
            return mCards.indexOf(item);
        }

        @Override
        public int getCount() {
            return mCards.size();
        }

        @Override
        public Object getItem(int position) {
            return mCards.get(position);
        }

        @Override
        public int getViewTypeCount() {
            return Card.getViewTypeCount();
        }

        @Override
        public int getItemViewType(int position){
            return mCards.get(position).getItemViewType();
        }

        @Override
        public View getView(int position, View convertView,
                ViewGroup parent) {
            return  mCards.get(position).getView(convertView, parent);
        }
    }
    
    public void fakeData() {
    	Student student1 = new Student();
    	student1.setName("Matthew");
    	Student student2 = new Student();
    	student2.setName("Saleh");
    	Student student3 = new Student();
    	student3.setName("Sanat");
    	Student student4 = new Student();
    	student4.setName("Alex");
    	Student student5 = new Student();
    	student5.setName("David");
    	db.addContact(student1);
    	db.addContact(student2);
    	db.addContact(student3);
    	db.addContact(student4);
    	db.addContact(student5);
    }
}