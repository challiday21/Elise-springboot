package co.simplon.p25.elise.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.elise.dtos.MemberCreate;
import co.simplon.p25.elise.dtos.MemberUpdate;
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

	@GetMapping("/{id}")
	public Member getById(@PathVariable("id") Long id) {
		return service.getById(id);
	}

	@PutMapping("/{id}")
	public void update(@PathVariable("id") Long id, @RequestBody MemberUpdate inputs) {
		System.out.println(inputs);
		service.update(id, inputs);
	}

	@GetMapping("/names")
	public List<Member> getNames() {
		return service.getNames();
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
	}

}