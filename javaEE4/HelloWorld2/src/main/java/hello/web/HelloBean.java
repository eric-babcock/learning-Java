package hello.web;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HelloBean {

	public String getMessage() {
		return "Hello, Course!";
	}
}