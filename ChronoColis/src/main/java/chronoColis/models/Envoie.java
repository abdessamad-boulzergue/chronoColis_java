package chronoColis.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="envoie")
public class Envoie {
	public int getIdevoie() {
		return idevoie;
	}
	public void setIdevoie(int idevoie) {
		this.idevoie = idevoie;
	}
	public Date getDatenvoie() {
		return datenvoie;
	}
	public void setDatenvoie(Date datenvoie) {
		this.datenvoie = datenvoie;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getCodesuivie() {
		return codesuivie;
	}
	public void setCodesuivie(String codesuivie) {
		this.codesuivie = codesuivie;
	}
	@Id       // obligatoire ds chaque model
	@Column(name ="idevoie" )
	private int idevoie;
	
	

	@Column(name ="datenvoie" )
	private Date datenvoie;
	
	@Column(name ="reference" )
	private String reference;
	@Column(name ="codesuivie" )
	private String codesuivie;
	
	
}
