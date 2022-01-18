package com.springcompany.biz.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Method2_BoardDAO {
	
	DataSource ds;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	@Autowired
	SqlSessionTemplate mybatis;
	
	// CRUD 기능의 메서드 구현
	// 글 등록
	public void insertBoard(BoardVO vo) {
		mybatis.insert("BoardDAO.insertBoard", vo);
	}
	
	
	// 글 목록 조회
	public List<BoardVO> getBoardList(BoardVO vo){	
		return mybatis.selectList("BoardDAO.selectBoard", vo);
	}
	
	// 글 상세 조회
	public BoardVO getBoard(int seq) {
		mybatis.update("viewCount", seq);
		return mybatis.selectOne("BoardDAO.getBoard", seq);
	}
	
	//게시물 총 개수
		public int countBoard() {
			return mybatis.selectOne("BoardDAO.countboard");
	} 	
	// 글 수정
	public void updateBoard(BoardVO vo) {
		mybatis.update("BoardDAO.updateBoard", vo);
	}
	
	// 글 삭제
	public void deleteBoard(int seq) {
		mybatis.delete("BoardDAO.deleteBoard", seq);	

	}

}
