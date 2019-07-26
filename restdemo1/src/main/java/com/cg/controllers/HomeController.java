package com.cg.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.Message;

@RestController
@RequestMapping("/test")
public class HomeController {
	
	/** Process GET Request on localhost:5000/test/
	 * @return
	 */
	@GetMapping(value="/",produces= {"application/json","application/xml"})
	public Message testGet() {
		return new Message ("This is Get request");
	}
	
	// Process POST REQUEST on localhost:5000/test/
	@PostMapping(value="/",produces= {"application/json","application/xml"})
	public Message testPost() {
		return new Message ("This is POST request");
	}
	
	@PutMapping(value="/",produces= {"application/json","application/xml"})
	public Message testPut() {
		return new Message ("This is PUT request");
	}
	@DeleteMapping(value="/",produces= {"application/json","application/xml"})
	public Message testDelete() {
		return new Message ("This is DELETE request");
	}

}
