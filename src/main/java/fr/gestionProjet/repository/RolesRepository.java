package fr.gestionProjet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.gestionProjet.entities.Roles;
import java.util.List;
import java.lang.String;

public interface RolesRepository extends JpaRepository<Roles, Long>{
	
	List<Roles> findByLibelle(String libelle);

}
