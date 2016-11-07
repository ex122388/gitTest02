package com.bookshop01.member.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookshop01.member.vo.MemberBean;

public interface MemberDao {
	public MemberBean login(MemberBean memberBean) throws Exception;
	public void addMember(MemberBean memberBean) throws Exception;
	public String selectOverlapedId(String id) throws Exception;
	
	
}
