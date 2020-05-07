package com.ja.freeboard.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.ja.freeboard.vo.MemberVo;

public interface MemberSQLMapper {
    
	// 프라이머리 키만 따로 받아오기 위한 작업 
	@Select("SELECT FB_MEMBER_SEQ.nextval FROM DUAL")
	public int creatKey();
	
	//DAO 역할을 하는 SQLMAPPER 에서 SQL 쿼리문을   주입해줄  티어를 나눈다. 
	@Insert("INSERT INTO FB_Member VALUES(#{member_no},#{member_id},#{member_pw},#{member_nick},#{member_sex},SYSDATE)")
	public void insert(MemberVo memberVo);
    
    
    
    
}
