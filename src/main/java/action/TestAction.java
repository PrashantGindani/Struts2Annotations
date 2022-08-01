package action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

@Results({
@Result(name="success", location="/Success.jsp"),
@Result(name="error", location="/Error.jsp")
})
@Action("/testAction")
public class TestAction extends ActionSupport{
	String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String execute() {
		System.out.println("execute()  called");
		message="Success Message--";
		return SUCCESS;
	}

}
