package com.example.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	@Inject
	private SqlSession session;	//데이터베이스 Connection 객체
	private static final String namespace="memberMapper";
	
	@Override
	public List<MemberVO> list() {
		return session.selectList(namespace + ".list");
	}

	@Override
	public void insert(MemberVO vo) {
		// TODO Auto-generated method stub
		
	}

}
