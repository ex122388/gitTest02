package com.bookshop01.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface MemberController {
	public ModelAndView idOverlapped(HttpServletRequest request, HttpServletResponse response)  throws Exception;
}
