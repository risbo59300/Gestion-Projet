package fr.gestionProjet.service;

import java.util.Date;
import java.util.List;

import fr.gestionProjet.entities.Modules;
import fr.gestionProjet.entities.Taches;

public interface TachesService {

	public void addTach(Taches taches);

    public List<Taches> findAll();

    public void updateTach(Taches taches);

    public void deleteTach(Taches taches);

    public Taches findById(Long id);
    
    List<Taches> findByLibelleOrModulesOrDatedebut(String libelle, Modules modules, Date dateDebut);
}
