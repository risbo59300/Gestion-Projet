package fr.gestionProjet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.gestionProjet.entities.Departements;
import fr.gestionProjet.entities.Employes;
import fr.gestionProjet.entities.Projets;
import fr.gestionProjet.entities.Roles;
import fr.gestionProjet.repository.EmployesRepository;

@Service
@Transactional
public class EmployesServiceImpl implements EmployesService {

	@Autowired
	EmployesRepository employesRepository;
	
	@Override
	public void addEmp(Employes employes) {
		// TODO Auto-generated method stub
		employesRepository.save(employes);
	}

	@Override
	public List<Employes> findAll() {
		// TODO Auto-generated method stub
		return employesRepository.findAll();
	}

	@Override
	public void updateEmp(Employes employes) {
		// TODO Auto-generated method stub
		employesRepository.save(employes);
	}

	@Override
	public void deleteEmp(Employes employes) {
		// TODO Auto-generated method stub
		employesRepository.delete(employes);
	}

	@Override
	public Employes findById(Long id) {
		// TODO Auto-generated method stub
		return employesRepository.getOne(id);
	}

	@Override
	public List<Employes> findByNomOrProjetsOrRolesOrDepartements(String nom, Projets projets, Roles roles,
			Departements departements) {
		// TODO Auto-generated method stub
		return employesRepository.findByNomOrProjetsOrRolesOrDepartements(nom, projets, roles, departements);
	}

}
