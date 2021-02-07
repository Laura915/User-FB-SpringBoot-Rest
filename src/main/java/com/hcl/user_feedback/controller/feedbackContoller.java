package com.hcl.user_feedback.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.user_feedback.model.CrudRepo;
import com.hcl.user_feedback.model.Feedback;

@RestController
public class feedbackContoller {
	Logger logger = LoggerFactory.getLogger(feedbackContoller.class);
	
	@Autowired
	CrudRepo feedbackCrudRepo;
	
	@GetMapping("/")
	public ModelAndView showHomePage() {
		return new ModelAndView("index.html");
	}
	
	@PostMapping("/usersfeedback")
	public Feedback saveUsersFeedback(@RequestBody Feedback feedback) {
		return feedbackCrudRepo.save(feedback);	
	}

}
