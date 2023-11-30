package net.developia.spring01.article.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.developia.spring01.article.dto.ArticleDTO;
import net.developia.spring01.article.service.ArticleService;

@Controller
@RequestMapping("/article")
public class ArticleInsert{

	@Autowired
	ArticleService service;
	
	@GetMapping("/insert")
	public String insert() {
		return "article/insert";
	}
	
	@PostMapping("/insert")
	public ModelAndView insertAction(@ModelAttribute ArticleDTO articleDTO) {
		try {
			service.insertArticle(articleDTO);
			return new ModelAndView("redirect:list");
		} catch (Exception e) {
			ModelAndView mav = new ModelAndView("article/result");
			mav.addObject("msg", "게시물 입력 실패\\n입력 폼으로 되돌아갑니다.");
			mav.addObject("url", "javascript:history.back();");
			return mav;
		}
	}
	

}

