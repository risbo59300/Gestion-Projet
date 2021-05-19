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

import fr.gestionProjet.entities.Modules;
import fr.gestionProjet.service.ModulesServiceImpl;

@CrossOrigin("*")
@RestController
public class ModulesController {

	@Autowired
	ModulesServiceImpl modulesService;
	
	@GetMapping("/listMo") 
	public List<Modules> findAllMod()
	{
		return modulesService.findAll();
	}
	
	@PostMapping("/addMo")
	public void addMod(@RequestBody Modules mod) 
	{
		modulesService.addMod(mod);
	}
	
	@PutMapping("/updateMo")
	public Modules updateMod(@RequestBody Modules mod)
	{
		modulesService.updateMod(mod);
		return mod;
	}
	
	@DeleteMapping("/deleteDe/{id}")
	public void deleteMod(@PathVariable Long id) 
	{
		Modules mod=	modulesService.findById(id);
		modulesService.deleteMod(mod);
	}
}
