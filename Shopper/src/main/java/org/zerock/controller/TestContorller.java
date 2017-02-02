package org.zerock.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.zerock.domain.InventoryItemVO;
import org.zerock.domain.OrdersVO;
import org.zerock.domain.PaymentVO;
import org.zerock.service.InventoryItemService;
import org.zerock.service.OrdersService;
import org.zerock.service.PaymentService;

@Controller
@RequestMapping("/test/*")
public class TestContorller {
	
	
	/*
	@Inject
	private InventoryItemService service;
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public void readAll() throws Exception{
		
		System.out.println("InventoryItem : readAll()");
		List<InventoryItemVO> result;
		
		result = service.listAll();
		
		for(int i = 0; i<result.size(); i++){
			System.out.println(result.get(i));
		}
	}
	
	*/
	/*
	@Inject
	private OrdersService service;
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public void readAll() throws Exception{
		
		System.out.println("Orders : readAll()");
		List<OrdersVO> result;
		
		result = service.listAll();
		
		for(int i = 0; i<result.size(); i++){
			System.out.println(result.get(i));
		}
	}
	*/
	
	@Inject
	private PaymentService service;
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView readAll() throws Exception{
		
		System.out.println("Payment : readAll()");
		List<PaymentVO> result;
		
		result = service.listAll();
		
		for(int i = 0; i<result.size(); i++){
			System.out.println(result.get(i));
		}
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("test/mandoo");
		mav.addObject("result", "resultData");
		
		return mav;
	}

}
