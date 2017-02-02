package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.OrdersVO;
import org.zerock.persistence.OrdersDAO;

@Service
public class OrdersServiceImpl implements OrdersService{
	
	@Inject
	private OrdersDAO dao;

	@Override
	public List<OrdersVO> listAll() throws Exception {
		return dao.listAll();
	}
	
}
