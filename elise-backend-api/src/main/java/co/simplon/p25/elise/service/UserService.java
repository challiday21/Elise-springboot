package co.simplon.p25.elise.service;

import co.simplon.p25.elise.dtos.UserCreate;
import co.simplon.p25.elise.dtos.UserSignIn;
import co.simplon.p25.elise.security.Jwt;

public interface UserService {

	void create(UserCreate inputs);

	Jwt signIn(UserSignIn inputs);
}