package com.itbank.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.MenuDTO;
import com.itbank.service.MenuService;

@Controller
public class MenuController {

	@Autowired private MenuService menuService;
	
	@GetMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView("list");
		List<MenuDTO> list = menuService.selectAll();
		mav.addObject("list", list);
		return mav;
	}
	
	@GetMapping("/list/{category}/")
	public ModelAndView list(@PathVariable("category") String category) {
		
		ModelAndView mav = new ModelAndView("list");
		List<MenuDTO> list = menuService.selectByCategory(category);
		mav.addObject("list", list);
		return mav;
	}

	@GetMapping("/add")
	public ModelAndView add(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		
		String wr; // webapp/resources/image 경로를 문자열로 가져와서
		wr = request.getSession().getServletContext().getRealPath("resources/image");
		File dir = new File(wr);	// 파일 객체를 생성하고
		String[] arr = dir.list();	// 내부의 파일이름들을 문자열로 가져와서
		mav.addObject("arr", arr);	// jsp에게 보내준다
		return mav;
	}
	
	@PostMapping("/add")
	public String add(MenuDTO dto) {
		int row = menuService.add(dto);
		System.out.println(row != 0 ? "추가 성공" : "추가 실패");
		return "redirect:/list";
	}

	// idx를 전달받아서 단일 메뉴의 정보를 출력하는 기능
	@GetMapping("/view/{idx}")
	public ModelAndView view(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("view");	// view.jsp 로 이동할 예정
		MenuDTO dto = menuService.selectOne(idx);		// service, dao를 통해 단일 메뉴 정보를 가져온다
		mav.addObject("dto", dto);						// jsp에게 보낸다
		return mav;										// jsp로 이동한다 (포워드)
	}
	
	@GetMapping("/delete/{idx}")
	public String delete(@PathVariable("idx")int idx) {
		int row = menuService.delete(idx);
		System.out.println(row != 0 ? "삭제 성공" : "삭제 실패");
		return "redirect:/list";
	}
	
	@GetMapping("/modify/{idx}")
	public ModelAndView modify(@PathVariable("idx") int idx, HttpSession session) {
		ModelAndView mav = new ModelAndView("modify");
		
		MenuDTO dto = menuService.selectOne(idx);
		mav.addObject("dto", dto);
		
		String wr; // webapp/resources/image 경로를 문자열로 가져와서
		wr = session.getServletContext().getRealPath("resources/image");
		File dir = new File(wr);	// 파일 객체를 생성하고
		String[] arr = dir.list();	// 내부의 파일이름들을 문자열로 가져와서
		mav.addObject("arr", arr);	// jsp에게 보내준다
		
		return mav;
	}
	
	@PostMapping("/modify/{idx}")
	public String modify(MenuDTO dto) {
		int row = menuService.modify(dto);
		System.out.println(row != 0 ? "수정 성공" : "수정 실패");
		return "redirect:/view/" + dto.getIdx();
	}
	
	

}







