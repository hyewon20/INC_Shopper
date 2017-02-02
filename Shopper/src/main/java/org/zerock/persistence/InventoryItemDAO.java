package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.InventoryItemVO;

public interface InventoryItemDAO {
	
	// select one
	public InventoryItemVO read(String itemName) throws Exception;
	
	// select list
	public List<InventoryItemVO> listAll() throws Exception;
	
	// select list using paging function
	public List<InventoryItemVO> listPaging(int page) throws Exception;
	
	// select list using category
	public List<InventoryItemVO> listCategory(String category) throws Exception;
	
}
