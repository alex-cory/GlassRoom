package com.GlassHack.glassroom;

public class Student {
	private String name;
	private int id;
	private int correctEnglish;
	private int incorrectEnglish;
	private int correctMath;
	private int incorrectMath;
	private int correctScience;
	private int incorrectScience;
	
	public Student() {
		name = "Fake";
		id = 0;
		correctEnglish = 0;
		incorrectEnglish = 0;
		correctMath = 0;
		incorrectMath = 0;
		correctScience = 0;
		incorrectScience = 0;
	}
	
	public Student(String name, int id){
		this.setName(name);
		this.setId(id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCorrectEnglish() {
		return correctEnglish;
	}

	public void setCorrectEnglish(int correctEnglish) {
		this.correctEnglish = correctEnglish;
	}

	public int getEnglish() {
		return incorrectEnglish;
	}

	public void setEnglish(int incorrectEnglish) {
		this.incorrectEnglish = incorrectEnglish;
	}

	public int getCorrectMath() {
		return correctMath;
	}

	public void setCorrectMath(int correctMath) {
		this.correctMath = correctMath;
	}

	public int getMath() {
		return incorrectMath;
	}

	public void setMath(int incorrectMath) {
		this.incorrectMath = incorrectMath;
	}

	public int getCorrectScience() {
		return correctScience;
	}

	public void setCorrectScience(int correctScience) {
		this.correctScience = correctScience;
	}

	public int getScience() {
		return incorrectScience;
	}

	public void setScience(int incorrectScience) {
		this.incorrectScience = incorrectScience;
	}
}
