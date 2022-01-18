package com.springcompany.biz.book.service;

import java.util.List;

import com.springcompany.biz.book.dao.BookVO;

public interface BookService {
	// CRUD 기능의 메서드 구현
	
	// 글 등록
	void insertService(BookVO vo);
	
	// 글 목록 조회
	List<BookVO> getServiceList(BookVO vo);
	
	// 글 상세 조회
	BookVO getService(int seq);
	
	// 글 수정
	void updateService(BookVO vo);
	
	// 글 삭제
	void deleteService(int seq);
	
	// 게시물 총 갯수
	int countBook();
		
	// 인기 책 리스트
	List<BookVO> getTopList(int rnum);
		
	//새 책 리스트
	List<BookVO> getNewList(int rnum);
}








