package chronoColis.repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import chronoColis.models.User; 
public interface UserRepo extends JpaRepository<User, Integer>{

   /*
    * use getById
    */
	@Query("select u from User u where iduser=:iduser")
	public User getUser(@Param(value = "iduser") int iduser);
	
	/*
	 * use save to insert
	 */
	@Query(value="insert into user (iduser,name,password) value (:iduser,:name,:password) " ,nativeQuery = true)
	@Transactional
	public void inserUser(@Param(value="iduser") int iduser,@Param(value="name") String name,@Param(value="password") String password);
	
   /*
    * use deleteById
    */
	@Modifying
	@Query(" delete  from User  u where u.iduser=:iduser")
	@Transactional
	public void deletUser(@Param(value="iduser") int iduser);

}
