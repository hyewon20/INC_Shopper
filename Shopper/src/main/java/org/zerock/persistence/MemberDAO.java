package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.MemberVO;

public interface MemberDAO {
	
	public List<MemberVO> listAll() throws Exception;
	
}
