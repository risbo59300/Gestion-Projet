package fr.gestionProjet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.gestionProjet.entities.Departements;
import fr.gestionProjet.repository.DepartementsRepository;

@Service
@Transactional
public class DepartementsServiceImpl implements DepartementsService {

	@Autowired
	DepartementsRepository departementsRepository;
	
	@Override
	public void addDep(Departements dept) {
		// TODO Auto-generated method stub
		departementsRepository.save(dept);

	}

	@Override
	public List<Departements> findAll() {
		// TODO Auto-generated method stub
		return departementsRepository.findAll();
	}

	@Override
	public void updateDep(Departements dept) {
		// TODO Auto-generated method stub
		departementsRepository.save(dept);
	}

	@Override
	public void deleteDep(Departements dept) {
		// TODO Auto-generated method stub
		departementsRepository.delete(dept);
	}

	@Override
	public Departements findById(Long id) {
		// TODO Auto-generated method stub
		return departementsRepository.getOne(id);
	}

	@Override
	public List<Departements> findByLibelle(String libelle) {
		// TODO Auto-generated method stub
		return departementsRepository.findByLibelle(libelle);
	}

}
