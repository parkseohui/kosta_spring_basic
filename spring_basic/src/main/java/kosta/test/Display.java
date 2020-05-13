package kosta.test;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class Display {
	
	@Autowired
	private Calculate cal;
	
	public void show(){
	int result=cal.calc();
	System.out.println("결과"+result);
	}
	
	public Display(Calculate cal) {
		super();
		this.cal = cal;
	}
}
