package com.springSecurity.springSecurity.repo;

import com.springSecurity.springSecurity.Entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends JpaRepository<ToDo,Long> {

}
