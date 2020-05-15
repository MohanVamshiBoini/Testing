package com.pdw.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test_s12")
public class Test {
	@Id 
	private String testId;
	@Column(length=20)
	private String testName;

	public String getTestId() {
		return testId;
	}
	public void setTestId(String testId) {
		this.testId = testId;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	@Override
	public String toString() {
		return "Test [testId=" + testId + ", testName=" + testName + "]";
	}
	
	public Test() {
	}

}


