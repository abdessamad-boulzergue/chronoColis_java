package chronoColis.models;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="user")
public class User {

	
	
	
	
	
	@Id       // obligatoire ds chaque model
	@Column(name ="iduser" )
	private int iduser;
	
	

	@Column(name ="name" )
	private String name;
	@Column(name ="password" )
	private String password;
	public int getIduser() {
		return iduser;
	}
	public void setIduser(int iduser) {
		this.iduser = iduser;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

	
	
	
}

