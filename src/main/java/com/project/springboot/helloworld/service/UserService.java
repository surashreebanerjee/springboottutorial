package com.project.springboot.helloworld.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.springboot.helloworld.entities.User;
import com.project.springboot.helloworld.reprository.UserRepository;

@Service
public class UserService {
@Autowired
UserRepository userrepository;
public List<User> getAllusers()
{
	return userrepository.findAll();
}
public User addUser(User user)
{
	return userrepository.save(user);
}
public Optional<User> getUserbyId(Long id)
{
	return userrepository.findById(id);
}
public User updateUser(User user,Long id)
{
	user.setId(id);
	return userrepository.save(user);
}
public void deleteUser(Long id)
{
	userrepository.deleteById(id);
}
public User findUserbyUserName(String userName)
{
	return userrepository.findByUserName(userName);
}
}
