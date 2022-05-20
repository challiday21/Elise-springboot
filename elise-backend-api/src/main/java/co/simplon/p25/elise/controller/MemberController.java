package co.simplon.p25.elise.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.elise.dtos.MemberCreate;
import co.simplon.p25.elise.entities.Member;
import co.simplon.p25.elise.service.MemberService;

@RestController
@RequestMapping("/members")
public class MemberController {

	private final MemberService service;

	public MemberController(MemberService service) {
		this.service = service;
	}
	
	@PostMapping("/create")
	public void create(@RequestBody MemberCreate inputs) {
		System.out.println(inputs);
		service.create(inputs);
	}

}