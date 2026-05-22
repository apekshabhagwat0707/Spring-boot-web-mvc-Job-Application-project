package com.project.jobApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.jobApp.model.JobPost;
import com.project.jobApp.service.JobService;

@Controller
public class JobController {
	   @Autowired
	    private JobService service;

//when you are using two url then you put as an array for home.jsp

	@GetMapping({ "/", "home" })
	public String home() {
		return "home";
	}

	@GetMapping("/addjob")
	public String addJob() {
		return "addJob";
	}
	
	@PostMapping("handleForm")
	public String handleForm(JobPost jobpost)
	{
		 service.addJob(jobpost);
	       
		return "success";
	}
	
	@GetMapping("viewalljobs")
    public String viewJobs(Model m) {
        List<JobPost> jobs = service.getAppJobs();
        m.addAttribute("jobPosts", jobs);

        return "viewalljobs";
    }

}


