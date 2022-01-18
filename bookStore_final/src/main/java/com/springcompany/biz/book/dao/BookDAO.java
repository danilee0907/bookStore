package com.springcompany.biz.book.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springcompany.biz.paging.PagingVO;

@Repository
public class BookDAO {
	@Autowired
	SqlSessionTemplate mybatis;
	
	// 글 등록
		public void insertBook(BookVO vo) {//저장할 거 입력받음.
			mybatis.insert("BookDAO.insertBook",vo);
		
		}
		


		// 글 목록 조회
		public List<BookVO> getBookList(BookVO vo){

			if(vo.getSearchCondition().equals("TITLE")) {
				return mybatis.selectList("BookDAO.getBookList_T", vo);
			
			} else if(vo.getSearchCondition().equals("CONTENT")) {
			
				return mybatis.selectList("BookDAO.getBookList_C",vo);
				
			}else if(vo.getSearchCondition().equals("WRITER")) {
			
				return mybatis.selectList("BookDAO.getBookList_W",vo);
				
			}  else {
				
				return mybatis.selectList("BookDAO.getBookList_T", vo);
			}
				

		}
		
		//책 개수 조회
		public int countBook() {
			return mybatis.selectOne("BookDAO.countBook");
		}
		
		// 글 상세 조회
		public BookVO getBook(int bookNum) {
		
			mybatis.update("BookDAO.readCountUpdate", bookNum);
			return mybatis.selectOne("BookDAO.getBook", bookNum);
		}
		
		// 글 수정
		public void updateBook(BookVO vo) {
			mybatis.update("BookDAO.updateBook",vo);
		}
		
		// 글 삭제
		public void deleteBook(int bookNum) {
			mybatis.delete("BookDAO.deleteBook",bookNum);
		}
		
		// 인기 책 조회
		public List<BookVO> topBook(int rnum){
			return mybatis.selectList("BookDAO.topBook",rnum);
		}
		//  최신 책 조회
		public List<BookVO> newBook(int rnum){
			return mybatis.selectList("BookDAO.newBook",rnum);
		}
}
