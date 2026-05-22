
package com.project.jobApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.jobApp.model.JobPost;
import com.project.jobApp.repository.JobRepository;

@Service
public class JobService {
	@Autowired
	public JobRepository repo;

	public void addJob(JobPost jobPost) {
		repo.addJob(jobPost);

	}

	public List<JobPost> getAppJobs() {
		return repo.getAllJobs();

	}
}
