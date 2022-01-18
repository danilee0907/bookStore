package com.springcompany.biz.user.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
	@Autowired
	SqlSessionTemplate mybatis;
	
	
	public UserVO login(String id) {
		return mybatis.selectOne("UserDAO.login",id);
	}
	
	public void insertUser(UserVO vo) {
		mybatis.insert("UserDAO.insertUser", vo);
	}
	
	// 회원 상세 조회
	public  List<UserVO> getUserList(UserVO vo) {
		return mybatis.selectList("UserDAO.getUserList", vo);
	}
	
	// 회원 조회
	public UserVO getUser(String id) {
		return mybatis.selectOne("UserDAO.getUser", id);
	}
	

	// 회원 정보 수정
	public void updateUser(UserVO vo) {
		mybatis.update("UserDAO.updateUser", vo);
	}
	
	// 회원 정보 삭제
	public void deleteUser(String id) {
		mybatis.delete("UserDAO.deleteUser", id);
	}
}
