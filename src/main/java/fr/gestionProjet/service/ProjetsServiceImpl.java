package fr.gestionProjet.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.gestionProjet.entities.Projets;
import fr.gestionProjet.repository.ProjetsRepository;

@Service
@Transactional
public class ProjetsServiceImpl implements ProjetsService {

	@Autowired
	ProjetsRepository projetsRepository;
	
	@Override
	public void addProj(Projets projets) {
		// TODO Auto-generated method stub
		projetsRepository.save(projets);

	}

	@Override
	public List<Projets> findAll() {
		// TODO Auto-generated method stub
		return projetsRepository.findAll();
	}

	@Override
	public void updateProj(Projets projets) {
		// TODO Auto-generated method stub
		projetsRepository.save(projets);
	}

	@Override
	public void deleteProj(Projets projets) {
		// TODO Auto-generated method stub
		projetsRepository.delete(projets);
	}

	@Override
	public Projets findById(Long id) {
		// TODO Auto-generated method stub
		return projetsRepository.getOne(id);
	}

	@Override
	public List<Projets> findByTitreOrTypeOrClientOrDatedebut(String titre, String type, String client,
			Date dateDebut) {
		// TODO Auto-generated method stub
		return projetsRepository.findByTitreOrTypeOrClientOrDatedebut(titre, type, client, dateDebut);
	}

}
