package org.serratec.backend.principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/calculadora")
public class CalculadoraController {
	
	@GetMapping("/soma")
	public int somar(@RequestParam int valor1, @RequestParam int valor2) {
		return valor1 + valor2;
	}
	@GetMapping("/subtracao")
	public int subtrair(@RequestParam int valor1,@RequestParam int valor2) {
		return valor1 - valor2;
	}
	@GetMapping("/divisao")
	public int dividir(@RequestParam int valor1, @RequestParam int valor2) {
		return valor1 / valor2;
	}
	@GetMapping("/multiplicacao")
	public int multiplicar(@RequestParam int valor1, @RequestParam int valor2) {
		return valor1 * valor2;
	}
}