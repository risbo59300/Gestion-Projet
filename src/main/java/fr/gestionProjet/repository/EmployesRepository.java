package fr.gestionProjet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.gestionProjet.entities.Departements;
import fr.gestionProjet.entities.Employes;
import fr.gestionProjet.entities.Projets;
import fr.gestionProjet.entities.Roles;

import java.lang.String;
import java.util.List;

public interface EmployesRepository extends JpaRepository<Employes, Long>{

	List<Employes> findByNomOrProjetsOrRolesOrDepartements(String nom, Projets projets, Roles roles, Departements departements);
}
