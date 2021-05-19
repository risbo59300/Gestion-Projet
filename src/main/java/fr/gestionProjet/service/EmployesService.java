package fr.gestionProjet.service;


import java.util.List;

import fr.gestionProjet.entities.Departements;
import fr.gestionProjet.entities.Employes;
import fr.gestionProjet.entities.Projets;
import fr.gestionProjet.entities.Roles;

public interface EmployesService {

	public void addEmp(Employes employes);

    public List<Employes> findAll();

    public void updateEmp(Employes employes);

    public void deleteEmp(Employes employes);

    public Employes findById(Long id);
    
	List<Employes> findByNomOrProjetsOrRolesOrDepartements(String nom, Projets projets, Roles roles, Departements departements);

}
