package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.OrdersVO;

public interface OrdersDAO {
	
	public List<OrdersVO> listAll() throws Exception;

}
