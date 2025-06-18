package com.sist.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 서버위치 
/*
 *   maven => Framework => war
 *   gradle => Boot  => jar (실행 가능 파일) 
 */
@SpringBootApplication
public class Devops5Application {

	public static void main(String[] args) {
		SpringApplication.run(Devops5Application.class, args);
	}

}
 