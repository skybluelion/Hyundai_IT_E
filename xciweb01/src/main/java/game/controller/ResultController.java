package game.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.fx.AbstractController;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.fx.AbstractController;
import mvc.fx.ModelAndView;

public class ResultController extends AbstractController {
	
	@Override
	public  ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
	    int youNum = Integer.parseInt(request.getParameter("you"));
		String you = null;
		you = sol(youNum, you);
		
		int comNum = (int)(Math.random() * 3 + 1);
		String com = null;
		com = sol(comNum, com);


		String winner = null;
	    if (you.equals(com)) {
	    	winner = "비겼습니다.";
	    } else if ((you.equals("바위") && com.equals("가위")) ||
	               (you.equals("보") && com.equals("바위")) ||
	               (you.equals("가위") && com.equals("보"))) {
	    	winner = "당신이 이겼습니다.";
	    } else {
	    	winner = "당신이 졌습니다.";
	    }
		
	    ModelAndView mav = new ModelAndView("/WEB-INF/game/result.jsp");
	    mav.addObject("you", you);
	    mav.addObject("com", com);
	    mav.addObject("winner", winner);

	    return mav;
	}
	public static String sol(int num, String result) {
		if (num == 1) result = "가위";
		else if (num == 2) result = "바위";
		else result = "보";
		
		return result;
	}
}
