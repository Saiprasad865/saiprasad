package com.project1.project1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project1.project1.Service.UserService;
import com.project1.project1.dto.ApiResponseDto;

@CrossOrigin(origins = "*")
	@RestController
	@RequestMapping("/api/test")
	public class TestController {

		@Autowired
		private UserService userService;


	    public TestController(UserService userService) {
			super();
			this.userService = userService;
		}


		@GetMapping("/")
	    public ResponseEntity<ApiResponseDto<?>> Test() {
	        return ResponseEntity
	                    .status(HttpStatus.OK)
	                    .body(new ApiResponseDto<>(true,"welcome to my project"));
	    }
	}



