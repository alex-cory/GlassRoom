package com.GlassHack.glassroom;

public class Student {
	private String name;
	private int _id;
	private int correctEnglish;
	private int English;
	private int correctMath;
	private int Math;
	private int correctScience;
	private int Science;
	
	public Student() {
		name = "Fake";
		_id = 0;
		correctEnglish = 0;
		English = 0;
		correctMath = 0;
		Math = 0;
		correctScience = 0;
		Science = 0;
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
		return _id;
	}

	public void setId(int id) {
		this._id = id;
	}

	public int getCorrectEnglish() {
		return correctEnglish;
	}

	public void setCorrectEnglish(int correctEnglish) {
		this.correctEnglish = correctEnglish;
	}

	public int getEnglish() {
		return English;
	}

	public void setEnglish(int incorrectEnglish) {
		this.English = incorrectEnglish;
	}

	public int getCorrectMath() {
		return correctMath;
	}

	public void setCorrectMath(int correctMath) {
		this.correctMath = correctMath;
	}

	public int getMath() {
		return Math;
	}

	public void setMath(int incorrectMath) {
		this.Math = incorrectMath;
	}

	public int getCorrectScience() {
		return correctScience;
	}

	public void setCorrectScience(int correctScience) {
		this.correctScience = correctScience;
	}

	public int getScience() {
		return Science;
	}

	public void setScience(int incorrectScience) {
		this.Science = incorrectScience;
	}
	
	public String toString() {
		return this.name +"\n" + "English: "+String.valueOf(this.correctEnglish) + " " + String.valueOf(this.English) +
				"\n Science: " + String.valueOf(this.correctScience) + " " + String.valueOf(this.Science) + "\n"
				+ "Math: " + String.valueOf(this.correctMath) + " " + String.valueOf(this.Math);
				
	}
}
