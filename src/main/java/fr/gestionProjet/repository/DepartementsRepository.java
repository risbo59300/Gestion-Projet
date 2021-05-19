package fr.gestionProjet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.gestionProjet.entities.Departements;
import java.lang.String;
import java.util.List;

public interface DepartementsRepository extends JpaRepository<Departements, Long>{
	
	List<Departements> findByLibelle(String libelle);

}
