package com.kh.mybatis.member.model.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.mybatis.member.model.vo.Member;

public class MemberDao {
	
	public int insertMember(SqlSession sqlSession, Member m) {
		//insert문=> 처리된 행수 => 트랜잭션
		
		int result = sqlSession.insert("memberMapper.insertMember", m);
		return result;
	}
}
