package app03.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import app03.domain.Product;
import app03.form.ProductForm;

@Controller
public class ProductController {
	
	private static final Log logger = LogFactory.getLog(ProductController.class);
	
	@RequestMapping("/product_input")
	public String inputProduct(){
		logger.info(" InputController called ");
		
		return "ProductForm";
	}
	
	@RequestMapping("/product_save")
	public String saveProduct(ProductForm productForm, Model model){
		logger.info("SaveController called");
		
		Product product = new Product();
		product.setName(productForm.getName());
		product.setDescription(productForm.getDescription());
		try {
			product.setPrice(Float.parseFloat(productForm.getPrice()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("product", product);
		
		return "ProductDetails";
	}

}
