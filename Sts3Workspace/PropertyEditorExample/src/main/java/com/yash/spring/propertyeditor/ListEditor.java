package com.yash.spring.propertyeditor;

import java.beans.PropertyEditorSupport;
import java.util.Arrays;
import java.util.List;

public class ListEditor extends PropertyEditorSupport{
	
	public void setAsText(String text){
		
		String str[] = text.split(",");
		
		List<String> stringList = Arrays.asList(str);
		
		this.setValue(stringList);
	}
		

}
