package com.itbank.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.itbank.model.MenuDTO;

public interface MenuDAO {

	@Select("select * from kfc_menu order by idx")
	List<MenuDTO> selectAll();

	// #{}는 자료형에 맞게 형식을 바꾸거나 따옴표를 붙여준다
	// ${}는 자료형에 상관없이 따옴표처리없이 값을 그대로 넣어준다
	
	// select * from kfc_menu where category = '치킨세트' order by idx
	@Select("select * from kfc_menu where category = #{category} order by idx")
	List<MenuDTO> selectList(String category);

	@Insert("insert into kfc_menu (name, category, price, img, memo) "
			+ "values (#{name}, #{category}, #{price}, #{img}, #{memo})")
	int insert(MenuDTO dto);

	@Select("select * from kfc_menu where idx = #{idx}")
	MenuDTO selectOne(int idx);

	@Delete("delete from kfc_menu where idx = #{idx}")
	int delete(int idx);

	@Update("update kfc_menu "
			+ "set"
			+ "		name = #{name},"
			+ "	 	category = #{category},"
			+ "		price = #{price},"
			+ "		img = #{img},"
			+ "		memo = #{memo}"
			+ "	where "
			+ "		idx = #{idx}")
	int update(MenuDTO dto);

}



