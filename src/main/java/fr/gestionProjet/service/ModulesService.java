package fr.gestionProjet.service;

import java.util.Date;
import java.util.List;

import fr.gestionProjet.entities.Modules;
import fr.gestionProjet.entities.Projets;
import fr.gestionProjet.entities.Taches;

public interface ModulesService  {

	public void addMod(Modules modules);

    public List<Modules> findAll();

    public void updateMod(Modules modules);

    public void deleteMod(Modules modules);

    public Modules findById(Long id);
    
    List<Modules> findByNomOrProjetsOrTachesOrDatedebut(String nom, Projets projets, Taches taches, Date dateDebut);
}
