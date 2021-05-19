package fr.gestionProjet.service;

import java.util.List;

import fr.gestionProjet.entities.Departements;

public interface DepartementsService {

	public void addDep(Departements dept);

    public List<Departements> findAll();

    public void updateDep(Departements dept);

    public void deleteDep(Departements dept);

    public Departements findById(Long id);
    
	List<Departements> findByLibelle(String libelle);

}
