package fr.gestionProjet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.gestionProjet.entities.Roles;
import fr.gestionProjet.repository.RolesRepository;

@Service
@Transactional
public class RolesServiceImpl implements RolesService {

	@Autowired
	RolesRepository rolesRepository;
	
	@Override
	public void addRol(Roles roles) {
		// TODO Auto-generated method stub
		rolesRepository.save(roles);
	}

	@Override
	public List<Roles> findAll() {
		// TODO Auto-generated method stub
		return rolesRepository.findAll();
	}

	@Override
	public void updateRol(Roles roles) {
		// TODO Auto-generated method stub
		rolesRepository.save(roles);
	}

	@Override
	public void deleteRol(Roles roles) {
		// TODO Auto-generated method stub
		rolesRepository.delete(roles);
	}

	@Override
	public Roles findById(Long id) {
		// TODO Auto-generated method stub
		return rolesRepository.getOne(id);
	}

	@Override
	public List<Roles> findByLibelle(String libelle) {
		// TODO Auto-generated method stub
		return rolesRepository.findByLibelle(libelle);
	}

}
