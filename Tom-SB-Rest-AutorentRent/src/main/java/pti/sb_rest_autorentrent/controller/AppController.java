package pti.sb_rest_autorentrent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/rentForm")
	public String rentForm() {
		return "rentForm.html";
	}
}
