package app03.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import app03.domain.Product;
import app03.form.ProductForm;

public class SaveController implements Controller {
	
	private static final Log logger = LogFactory.getLog(SaveController.class);

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		logger.info("SaveController called");
		System.err.println(" SaveController called ");
		ProductForm productForm = new ProductForm();
		productForm.setName(req.getParameter("name"));
		productForm.setDescription(req.getParameter("description"));
		productForm.setPrice(req.getParameter("price"));
		
		Product product = new Product();
		product.setName(productForm.getName());
		product.setDescription(productForm.getDescription());
		try {
			product.setPrice(Float.parseFloat(productForm.getPrice()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		return new ModelAndView("/WEB-INF/jsp/app03/ProductDetails.jsp", "product", product); //无视图解析器时
		return new ModelAndView("/app03/ProductDetails", "product", product); //无视图解析器时

	}

}
