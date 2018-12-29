package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import com.example.demo.model.Users;

@Mapper
public interface UsersMapper {
	
	@Select("SELECT * FROM Users")
	List<Users> findAll();
	
	@Insert("INSERT INTO Users(name,salary) VALUES(#{name}, #{salary})")
	@SelectKey(statement = "SELECT SCOPE_IDENTITY()", keyProperty="id", before=false, resultType=Integer.class)
	void insert(Users user);

}
