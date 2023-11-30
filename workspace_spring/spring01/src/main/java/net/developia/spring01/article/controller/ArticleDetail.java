package net.developia.spring01.article.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import lombok.AllArgsConstructor;
import net.developia.spring01.article.dto.ArticleDTO;
import net.developia.spring01.article.service.ArticleService;

@Controller
@AllArgsConstructor
public class ArticleDetail {
	
	@Autowired
	ArticleService service;
	
	@GetMapping("/article/detail")
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		long no = Long.parseLong(request.getParameter("no"));

		try {
			ArticleDTO dto = service.getArticle(no);
			return new ModelAndView("article/detail","dto",dto);
		} catch(Exception e) {
			ModelAndView mav = new ModelAndView("article/result");
			mav.addObject("msg", "게시물 출력 실패");
			mav.addObject("url", "list"); // 인덱스로 보내짐
			return mav;
		}

	}

}
