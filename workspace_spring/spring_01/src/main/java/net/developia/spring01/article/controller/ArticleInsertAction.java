package net.developia.spring01.article.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import lombok.extern.java.Log;
import net.developia.spring01.article.dto.ArticleDTO;
import net.developia.spring01.article.service.ArticleService;

@Log
public class ArticleInsertAction extends AbstractController{

	ArticleService service = ArticleService.getInstance();
	
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		String title 	= request.getParameter("title");
		String name 	= request.getParameter("name");
		String password = request.getParameter("password");
		String content 	= request.getParameter("content");
		
		ArticleDTO articleDTO = new ArticleDTO();
		articleDTO.setTitle(title);
		articleDTO.setName(name);
		articleDTO.setPassword(password);
		articleDTO.setContent(content);
		

		try {
			service.insertArticle(articleDTO);
			return new ModelAndView("redirect:list");
		} catch (Exception e) {
			ModelAndView mav = new ModelAndView("/WEB-INF/views/article/result.jsp");
			mav.addObject("msg", "게시물 입력 실패\\n입력 폼으로 돌아갑니다.");
			mav.addObject("url", "javascript:history.back();");
			return mav;
		}
	}
}