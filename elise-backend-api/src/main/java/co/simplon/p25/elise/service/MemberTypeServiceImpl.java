package co.simplon.p25.elise.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.p25.elise.entities.MemberType;
import co.simplon.p25.elise.repositories.MemberTypeRepository;

@Service
public class MemberTypeServiceImpl implements MemberTypeService {

	private final MemberTypeRepository types;

	public MemberTypeServiceImpl(MemberTypeRepository types) {
		this.types = types;
	}

	@Override
	public List<MemberType> getTypeNames() {
		return types.findAll();
	}

}
