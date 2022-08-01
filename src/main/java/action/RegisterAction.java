package action;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;

import com.opensymphony.xwork2.ActionSupport;


public class RegisterAction extends ActionSupport{
String name,email,pass,gender,color;
Integer age;
List<String> colours;


public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public List<String> getColours() {
	return colours;
}

public void setColours(List<String> colours) {
	this.colours = colours;
}

public String execute() {
	System.out.println("color "+color+" name  : "+name+"  age : "+age+"  gender : "+gender+"  email : "+email+"   pass : "+pass);
	return SUCCESS;
}

public String initializeColors() {
	colours= new ArrayList<>();
	colours.add("Red");
	colours.add("Blue");
	colours.add("Black");
	colours.add("Green");
	
	return "input";
}

//public void validate() {
//	if(name.equals("")) {
//		addFieldError("name", "Name is required field.");
//	}
//	if(email.equals("")) {
//		addFieldError("email", "Email is required field.");
//	}
//	if(pass.equals("")) {
//		addFieldError("pass", "Pass is required field.");
//	}
//	if(gender==null) {
//		addFieldError("gender", "Gender is required field.");
//	}
//	if(age==null) {
//		addFieldError("age", "Age is required field.");
//	}
//	else if(age<18) {
//		addFieldError("age", "Age should be above 18.");
//	}
//}


public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public Integer getAge() {
	return age;
}

public void setAge(Integer age) {
	this.age = age;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPass() {
	return pass;
}

public void setPass(String pass) {
	this.pass = pass;
}

}
