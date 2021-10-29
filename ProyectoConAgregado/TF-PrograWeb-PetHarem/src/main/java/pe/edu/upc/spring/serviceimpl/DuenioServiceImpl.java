package pe.edu.upc.spring.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.spring.model.Duenio;
import pe.edu.upc.spring.repository.DuenioRepository;
import pe.edu.upc.spring.service.DuenioService;

@Service
public class DuenioServiceImpl implements DuenioService {

	@Autowired
	private DuenioRepository dDuenio;
	
	@Override
	@Transactional
	public boolean registrar(Duenio duenio) {
		Duenio objDuenio = dDuenio.save(duenio);
		if (objDuenio == null)
			return false;
		else
			return true;
	}

	@Override
	@Transactional
	public void eliminar(int idDuenio) {
		dDuenio.deleteById(idDuenio);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Duenio> listarId(int idDuenio) {
		return dDuenio.findById(idDuenio);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Duenio> listar() {
		return dDuenio.findAll();
	}

}
