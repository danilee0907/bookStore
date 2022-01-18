package com.springcompany.biz.basket.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springcompany.biz.basket.dao.BasketVO;

@Repository
public class BasketDAO {
	@Autowired
	SqlSessionTemplate mybatis;
	
		// 장바구니 등록
	
		public void insertBasket(BasketVO vo) {
			mybatis.insert("BasketDAO.insertBasket",vo);
		
		}
		
		// 장바구니 목록
		
		public List<BasketVO> getBasketList(String id){

		return mybatis.selectList("BasketDAO.getBasketList", id);

		}
		
		//장바구니 중복 확인
			public int countBasket(int bookNum) {
			
			return mybatis.selectOne("BasketDAO.countBasket", bookNum);
		}
		
		  //장바구니 상세
		  
		  public BasketVO getBasket(int basketNum) {
		  
		  return mybatis.selectOne("BasketDAO.getBasket", basketNum); }
		 
		
		  // 글 수정 
		  
		  public void updateBasket(BasketVO vo) {
		  mybatis.update("BasketDAO.updateBasket",vo); }
		 
				
		// 글 삭제
		public void deleteBasket(int basketNum) {
			mybatis.delete("BasketDAO.deleteBasket",basketNum);
		}
		
		//수량 변경
		public void changeBasket(BasketVO vo) {
			mybatis.update("BasketDAO.changeBasket",vo);
			
		}
		
		//결제
		
		public BasketVO buyBasket(int basketNum) {
			
			return mybatis.selectOne("BasketDAO.buyBasket", basketNum);
		}



	
		
		
		
		

	
}
