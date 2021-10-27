package com.institute.software.the.orr.kyle.demoSB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class DemoSb2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoSb2Application.class, args);
	}


	@GetMapping("/getcat")
	public String catResponse(){
		Cat cat = new Cat("Snowflake",9,"Tabby", "White");
		return cat.getJsonObjectOfCat();
	}

}
