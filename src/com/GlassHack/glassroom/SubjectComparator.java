package com.GlassHack.glassroom;

import java.util.Comparator;

public class SubjectComparator  implements Comparator<Student> {
	 
		private String subject;
	
	  public SubjectComparator(String subject) {
		 this.subject = subject;
	  }
	  
	  @Override
	  public int compare(Student x, Student y) {
	    if(subject.equals("English")) {
	    	if(x.getCorrectEnglish()>y.getCorrectEnglish() )
	    		return 1;
	    	if(x.getCorrectEnglish()<y.getCorrectEnglish() )
	    		return -1;
	    	if(x.getCorrectEnglish()==y.getCorrectEnglish() )
	    		return 0;
	    }
	    else if(subject.equals("Science")) {
	    	if(x.getCorrectScience()>y.getCorrectScience() )
	    		return 1;
	    	if(x.getCorrectScience()<y.getCorrectScience() )
	    		return -1;
	    	if(x.getCorrectScience()==y.getCorrectScience() )
	    		return 0;
	    }
	    else if(subject.equals("Math")) {
	    	if(x.getCorrectMath()>y.getCorrectMath() )
	    		return 1;
	    	if(x.getCorrectMath()<y.getCorrectMath() )
	    		return -1;
	    	if(x.getCorrectMath()==y.getCorrectMath() )
	    		return 0;
	    }
	    return 0;
	  }

	 
	}