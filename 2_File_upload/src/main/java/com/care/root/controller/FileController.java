package com.care.root.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartResolver;

@Controller
public class FileController {
	
	@GetMapping("uploadForm")
	public String uploadForm() {
		//아이디, 이름, 파일을 받고 해당 파일을 서비스 단으로 넘겨줌
		
		return "uploadForm";
	}
	
	
}
