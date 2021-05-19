package fr.gestionProjet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.gestionProjet.entities.Projets;
import fr.gestionProjet.service.ProjetsServiceImpl;

@CrossOrigin("*")
@RestController
public class ProjetsController {

	@Autowired
	ProjetsServiceImpl projetService;
	
	@GetMapping("/listPr") 
	public List<Projets> findAllProj()
	{
		return projetService.findAll();
	}
	
	@PostMapping("/addPr")
	public void addProj(@RequestBody Projets proj) 
	{
		projetService.addProj(proj);
	}
	
	@PutMapping("/updatePr")
	public Projets updateProj(@RequestBody Projets proj)
	{
		projetService.updateProj(proj);
		return proj;
	}
	
	@DeleteMapping("/deletePr/{id}")
	public void deleteProj(@PathVariable Long id) 
	{
		Projets proj=	projetService.findById(id);
		projetService.deleteProj(proj);
	}
}
