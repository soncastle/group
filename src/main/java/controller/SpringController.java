package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SpringController extends AbstractController{ //기본적으로 서블릿 특정 지원받음.디스페쳐 받는게 이 인터페이스임! 그 자식이긴 하나 똑같음!
	// 그런데 디스페쳐 서블릿이 어디로 가야하는지는 직접 만들어줘야함
	//이거 이름도 정해져 있음. 서블릿매핑한 이름-servlet.xml로 만들어야함 나중에 바꿀 수 있긴 해
	//디스페쳐 서블릿에게 이걸 만들겠다 알려줘야함!! 내가 만들었으니까!!
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		return new ModelAndView("/WEB-INF/views/spring_result.jsp");
	}
}