package co.simplon.p25.elise.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.p25.elise.entities.User;

@Repository
public interface MemberRepository extends JpaRepository<User, Long>  {

}