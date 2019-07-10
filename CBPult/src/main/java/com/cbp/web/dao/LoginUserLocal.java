package com.cbp.web.dao;

import javax.persistence.Table;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cbp.web.dto.DataLoginDTO;
import com.cbp.web.entity.LoginUsers;


@Repository
@Table(name="usersC")
public interface LoginUserLocal extends CrudRepository<LoginUsers, Long>  {
	
	@Query(value = "SELECT users, password, nombre, apellido FROM USERSC where USERS=:userp and PASSWORD=:passp", nativeQuery = true)
	String queryUsers(@Param("userp") String user, @Param("passp") String pass);
	


}
