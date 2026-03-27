package com.example.demo;

@RestController
public class Csecontroller {
	@GetMapping("/home")
	public String disp() {
		return "WELCOME TO OPENSHIFT DEPLOYMENT";
	}
}
