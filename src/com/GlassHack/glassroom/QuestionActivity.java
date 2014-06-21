package com.GlassHack.glassroom;

import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.widget.TextView;

public class QuestionActivity extends Activity {

	TextView txtview_speechresults;
	String subject;
	String name;
	String quality;
	private static final int SPEECH_REQUEST = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_question);
		Intent intent = getIntent();
		subject = intent.getStringExtra();
		displaySpeechRecognizer();
	}

	private void displaySpeechRecognizer() {
	    Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
	    intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Say the students name and quality of answer.");
	    startActivityForResult(intent, SPEECH_REQUEST);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	        Intent data) {
	    if (requestCode == SPEECH_REQUEST && resultCode == RESULT_OK) {
	        List<String> results = data.getStringArrayListExtra(
	                RecognizerIntent.EXTRA_RESULTS);
	        String string = results.get(0);
		    String[] parts = string.split(" ");
		    name = parts[0]+parts[1];
		    quality = parts[2];
		    inputData();
	    }
	    super.onActivityResult(requestCode, resultCode, data);
	}
	
	public void inputData() {
		
	}

}
