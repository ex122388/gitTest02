package com.bookshop01.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookshop01.member.vo.MemberBean;




public interface MemberService {
	public MemberBean login(MemberBean memberBean) throws Exception;
	public void addMember(MemberBean memberBean) throws Exception;
	public String idOverlapped(String id) throws Exception;
	
	
}
