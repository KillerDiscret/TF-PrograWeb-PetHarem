package pe.edu.upc.spring.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.spring.model.Raza;

public interface IRazaService {

	public boolean insertar(Raza raza);
	
	public boolean modificar(Raza raza);
	
	public void eliminar(int idRaza);
	
	public Optional<Raza> listarId(int idRace);
	
	List<Raza> listar();
	List<Raza> buscarNombre(String nombreRaza);
}
