package co.simplon.p25.elise.service;

import java.util.List;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.simplon.p25.elise.dtos.UserCreate;
import co.simplon.p25.elise.dtos.UserSignIn;
import co.simplon.p25.elise.entities.Role;
import co.simplon.p25.elise.entities.User;
import co.simplon.p25.elise.repositories.UserRepository;
import co.simplon.p25.elise.security.Jwt;
import co.simplon.p25.elise.security.JwtProvider;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository repository;

	private final PasswordEncoder encoder;

	private final JwtProvider provider;

	public UserServiceImpl(UserRepository repository, PasswordEncoder encoder, JwtProvider provider) {
		this.repository = repository;
		this.encoder = encoder;
		this.provider = provider;
	}

	@Transactional
	@Override
	public void create(UserCreate inputs) {
		User user = new User();
		user.setUsername(inputs.getUsername());
		String encoded = encoder.encode(inputs.getPassword());
		user.setPassword(encoded);
		repository.save(user);
	}

	@Override
	public Jwt signIn(UserSignIn inputs) throws BadCredentialsException {
		String username = inputs.getUsername();
		User user = repository.findByUsernameIgnoreCase(username).orElseThrow(
				() -> new BadCredentialsException(String.format("no user found with username '%s'", username)));
		String password = inputs.getPassword();
		if (!encoder.matches(password, user.getPassword())) {
			throw new BadCredentialsException(String.format("password does not match for username '%s'", username));
		}
		Role role = user.getUserRole();
		List<String> roles = null;
		if (role != null) {
			roles = List.of(role.getName());
		}
		return provider.create(String.valueOf(user.getId()), roles);
	}

}