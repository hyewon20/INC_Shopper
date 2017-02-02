package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.MemberVO;
import org.zerock.domain.PaymentVO;

public interface PaymentDAO {
	
	public List<PaymentVO> listAll() throws Exception;
	
}
