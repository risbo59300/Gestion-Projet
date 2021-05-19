package fr.gestionProjet.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.gestionProjet.entities.Modules;
import fr.gestionProjet.entities.Taches;
import fr.gestionProjet.repository.TachesRepository;

@Service
@Transactional
public class TachesServiceImpl implements TachesService {

	@Autowired
	TachesRepository tacheRepository;
	
	@Override
	public void addTach(Taches taches) {
		// TODO Auto-generated method stub
		tacheRepository.save(taches);
	}

	@Override
	public List<Taches> findAll() {
		// TODO Auto-generated method stub
		return tacheRepository.findAll();
	}

	@Override
	public void updateTach(Taches taches) {
		// TODO Auto-generated method stub
		tacheRepository.save(taches);
	}

	@Override
	public void deleteTach(Taches taches) {
		// TODO Auto-generated method stub
		tacheRepository.delete(taches);
	}

	@Override
	public Taches findById(Long id) {
		// TODO Auto-generated method stub
		return tacheRepository.getOne(id);
	}

	@Override
	public List<Taches> findByLibelleOrModulesOrDatedebut(String libelle, Modules modules, Date dateDebut) {
		// TODO Auto-generated method stub
		return tacheRepository.findByLibelleOrModulesOrDatedebut(libelle, modules, dateDebut);
	}

}
