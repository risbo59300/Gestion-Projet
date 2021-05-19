package fr.gestionProjet.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.gestionProjet.entities.Modules;
import fr.gestionProjet.entities.Projets;
import fr.gestionProjet.entities.Taches;

public interface ModulesRepository extends JpaRepository<Modules, Long>{
	
	List<Modules> findByNomOrProjetsOrTachesOrDatedebut(String nom, Projets projets, Taches taches, Date dateDebut);

}
