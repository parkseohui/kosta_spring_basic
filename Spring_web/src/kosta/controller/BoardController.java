package kosta.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kosta.model.Board;
import kosta.service.HelloService;

@Controller
public class BoardController {
	//action같은 역할을 하는구낭
	@RequestMapping(value="/board_insert", method=RequestMethod.GET)
	public String insertform(@ModelAttribute("boardCommand") Board board) {
		return "insert_form";
	}
	

	@RequestMapping(value = "/board_insert", method = RequestMethod.POST)
	public String board_insert(@ModelAttribute("boardCommand") @Valid Board board,BindingResult errors) {
		if(errors.hasErrors()){
			System.out.println("에러발생");
			return "insert_form";
		}
		
		System.out.println(board);
		return "";
	}
}
