package org.zerock.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import javax.inject.Inject;

import org.springframework.stereotype.Repository;
import org.zerock.domain.OrdersVO;

@Repository
public class OrdersDAOImpl implements OrdersDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "org.zerock.mapper.OrdersMapper";
	
	@Override
	public List<OrdersVO> listAll() throws Exception {
		return session.selectList(namespace + ".listAll");
	}

}
