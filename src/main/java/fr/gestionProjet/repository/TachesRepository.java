package fr.gestionProjet.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.gestionProjet.entities.Modules;
import fr.gestionProjet.entities.Taches;

public interface TachesRepository extends JpaRepository<Taches, Long>{
	
	List<Taches> findByLibelleOrModulesOrDatedebut(String libelle, Modules modules, Date dateDebut);

}
