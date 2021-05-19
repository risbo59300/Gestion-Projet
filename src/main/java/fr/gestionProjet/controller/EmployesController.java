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

import fr.gestionProjet.entities.Employes;
import fr.gestionProjet.service.EmployesServiceImpl;

@CrossOrigin("*")
@RestController
public class EmployesController {

	@Autowired
	EmployesServiceImpl empService;
	
	@GetMapping("/listEmpl") 
	public List<Employes> findAllEmp()
	{
		return empService.findAll();
	}
	
	@PostMapping("/addEmpl")
	public void addEmp(@RequestBody Employes emp) 
	{
		empService.addEmp(emp);
	}
	
	@PutMapping("/updateEmpl")
	public Employes updateEmp(@RequestBody Employes emp)
	{
		empService.updateEmp(emp);
		return emp;
	}
	
	@DeleteMapping("/deleteEmpl/{id}")
	public void deleteEmp(@PathVariable Long id) 
	{
		Employes emp=	empService.findById(id);
		empService.deleteEmp(emp);
	}
}
