package com.springcompany.biz.review.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcompany.biz.book.dao.BookVO;
import com.springcompany.biz.review.dao.BookReviewDAO;
import com.springcompany.biz.review.dao.BookReviewVO;

@Service
public class BookReviewServiceImpl implements BookReviewService{
	
	@Autowired
	BookReviewDAO bookReviewDAO;

	@Override
	public void insertService(BookReviewVO vo) {
		bookReviewDAO.insertBookReview(vo);
		
	}

	@Override
	public List<BookReviewVO> getServiceList(int bookNum) {
		// TODO Auto-generated method stub
		return bookReviewDAO.getBookReviewList(bookNum);
	}

	@Override
	public void updateService(BookReviewVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteService(int reviewNum) {
		// TODO Auto-generated method stub
		
		bookReviewDAO.deleteReview(reviewNum);
		
	}

}
