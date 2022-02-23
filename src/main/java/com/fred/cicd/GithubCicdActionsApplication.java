package com.fred.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GithubCicdActionsApplication {


	@GetMapping
	public String getGreetings(){
		return  "Hello, Someone";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionsApplication.class, args);
	}

}

//echo "# lindacicd" >> README.md
//		git init
//		git add README.md
//		git commit -m "first commit"
//		git branch -M main
//		git remote add origin https://github.com/GodfredAsa/lindacicd.git
//		git push -u origin main
