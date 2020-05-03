package com.romerojay.verbconjugatorapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VerbConjugatorApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VerbConjugatorApiApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "Verb Conjugator API";
	}

}
