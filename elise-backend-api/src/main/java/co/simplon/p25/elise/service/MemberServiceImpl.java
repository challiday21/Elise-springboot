package co.simplon.p25.elise.service;

import java.util.List;

// import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.simplon.p25.elise.dtos.MemberCreate;
import co.simplon.p25.elise.dtos.MemberUpdate;
import co.simplon.p25.elise.entities.Member;
import co.simplon.p25.elise.repositories.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {

	private final MemberRepository repository;

	public MemberServiceImpl(MemberRepository repository) {
		this.repository = repository;
	}

	@Transactional
	@Override
	public void create(MemberCreate inputs) {
		Member member = new Member();
		member.setFirstName(inputs.getFirstName());
		member.setSurname(inputs.getSurname());
		member.setCodeDep(inputs.getCodeDep());
		repository.save(member);
	}

	@Override
	public List<Member> getNames() {
		return repository.findAll();
	}

	@Override
	public Member getById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}

	@Override
	public void update(Long id, MemberUpdate inputs) {
		Member member = repository.findById(id).get();
		member.setFirstName(inputs.getFirstName());
		member.setSurname(inputs.getSurname());
		member.setCodeDep(inputs.getCodeDep());
		repository.save(member);
	}

}