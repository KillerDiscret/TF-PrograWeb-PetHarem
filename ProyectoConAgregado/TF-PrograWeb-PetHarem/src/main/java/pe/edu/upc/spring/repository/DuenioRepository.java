package pe.edu.upc.spring.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.spring.model.Duenio;

@Repository
public interface DuenioRepository extends JpaRepository<Duenio, Integer> {
}
