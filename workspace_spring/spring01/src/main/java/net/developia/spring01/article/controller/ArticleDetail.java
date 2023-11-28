package net.developia.spring01.article.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import net.developia.spring01.article.dto.ArticleDTO;
import net.developia.spring01.article.service.ArticleService;

public class ArticleDetail extends AbstractController {
	

	
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		long no = Long.parseLong(request.getParameter("no"));
		ArticleService service = ArticleService.getInstance();
		try {
			ArticleDTO dto = service.getArticle(no);
			return new ModelAndView("/WEB-INF/views/article/detail.jsp","dto",dto);
		} catch(Exception e) {
			ModelAndView mav = new ModelAndView("/WEB-INF/views/article/result.jsp");
			mav.addObject("msg", "게시물 출력 실패");
			mav.addObject("url", "list"); // 인덱스로 보내짐
			return mav;
		}

	}

}
