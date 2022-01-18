package com.springcompany.biz.review.service;

import java.util.List;

import com.springcompany.biz.book.dao.BookVO;
import com.springcompany.biz.review.dao.BookReviewVO;

public interface BookReviewService {
	//덧글 등록
	void insertService(BookReviewVO vo);
	
	//덧글 목록 조회
	List<BookReviewVO> getServiceList(int bookNum);
	
	//덧글 수정
	void updateService(BookReviewVO vo);
	
	//덧글 삭제
	void deleteService(int reviewNum);

}
