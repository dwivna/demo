package com.learn.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.learn.demo.dto.ResponseDTO;
import com.learn.demo.exception.InvalidException;

@RestController
public class ResponseController {

	@GetMapping("/response/{id}")
	public ResponseDTO getResponse(@PathVariable String id) throws InvalidException {
       if(id.equals("eid")) {
    	   throw new InvalidException("Invalid");
       }
       else {
    	   return new ResponseDTO("Success");
       }
	}
}
