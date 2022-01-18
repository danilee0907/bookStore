package com.springcompany.biz.board.service;

import java.util.List;

import com.springcompany.biz.board.dao.BoardVO;

public interface BoardService {
	// CRUD 기능의 메서드 구현
	
	// 글 등록
	void insertService(BoardVO vo);
	
	// 글 목록 조회
	List<BoardVO> getServiceList(BoardVO vo);
	
	// 글 상세 조회
	BoardVO getService(int seq);
	
	// 글 수정
	void updateService(BoardVO vo);
	
	// 글 삭제
	void deleteService(int seq);
	
	//게시글 총 개수
	int countboard();
	
	
	
}








