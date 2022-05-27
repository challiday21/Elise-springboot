package co.simplon.p25.elise.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.p25.elise.dtos.MemberCreate;
import co.simplon.p25.elise.entities.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>  {

//    <T> List<T> findAllProjectedByOrderByName(Class<T> type);

}