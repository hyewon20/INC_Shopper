package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.PaymentVO;

@Repository
public class PaymentDAOImpl implements PaymentDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "org.zerock.mapper.PaymentMapper";
	
	@Override
	public List<PaymentVO> listAll() throws Exception {
		return session.selectList(namespace + ".listAll");
	}

}
