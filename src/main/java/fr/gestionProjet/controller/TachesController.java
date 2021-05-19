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

import fr.gestionProjet.entities.Taches;
import fr.gestionProjet.service.TachesServiceImpl;

@CrossOrigin("*")
@RestController
public class TachesController {

	@Autowired
	TachesServiceImpl tachesService;
	
	@GetMapping("/listTa") 
	public List<Taches> findAllTach()
	{
		return tachesService.findAll();
	}
	
	@PostMapping("/addTa")
	public void addTach(@RequestBody Taches tach) 
	{
		tachesService.addTach(tach);
	}
	
	@PutMapping("/updateTa")
	public Taches updateTach(@RequestBody Taches tach)
	{
		tachesService.updateTach(tach);
		return tach;
	}
	
	@DeleteMapping("/deleteTa/{id}")
	public void deleteTach(@PathVariable Long id) 
	{
		Taches tach=	tachesService.findById(id);
		tachesService.deleteTach(tach);
	}
}
