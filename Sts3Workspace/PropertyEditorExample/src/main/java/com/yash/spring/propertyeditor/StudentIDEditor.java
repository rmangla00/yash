package com.yash.spring.propertyeditor;

import java.beans.PropertyEditorSupport;

public class StudentIDEditor extends PropertyEditorSupport{

	//A99-102
	public void setAsText(String text){
		
		String s1 = text.substring(0,3);
		String s2 = text.substring(4);
		
		StudentID studentID = new StudentID(s1, Integer.parseInt(s2));
		this.setValue(studentID);
	}
	
}
