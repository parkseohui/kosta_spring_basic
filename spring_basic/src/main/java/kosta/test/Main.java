package kosta.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource resource = new ClassPathResource("applicationContext.xml");

		BeanFactory factory = new GenericXmlApplicationContext(resource);
		//명시적 방법으로 객체간의 의존관계를 설정
		//생성자, 프로퍼티방식
		
		/*Service service=(Service)factory.getBean("calculate");
		service.insert();*/
		
		Display dis=(Display)factory.getBean("display");
		dis.show();
	}

}
