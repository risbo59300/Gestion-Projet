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

import fr.gestionProjet.entities.Roles;
import fr.gestionProjet.service.RolesServiceImpl;

@CrossOrigin("*")
@RestController
public class RolesController {

	@Autowired
	RolesServiceImpl rolesService;
	
	@GetMapping("/listRo") 
	public List<Roles> findAllRol()
	{
		return rolesService.findAll();
	}
	
	@PostMapping("/addRo")
	public void addRol(@RequestBody Roles rol) 
	{
		rolesService.addRol(rol);
	}
	
	@PutMapping("/updateRo")
	public Roles updateRol(@RequestBody Roles rol)
	{
		rolesService.updateRol(rol);
		return rol;
	}
	
	@DeleteMapping("/deleteRo/{id}")
	public void deleteRol(@PathVariable Long id) 
	{
		Roles rol=	rolesService.findById(id);
		rolesService.deleteRol(rol);
	}
}
