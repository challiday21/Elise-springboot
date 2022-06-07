package co.simplon.p25.elise.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.p25.elise.entities.MemberType;

@Repository
public interface MemberTypeRepository extends JpaRepository<MemberType, Long> {

}
