package chronoColis.controllers;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chronoColis.models.User;
import chronoColis.repository.UserRepo;
import medicale.models.Dossiermedicale;

@CrossOrigin // anotation de sécurité permet la connexion à partir de la méme machine qui héberge l'application
@RestController

public class UserControleur {
	@Autowired
	private UserRepo use;
	
	
	@RequestMapping("/user/{id}")
	public User affiche(@PathVariable("id") int iduser) {
	
	return use.getUser(iduser);
	
	
	
}

	
	
	@RequestMapping("/users")
	 public List<User> afficher() {
		
     return   use.findAll();
     
 } 

	
	@RequestMapping("/deletuser/{id}")
	public void deletParcode(@PathVariable("id") int iduser) {
	
	 use.deletUser(iduser);
	 
	System.out.println("  user de numero  "+" "+iduser+"supprimer");
	}
	
	
	
	//@RequestMapping("/inseruser/{iduser}/{name}/{password}")
	 //  public User ajouteruser(@PathVariable("iduser") int iduser,@PathVariable("name") String name,@PathVariable("password") String password) {
			User u=new User();
		
			//u=
			
			//System.out.println("l'insertion de  "+iduser+" "+name+" "+" "+" "+password );
			//return d;
		}
	
	
	
	
}
	
	