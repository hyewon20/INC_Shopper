package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.MemberVO;
import org.zerock.persistence.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Inject
	private MemberDAO dao;

	@Override
	public List<MemberVO> listAll() throws Exception {
		
		return dao.listAll();
	}
}
