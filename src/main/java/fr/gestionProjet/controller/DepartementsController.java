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

import fr.gestionProjet.entities.Departements;
import fr.gestionProjet.service.DepartementsServiceImpl;

@CrossOrigin("*")
@RestController
public class DepartementsController 
{

	@Autowired
	DepartementsServiceImpl depService;
	
	@GetMapping("/listDe") 
	public List<Departements> findAllDep()
	{
		return depService.findAll();
	}
	
	@PostMapping("/addDe")
	public void addDep(@RequestBody Departements dep) 
	{
		depService.addDep(dep);
	}
	
	@PutMapping("/updateDe")
	public Departements updateDep(@RequestBody Departements dep)
	{
		depService.updateDep(dep);
		return dep;
	}
	
	@DeleteMapping("/deleteDe/{id}")
	public void deleteDep(@PathVariable Long id) 
	{
		Departements dep = depService.findById(id);
		depService.deleteDep(dep);
	}
	
}
