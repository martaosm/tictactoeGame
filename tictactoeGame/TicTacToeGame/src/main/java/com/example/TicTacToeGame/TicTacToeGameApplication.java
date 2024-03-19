package com.example.TicTacToeGame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@RestController
public class TicTacToeGameApplication {

//	@GetMapping("/user")
//	public Map<String, Object> user(@AuthenticationPrincipal OAuth2User principal) {
//		return Collections.singletonMap("name", principal.getAttribute("username"));
//	}

	public static void main(String[] args) {
		SpringApplication.run(TicTacToeGameApplication.class, args);
	}

}
