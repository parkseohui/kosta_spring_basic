package kosta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kosta.service.HelloService;


@Controller
public class HelloController {
	private HelloService service;

	public void setService(HelloService service) {
		this.service = service;
	}

	
 @RequestMapping("/hello.do")
 public ModelAndView hello(){
	 ModelAndView mav=new ModelAndView();
	 mav.addObject("message","hello spring!!!!");
	 mav.addObject("message2", service.getMessage());
	 mav.setViewName("hello");
	 
	 return mav;
 }
 
}
