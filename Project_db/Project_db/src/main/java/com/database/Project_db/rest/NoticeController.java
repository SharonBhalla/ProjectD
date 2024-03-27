package com.database.Project_db.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/theatre")
public class NoticeController {
	
	@RequestMapping("/notices")
	public String noticeView() {
		return "Notice View";
	}

}
