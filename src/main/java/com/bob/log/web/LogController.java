package com.bob.log.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/log",produces = MediaType.APPLICATION_JSON_VALUE)
public class LogController {

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public void log(@RequestBody LogDto dto) throws InterruptedException {
		log.info("log start dto {}",dto);
		Thread.sleep(3000);
		System.out.println("Log service get request "+dto);
		log.info("log end");

	}
}
