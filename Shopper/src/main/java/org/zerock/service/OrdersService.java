package org.zerock.service;

import java.util.List;

import org.zerock.domain.OrdersVO;

public interface OrdersService {
	
	public List<OrdersVO> listAll() throws Exception;
	
}
