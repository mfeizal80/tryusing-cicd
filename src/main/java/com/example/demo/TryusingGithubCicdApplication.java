package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TryusingGithubCicdApplication {

//	echo "# tryusing-cicd" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/mfeizal80/tryusing-cicd.git
//	git push -u origin main
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Coba CI CD";
	}
	public static void main(String[] args) {
		SpringApplication.run(TryusingGithubCicdApplication.class, args);
	}

}
