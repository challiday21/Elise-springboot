package co.simplon.p25.api.service;

import co.simplon.p25.api.dtos.UserLogin;

public interface UserService {

	Object signIn(UserLogin inputs);

}