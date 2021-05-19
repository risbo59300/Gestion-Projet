package fr.gestionProjet.service;

import java.util.Date;
import java.util.List;

import fr.gestionProjet.entities.Projets;

public interface ProjetsService {

	public void addProj(Projets projets);

    public List<Projets> findAll();

    public void updateProj(Projets projets);

    public void deleteProj(Projets projets);

    public Projets findById(Long id);
    
    List<Projets> findByTitreOrTypeOrClientOrDatedebut(String titre, String type, String client, Date dateDebut);
}
