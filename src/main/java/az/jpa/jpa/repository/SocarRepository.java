package az.jpa.jpa.repository;

import az.jpa.jpa.domain.Socar;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SocarRepository extends JpaRepository<Socar,Long> {
    List<Socar> findByFirstName(String sahin);

    List<Socar> findByFirstNameAndLastName(String elgun, String mammadov);

    List<Socar> findByAge(int i);
}
