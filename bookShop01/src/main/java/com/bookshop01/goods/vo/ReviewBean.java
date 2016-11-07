package com.bookshop01.goods.vo;

public class ReviewBean {
 private String review_id;
 private String member_id;
 private String goods_id;
 private String review_pw;
 private String review_title;
 private String review_content;
 private String review_date;
 private int chapter;
 private int pageNum;
 
 
public int getChapter() {
	return chapter;
}
public void setChapter(int chapter) {
	this.chapter = chapter;
}
public int getPageNum() {
	return pageNum;
}
public void setPageNum(int pageNum) {
	this.pageNum = pageNum;
}
public String getReview_id() {
	return review_id;
}
public void setReview_id(String review_id) {
	this.review_id = review_id;
}
public String getMember_id() {
	return member_id;
}
public void setMember_id(String member_id) {
	this.member_id = member_id;
}
public String getGoods_id() {
	return goods_id;
}
public void setGoods_id(String goods_id) {
	this.goods_id = goods_id;
}
public String getReview_pw() {
	return review_pw;
}
public void setReview_pw(String review_pw) {
	this.review_pw = review_pw;
}
public String getReview_title() {
	return review_title;
}
public void setReview_title(String review_title) {
	this.review_title = review_title;
}
public String getReview_content() {
	return review_content;
}
public void setReview_content(String review_content) {
	this.review_content = review_content;
}
public String getReview_date() {
	return review_date;
}
public void setReview_date(String review_date) {
	this.review_date = review_date;
}



}