package com.springcompany.biz.user.service;

import com.springcompany.biz.user.dao.UserVO;

public interface UserService {
	
	UserVO getService(String id);
	
	// 회원 가입
	void insertService(UserVO vo);
	
	 //회원 정보 수정
	void updateService(UserVO vo);
	
	// 회원 삭제
	void deleteService(String password);
}
