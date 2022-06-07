package co.simplon.p25.elise.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.elise.entities.MemberType;
import co.simplon.p25.elise.service.MemberTypeService;

@RestController
@RequestMapping("/types")
public class MemberTypeController {

	private final MemberTypeService service;

	public MemberTypeController(MemberTypeService service) {
		this.service = service;
	}

	@GetMapping("/names")
	public List<MemberType> getTypeNames() {
		return service.getTypeNames();
	}

}