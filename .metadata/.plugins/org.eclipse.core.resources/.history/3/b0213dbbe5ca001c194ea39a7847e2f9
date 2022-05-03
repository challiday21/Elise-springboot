package co.simplon.p25.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.p25.api.entities.User;
import co.simplon.p25.api.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	private final UserRepository repository;
	
	public UserServiceImpl(UserRepository repository) {
		this.repository = repository;
	}
@Override
	public List<User> getUsers(){
		return repository.findAll();
	}
}
	
	
	


