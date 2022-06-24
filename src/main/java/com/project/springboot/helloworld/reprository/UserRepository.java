package com.project.springboot.helloworld.reprository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.springboot.helloworld.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
 public User  findByUserName(String userName);
}
