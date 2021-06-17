package com.luv2code.springdemomvc;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	private String fname;
	private String lname;
	private String country;
	private String education;
	private String mylangauge;
	
	public String getMylangauge() {
		return mylangauge;
	}

	public void setMylangauge(String mylangauge) {
		this.mylangauge = mylangauge;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	private LinkedHashMap<String, String> countryList;
	
	
	public String getEducation() {
		return education;
	}

	public LinkedHashMap<String, String> getCountryList() {
		return countryList;
	}

	public Student(){
		countryList = new LinkedHashMap<String, String>();
		countryList.put("Singapore","Singapore");
		countryList.put("India","India");
		countryList.put("South Korea","South Korea");
		countryList.put("Netherland","Netherland" );
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
