package com.example.persistence;

import java.util.ArrayList;
import java.util.List;

import com.example.domain.MemberVO;

public interface MemberDAO {
	public List<MemberVO> list();
	public void insert(MemberVO vo);
}
