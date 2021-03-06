package app03.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class InputController implements Controller {

	private static final Log logger = LogFactory.getLog(InputController.class);

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		logger.info(" InputController called ");
		System.err.println(" InputController called ");
//		return new ModelAndView("/WEB-INF/jsp/app03/ProductForm.jsp");   //无视图解析器时
		return new ModelAndView("/app03/ProductForm");   //有视图解析器时
	}

}
