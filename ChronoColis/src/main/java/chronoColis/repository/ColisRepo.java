package chronoColis.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import chronoColis.models.Colis; 
public interface ColisRepo extends JpaRepository<Colis, Integer>{



}
