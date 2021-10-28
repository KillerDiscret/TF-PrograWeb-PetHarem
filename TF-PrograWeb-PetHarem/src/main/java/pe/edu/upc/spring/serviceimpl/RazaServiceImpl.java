package pe.edu.upc.spring.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.spring.model.Raza;
import pe.edu.upc.spring.repository.IRazaRepository;
import pe.edu.upc.spring.service.IRazaService;

@Service
public class RazaServiceImpl implements IRazaService {

	@Autowired
	private IRazaRepository dRaza;
	
	@Override
	@Transactional
	public boolean insertar(Raza raza) {
		
		Raza objRaza = dRaza.save(raza);
		if(objRaza == null) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	@Transactional
	public boolean modificar(Raza raza) {
		boolean flag = false;
		try {
			dRaza.save(raza);
			flag= true;
		}
		catch(Exception ex){
			System.out.println("Sucedio un error al modificar");
		}
		return flag;
	}

	@Override
	@Transactional
	public void eliminar(int idRaza) {
		dRaza.deleteById(idRaza);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Raza> listarId(int idRaza) {
		return dRaza.findById(idRaza);
		
	}

	@Override
	@Transactional(readOnly = true)
	public List<Raza> listar() {
		return dRaza.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Raza> buscarNombre(String nombreRaza) {
		return dRaza.buscarNombre(nombreRaza);
	}

	
	
	
}
