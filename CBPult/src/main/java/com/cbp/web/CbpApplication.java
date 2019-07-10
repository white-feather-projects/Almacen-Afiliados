package com.cbp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cbp.web.impl.UploadFileServiceImpl;

@SpringBootApplication
public class CbpApplication  {
	
	@Autowired
	UploadFileServiceImpl uploadFileServiceImpl;

	public static void main(String[] args) {
		SpringApplication.run(CbpApplication.class, args);
	}

	
	
}
