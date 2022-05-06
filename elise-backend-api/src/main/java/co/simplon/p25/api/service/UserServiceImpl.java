package co.simplon.p25.api.service;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import co.simplon.p25.api.dtos.UserLogin;
import co.simplon.p25.api.entities.User;
import co.simplon.p25.api.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository repository;

	private final PasswordEncoder encoder;

	public UserServiceImpl(UserRepository repository, PasswordEncoder encoder) {
		this.repository = repository;
		this.encoder = encoder;
	}

	@Override
	public Object signIn(UserLogin inputs) {
		String username = inputs.getUsername();
		User user = repository.findByUsernameIgnoreCase(username)
				.orElseThrow(() -> new BadCredentialsException(username));

		String password = inputs.getPassword();
		if (!encoder.matches(password, user.getPassword())) {
			throw new BadCredentialsException(username);
		}

		return user;
	}
}