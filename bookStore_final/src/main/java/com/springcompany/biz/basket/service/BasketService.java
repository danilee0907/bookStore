package com.springcompany.biz.basket.service;

import java.util.List;

import com.springcompany.biz.basket.dao.BasketVO;



public interface BasketService {
	
	// 글 등록
	void insertService(BasketVO vo);
	
	// 글 목록 조회
	List<BasketVO> getServiceList(String id);
	
	
	 // 글 상세 조회 
	BasketVO getService(int basketNum);
	
	//글 중복 확인
	
	int countBasket(int bookNum);
	 
	 // 글 수정 
	
	void updateService(BasketVO vo);
	 
	
	// 글 삭제
	void deleteService(int basketNum);
	
	//수량 변경
	
	void changeBasket(BasketVO vo);
	
	//결제
	
	BasketVO buyBasket(int basketNum);

	
	


}








