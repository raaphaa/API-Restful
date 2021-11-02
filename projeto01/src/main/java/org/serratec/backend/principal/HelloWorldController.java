package org.serratec.backend.principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/ola")
	public String OlaMundo() {
		return "Olá mundo!";
	}
	@RequestMapping(value ="/oi", method = RequestMethod.GET, produces = { "application/json", "application/xml"})
	public String msgGet() {
	    return "Oi, Get!";
	}
	@RequestMapping(value ="/oi", method = RequestMethod.POST, produces = { "application/json", "application/xml"})
	public String msgPost() {
	    return "Oi, Post!";
	}
}