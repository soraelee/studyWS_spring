package com.care.root.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartResolver;

@Controller
public class FileController {
	
	@GetMapping("uploadForm")
	public String uploadForm() {
		//���̵�, �̸�, ������ �ް� �ش� ������ ���� ������ �Ѱ���
		
		return "uploadForm";
	}
	
	
}
