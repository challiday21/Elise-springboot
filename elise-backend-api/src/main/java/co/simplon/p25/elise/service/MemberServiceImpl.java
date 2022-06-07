package co.simplon.p25.elise.service;

import java.util.List;

// import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.simplon.p25.elise.dtos.MemberCreate;
import co.simplon.p25.elise.dtos.MemberUpdate;
import co.simplon.p25.elise.entities.Member;
import co.simplon.p25.elise.entities.MemberType;
import co.simplon.p25.elise.entities.Task;
import co.simplon.p25.elise.repositories.MemberRepository;
import co.simplon.p25.elise.repositories.TaskRepository;
import co.simplon.p25.elise.repositories.MemberTypeRepository;

@Service
public class MemberServiceImpl implements MemberService {

	private final MemberRepository members;

	private final MemberTypeRepository types;
	private final TaskRepository tasks;

	public MemberServiceImpl(MemberRepository members, MemberTypeRepository types, TaskRepository tasks) {

		this.members = members;
		this.types = types;
		this.tasks = tasks;
	}

	@Transactional
	@Override
	public void create(MemberCreate inputs) {
		Member member = new Member();
		member.setFirstName(inputs.getFirstName());
		member.setSurname(inputs.getSurname());
		member.setCodeDep(inputs.getCodeDep());
		MemberType type = types.getById(inputs.getMemberType());
		member.setType(type);
		Task task = tasks.getById(inputs.getMemberTask());
		member.setTask(task);
		members.save(member);
	}

	@Override
	public List<Member> getNames() {
		return members.findAll();
	}

	@Override
	public Member getById(Long id) {
		return members.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		members.deleteById(id);
	}

	@Transactional
	@Override
	public void update(Long id, MemberUpdate inputs) {
		Member member = members.findById(id).get();
		//
		member.setFirstName(inputs.getFirstName());
		member.setSurname(inputs.getSurname());
		member.setCodeDep(inputs.getCodeDep());
		members.save(member);
	}

}