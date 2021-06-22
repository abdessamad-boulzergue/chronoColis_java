package chronoColis.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import chronoColis.models.User; 
public interface UserRepo extends JpaRepository<User, Integer>{



}
