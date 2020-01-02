package mglsh.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CRelayRepository extends JpaRepository<CRelay, Long>{
}
