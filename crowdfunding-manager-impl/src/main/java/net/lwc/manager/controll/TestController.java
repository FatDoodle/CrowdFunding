package net.lwc.manager.controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.lwc.manager.service.TestService;

@Controller
public class TestController {

	@Autowired
	TestService ts;

	@RequestMapping("/insert")
	public ModelAndView insert() {
		ModelAndView mav = new ModelAndView();
		int count = ts.insert();
		if (count != 0) {
			mav.setViewName("success");
		} else {
			mav.setViewName("failed");
		}
		return mav;
	}
}
