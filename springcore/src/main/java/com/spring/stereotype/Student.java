package com.spring.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student 
{
	@Value("Sachin")
	private String studName;
	@Value("122")
	private String studRoll;
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStudRoll() {
		return studRoll;
	}
	@Override
	public String toString() {
		return "Student [studName=" + studName + ", studRoll=" + studRoll + "]";
	}
	public void setStudRoll(String studRoll) {
		this.studRoll = studRoll;
	}
	
}
