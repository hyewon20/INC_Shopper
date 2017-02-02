package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.PaymentVO;
import org.zerock.persistence.PaymentDAO;

@Service
public class PaymentServiceImpl implements PaymentService{
	
	@Inject
	private PaymentDAO dao;
	
	@Override
	public List<PaymentVO> listAll() throws Exception {
		
		return dao.listAll();
		
	}
}
