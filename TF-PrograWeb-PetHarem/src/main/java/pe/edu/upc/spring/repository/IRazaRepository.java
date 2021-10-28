package pe.edu.upc.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.upc.spring.model.Raza;

@Repository
public interface IRazaRepository extends JpaRepository<Raza, Integer> {
	@Query("from Raza r where r.nombreRaza like %:nombreRaza%")
	List<Raza> buscarNombre(@Param("nombreRaza") String nombreRaza);
}
