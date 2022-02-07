package com.legatohealth.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class CrudController {

	@Autowired
	private DatSourceBean datSourceBean;

	@GetMapping
	public ResponseEntity<Object> readConfigMsg() {
		// datSourceBean.datasource();
		return ResponseEntity.status(200).body(datSourceBean.getUsername());
	}
}
