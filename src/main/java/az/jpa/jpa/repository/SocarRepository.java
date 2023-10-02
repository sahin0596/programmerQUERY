package az.jpa.jpa.repository;

import az.jpa.jpa.domain.Socar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface SocarRepository extends JpaRepository<Socar,Long> {

    @Query("Select s FROM Socar s where s.firstName = ?1 AND s.lastName = ?2")
    List<Socar> findSocarsWithJPQL(String firstName,String lastName);

    @Query(nativeQuery = true,value = "Select * From our_socars s where s.first_Name = ?1 AND s.last_Name = ?2")
    List<Socar> findSocarsWithNativeSql(String babek, String merdimazar);
}
