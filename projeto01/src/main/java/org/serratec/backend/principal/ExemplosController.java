package org.serratec.backend.principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ExemplosController {
	
	@GetMapping("/teste")
	public String teste() {
		return "Helloooo";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Helloooo world";
	}
	@RequestMapping("/maiuscula")
	public String maiuscula(@RequestParam String valor) {
		return valor.toUpperCase();
	}
}