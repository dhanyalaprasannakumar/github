package com.app;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/college")
public class collegeController {
	@GetMapping("/college")
	public ResponseEntity<College> getcollegeDetails (){
	College c1=new College();
	c1.setClgId((long) 1);
	c1.setClgname("Aitam");
	c1.setLocation("sklm");
	
	return new ResponseEntity<College>(c1,HttpStatus.FOUND);
	}

}
