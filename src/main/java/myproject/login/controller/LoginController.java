package myproject.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@org.springframework.stereotype.Controller
public class LoginController {

	
	@RequestMapping("/loginpage")
	public ModelAndView loginPage() {
		return new ModelAndView("loginform");
	}

	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String uname = request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		ModelAndView mav = null;
		if(uname.equals("tofique")&& upwd.equals("1234")) {
			mav = new ModelAndView("success");
		}else {
			mav = new ModelAndView("failure");
		}
		return mav;
	}
	

}
