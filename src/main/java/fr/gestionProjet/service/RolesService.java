package fr.gestionProjet.service;

import java.util.List;

import fr.gestionProjet.entities.Roles;

public interface RolesService  {

	public void addRol(Roles roles);

    public List<Roles> findAll();

    public void updateRol(Roles roles);

    public void deleteRol(Roles roles);

    public Roles findById(Long id);
    
    List<Roles> findByLibelle(String libelle);
}
