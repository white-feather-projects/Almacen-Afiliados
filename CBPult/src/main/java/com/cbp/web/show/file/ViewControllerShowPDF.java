package com.cbp.web.show.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cbp.web.impl.UploadFileServiceImpl;

@Controller
public class ViewControllerShowPDF {
	
	@Autowired
	private UploadFileServiceImpl upload;
	
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	   @RequestMapping(value = "/viewPdf/{url}", produces = "application/pdf")
	    public ResponseEntity<byte[]> showPdf(@PathVariable(value="url") String url) {
	     
	    	File file = new File(upload.getPath(url).toString());
	        Path path = upload.getPath(url);
	        byte[] pdfContents = null;
	        try {
	            pdfContents = Files.readAllBytes(path);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        String fileName = file.getName();
	        
	        HttpHeaders headers = new HttpHeaders();
	        headers.setContentType(MediaType.parseMediaType("application/pdf"));
	        headers.add("Content-Disposition", "inline;filename=" + fileName);
	        ResponseEntity<byte[]> response = new ResponseEntity<byte[]>(
	                    pdfContents, headers, HttpStatus.OK);

	   log.info("Link {}", response);

	        return response;
	    }

}
