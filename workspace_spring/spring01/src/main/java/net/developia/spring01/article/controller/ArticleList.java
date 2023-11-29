package net.developia.spring01.article.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import net.developia.spring01.article.dto.ArticleDTO;
import net.developia.spring01.article.service.ArticleService;

@Log
@AllArgsConstructor
public class ArticleList extends AbstractController{
	
	//ArticleService service = ArticleService.getInstance();
	ArticleService service;
	public void setService(ArticleService service) {
		this.service = service;
	}
	
//	public ArticleList(ArticleService service) {
//		this.service = service;
//	}

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			List<ArticleDTO> list = service.getArticleList();
			return new ModelAndView("/WEB-INF/views/article/list.jsp","list",list);
			
		} catch (Exception e) {
			ModelAndView mav = new ModelAndView("/WEB-INF/views/article/result.jsp");
			mav.addObject("msg", "게시물 리스트 출력 실패");
			mav.addObject("url", "../"); // 인덱스로 보내짐
			return mav;
		}
		
	}

}
