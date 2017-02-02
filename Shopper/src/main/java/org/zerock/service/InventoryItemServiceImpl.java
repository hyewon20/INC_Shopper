package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.InventoryItemVO;
import org.zerock.persistence.InventoryItemDAO;

@Service
public class InventoryItemServiceImpl implements InventoryItemService{
	
	@Inject
	private InventoryItemDAO dao;

	@Override
	public List<InventoryItemVO> listAll() throws Exception {
		return dao.listAll();
	}
	

}
