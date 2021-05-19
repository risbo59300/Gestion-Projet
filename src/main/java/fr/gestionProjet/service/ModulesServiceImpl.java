package fr.gestionProjet.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.gestionProjet.entities.Modules;
import fr.gestionProjet.entities.Projets;
import fr.gestionProjet.entities.Taches;
import fr.gestionProjet.repository.ModulesRepository;

@Service
@Transactional
public class ModulesServiceImpl implements ModulesService {

	@Autowired
	ModulesRepository modulesRepository;
	
	@Override
	public void addMod(Modules modules) {
		// TODO Auto-generated method stub
		modulesRepository.save(modules);

	}

	@Override
	public List<Modules> findAll() {
		// TODO Auto-generated method stub
		return modulesRepository.findAll();
	}

	@Override
	public void updateMod(Modules modules) {
		// TODO Auto-generated method stub
		modulesRepository.save(modules);
	}

	@Override
	public void deleteMod(Modules modules) {
		// TODO Auto-generated method stub
		modulesRepository.delete(modules);
	}

	@Override
	public Modules findById(Long id) {
		// TODO Auto-generated method stub
		return modulesRepository.getOne(id);
	}

	@Override
	public List<Modules> findByNomOrProjetsOrTachesOrDatedebut(String nom, Projets projets, Taches taches,
			Date dateDebut) {
		// TODO Auto-generated method stub
		return modulesRepository.findByNomOrProjetsOrTachesOrDatedebut(nom, projets, taches, dateDebut);
	}

}
