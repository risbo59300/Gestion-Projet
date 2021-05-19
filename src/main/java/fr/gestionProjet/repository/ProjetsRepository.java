package fr.gestionProjet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.gestionProjet.entities.Projets;
import java.lang.String;
import java.util.Date;
import java.util.List;

public interface ProjetsRepository extends JpaRepository<Projets, Long>{

	List<Projets> findByTitreOrTypeOrClientOrDatedebut(String titre, String type, String client, Date dateDebut);
}
