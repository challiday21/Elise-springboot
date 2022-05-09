package co.simplon.p25.elise.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.elise.dtos.UserSignIn;
import co.simplon.p25.elise.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	private final UserService service;

	public UserController(UserService service) {
		this.service = service;
	}

	@PostMapping("/sign-in")
	public Object signIn(@RequestBody UserSignIn inputs) {
		return service.signIn(inputs);
	}

}