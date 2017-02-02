package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.InventoryItemVO;

@Repository
public class InventoryItemDAOImpl implements InventoryItemDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "org.zerock.mapper.InventoryItemMapper";
	
	@Override
	public InventoryItemVO read(String itemName) throws Exception {
		
		return null;
	}

	@Override
	public List<InventoryItemVO> listAll() throws Exception {

		return session.selectList(namespace + ".listAll");
	}

	@Override
	public List<InventoryItemVO> listPaging(int page) throws Exception {

		
		return null;
	}

	@Override
	public List<InventoryItemVO> listCategory(String category) throws Exception {

		
		return null;
	}

	
}
