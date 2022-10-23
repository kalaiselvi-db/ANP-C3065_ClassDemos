package org.anudip.sms.pojo;

public class Student {
	int studentId; // instance variable
	String studentName; //instance variable
	
	// Method signature - access-modifier  return-type method-name (parameters)
	//access modifier names- public, private, protected (if public private or protected - keywords are not used - then modifier applied is default) 
	//return type - void, primitive data type, class name, interface name, Enum name, Arrays
	// method names- verb-Noun combination - camelCasing
	// parameter - any number, parameter type - variable name
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int sid) { // local variable or parameter variable
		boolean status=false; // local variable
		studentId=sid;
	}
	public String getStudentName() {
		return studentName;
	}
	// Method definition 
	public void setStudentName(String sname) {
		studentName=sname;
	}
	
	// with return type - with parameter
	// with return type - without parameter
	// without return type - without parameter
	// without return type and with parameter

}
