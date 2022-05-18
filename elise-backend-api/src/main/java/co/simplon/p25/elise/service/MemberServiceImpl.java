package co.simplon.p25.elise.service;

import org.springframework.stereotype.Service;

import co.simplon.p25.elise.dtos.MemberCreate;
import co.simplon.p25.elise.repositories.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {

	private final MemberRepository repository;
	
	public MemberServiceImpl(MemberRepository repository) {
		this.repository = repository;		
	}

	@Override
	public void create(MemberCreate inputs) {
		System.out.println("Testing........");		
	}

}
