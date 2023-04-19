package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.MenuDTO;
import com.itbank.repository.MenuDAO;

@Service
public class MenuService {
	
	@Autowired private MenuDAO dao;

	public List<MenuDTO> selectAll() {
		return dao.selectAll();
	}

	public List<MenuDTO> selectByCategory(String category) {
		return dao.selectList(category);
	}

	public int add(MenuDTO dto) {
		return dao.insert(dto);
		// myBatis에 값을 전달하려면 dto로 묶거나, hashmap으로 묶어서 하나의 값만 전달해야 한다
	}

	public MenuDTO selectOne(int idx) {
		// myBatis의 함수에서는 오버로딩을 사용하면 안된다 !! (함수이름이 고유 id의 역할을 하기 때문)
		return dao.selectOne(idx);
	}

	public int delete(int idx) {
		return dao.delete(idx);
	}

	public int modify(MenuDTO dto) {
		return dao.update(dto);
	}

}
