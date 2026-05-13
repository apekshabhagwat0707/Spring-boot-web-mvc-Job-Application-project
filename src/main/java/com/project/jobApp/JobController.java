package com.project.jobApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {
	
//whem you are using two url then you put as an array for home.jsp
	
@RequestMapping	({"/","home"})
 public String home()
 {
	 return "home";
 }
}
