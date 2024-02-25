package com.EchoService.Project2_Echo.echoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EchoApi {

	public static void main(String[] args) {
	SpringApplication.run(EchoApi.class,args);	

	}
	
	@GetMapping("/echo")
public String echo(@RequestParam String text)
{
		return "you said :"+text;
}

}
