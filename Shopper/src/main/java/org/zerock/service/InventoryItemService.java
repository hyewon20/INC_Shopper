package org.zerock.service;

import java.util.List;

import org.zerock.domain.InventoryItemVO;

public interface InventoryItemService {
	public List<InventoryItemVO> listAll() throws Exception;
}
