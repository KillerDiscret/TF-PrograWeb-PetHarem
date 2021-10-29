package pe.edu.upc.spring.service;

import java.util.List;
import java.util.Optional;
import pe.edu.upc.spring.model.Duenio;

public interface DuenioService {
	public boolean registrar(Duenio duenio);
	public void eliminar(int idDuenio);
	public Optional<Duenio> listarId(int idDuenio);
	List<Duenio> listar();	
}
