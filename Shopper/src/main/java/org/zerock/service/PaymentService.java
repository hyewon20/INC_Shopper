package org.zerock.service;

import java.util.List;

import org.zerock.domain.PaymentVO;

public interface PaymentService {
	public List<PaymentVO> listAll() throws Exception;
}
