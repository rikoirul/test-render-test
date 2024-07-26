package com.example.test_render_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MufportalMassSubscriberController {
	
	@GetMapping("/")
	public String home() throws Exception {
		String response = "";
		try {
			response = "<h3>MUF Portal SC3 Subscriber Kafka Mongo (v2.1)</>";
		} catch (Exception e) {
			response = "<h3>Koneksi Gagal</>";
			e.printStackTrace();
		}
		return response;
	}

}
