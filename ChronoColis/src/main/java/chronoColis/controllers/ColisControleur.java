package chronoColis.controllers;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chronoColis.models.Colis;
import chronoColis.models.Envoie;
import chronoColis.models.User;
import chronoColis.repository.ColisRepo;
import chronoColis.repository.EnvoieRepo;
import chronoColis.repository.UserRepo;

@CrossOrigin // anotation de s�curit� permet la connexion � partir de la m�me machine qui h�berge l'application
@RestController
public class ColisControleur {
  
	@Autowired
	private ColisRepo colisRepo;
	@Autowired
	private EnvoieRepo envoieRepo;
	
	@RequestMapping("/colis/{id}")
	public Colis affiche(@PathVariable("id") int idcolis) {
	  
	    return colisRepo.getById(idcolis);
	    	
	}

	@RequestMapping("/colis")
	 public List<Colis> afficher() {
	  
	    return   colisRepo.findAll();
	
	} 
	
	@Autowired
	private UserRepo userRepo;
	
	
	@RequestMapping("/envoie/{id}")
	public Envoie afficher(@PathVariable("id") int idenvoie) {
	  
	    return  envoieRepo.getById(idenvoie);
	    	
	}
	@RequestMapping("/envoi")
	public List<Envoie> afich(){
		
		return envoieRepo.findAll();
		
		
	}
	
	
	
	@RequestMapping("/savee/{datenvoie}/{reference}/{codesuivie}")
    public void sauvgarder(@PathVariable("dateenvoie" )Date dateenvoie,@PathVariable("reference") String reference,@PathVariable("codesuivie") String codesuivie) {
	  
     Envoie usre = new Envoie();
     usre.setDatenvoie(dateenvoie);
     usre.setCodesuivie(codesuivie);
     usre.setReference(reference);
    envoieRepo.save(usre);
    
	}
	@RequestMapping("/deletenvoi/{id}")
	public void feletenvoie(@PathVariable("id") Integer idenvoie) {
		
		envoieRepo.deleteById(idenvoie);
		
	}
	
	@RequestMapping("/deletcolis/{id}")
	public void deletParcode(@PathVariable("id") int idcolis) {
	  
	  colisRepo.deleteById(idcolis);
	
	}
	
}
	
	