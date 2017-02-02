package org.zerock.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zerock.domain.MemberVO;
import org.zerock.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Inject
	private MemberService service;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void readAll() throws Exception {
		
		System.out.println("readAll()");
		List<MemberVO> result; 
		
		result = service.listAll();
		
		for(int i = 0; i<result.size(); i++){
			System.out.println(result.get(i));
		}
		
		
	}
	
}
