package kosta.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		//2줄이 나오는건 스프링 의존관계가 잘 설정되어있다는 뜻입니다.
		Resource resource=new ClassPathResource("applicationContext.xml");
		
		
		/*BeanFactory factory=new GenericXmlApplicationContext(resource);*/
		
		/*ApplicationContext factory=new GenericXmlApplicationContext(resource);*/
		
		ApplicationContext factory=new AnnotationConfigApplicationContext(Factory.class);
		Service service=(Service)factory.getBean("writeService");
		service.insert();
	
	}
	

}
