package co.simplon.p25.elise.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.p25.elise.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	// Optionally returns a {@code User} with given username ignoring case
	Optional<User> findByUsernameIgnoreCase(String username);

	// Indicates whether a {@code User} already exists with given
	boolean existsByUsernameIgnoreCase(String value);
}