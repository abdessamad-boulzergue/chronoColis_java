package chronoColis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chronoColis.models.User;
import chronoColis.repository.UserRepo;

@CrossOrigin // anotation de s�curit� permet la connexion � partir de la m�me machine qui h�berge l'application
@RestController
public class UserControleur {
  
	@Autowired
	private UserRepo userRepo;
	
	
	@RequestMapping("/user/{id}")
	public User affiche(@PathVariable("id") int iduser) {
	  
	    return userRepo.getById(iduser);
	    	
	}

	@RequestMapping("/users")
	 public List<User> afficher() {
	  
	    return   userRepo.findAll();
	
	} 
	
	@RequestMapping("/save")
    public void sauvgarder() {
	  
     User usr = new User();
     usr.setName("user 1 ");
     usr.setPassword("pass");
         userRepo.save(usr);
   
         System.out.println("utilisateur sauvgarder");
   } 

	
	@RequestMapping("/deletuser/{id}")
	public void deletParcode(@PathVariable("id") int iduser) {
	  
	  userRepo.deleteById(iduser);
	
	}
	
}
	
	