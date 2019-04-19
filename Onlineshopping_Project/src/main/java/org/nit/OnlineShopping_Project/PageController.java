package org.nit.OnlineShopping_Project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	
@RequestMapping(value= {"/hi","/hello"})
	public ModelAndView hello() {
		
		ModelAndView mav= new ModelAndView("page");
		mav.addObject("msg","hello ");
		return  mav;
	}
	
	
	
}
