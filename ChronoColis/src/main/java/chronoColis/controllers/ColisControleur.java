package chronoColis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chronoColis.models.Colis;
import chronoColis.models.User;
import chronoColis.repository.ColisRepo;
import chronoColis.repository.UserRepo;

@CrossOrigin // anotation de s�curit� permet la connexion � partir de la m�me machine qui h�berge l'application
@RestController
public class ColisControleur {
  
	@Autowired
	private ColisRepo colisRepo;
	
	
	@RequestMapping("/colis/{id}")
	public Colis affiche(@PathVariable("id") int idcolis) {
	  
	    return colisRepo.getById(idcolis);
	    	
	}

	@RequestMapping("/colis")
	 public List<Colis> afficher() {
	  
	    return   colisRepo.findAll();
	
	} 
	
	
	@RequestMapping("/deletcolis/{id}")
	public void deletParcode(@PathVariable("id") int idcolis) {
	  
	  colisRepo.deleteById(idcolis);
	
	}
	
}
	
	