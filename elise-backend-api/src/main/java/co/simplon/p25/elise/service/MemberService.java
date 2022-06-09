package co.simplon.p25.elise.service;

import java.util.List;

import co.simplon.p25.elise.dtos.MemberCreate;
import co.simplon.p25.elise.dtos.MemberList;
import co.simplon.p25.elise.dtos.MemberUpdate;
import co.simplon.p25.elise.entities.Member;

public interface MemberService {

	void create(MemberCreate inputs);

	List<Member> getNames();

	Member getById(Long id);

	void update(Long id, MemberUpdate inputs);

	void delete(Long id);
}