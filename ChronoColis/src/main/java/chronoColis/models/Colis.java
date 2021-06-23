package chronoColis.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="colis")
public class Colis {

  @Id
  @Column(name="idEnvoi")
  private long id;
  
  @Column(name="name")
  private String name;
  
  @Column(name="reference")
  private String reference;
  
  @Column(name="description")
  private String description;
  
  @Column(name="poids")
  private String poids;
  
  @Column(name="type")
  private String type;
  
  @Column(name="dateEnregistrement")
  private String dateEnregistrement;
      
}
