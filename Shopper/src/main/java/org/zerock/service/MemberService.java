package org.zerock.service;

import java.util.List;

import org.zerock.domain.MemberVO;

public interface MemberService {
	
	public List<MemberVO> listAll() throws Exception;

}
