package com.satya.store;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller // Handles Web request and return Html pages
public class HomeController {
	@RequestMapping("/") // It tell which method should run when user visit like /something
	public String index() {
		return "index.html";
	}

}
