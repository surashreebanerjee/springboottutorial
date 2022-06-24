package com.project.springboot.helloworld.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.springboot.helloworld.entities.User;
import com.project.springboot.helloworld.service.UserService;

@RestController
public class UserController {
@Autowired
UserService userservice;
@GetMapping("/users")
public List<User> getAllusers()
{
	return userservice.getAllusers();
}
@PostMapping("/users")
public User addUser(@RequestBody User user)
{
	return userservice.addUser(user);
}
@GetMapping("/users/{id}")
public Optional<User> getUserbyId(@PathVariable Long id)
{
	return userservice.getUserbyId(id);
}
@GetMapping("/users/username/{username}")
public User getUserbyuserName(@PathVariable String username)
{
	return userservice.findUserbyUserName(username);
}
@PutMapping("/users/{id}")
public User updateUser(@RequestBody User user,@PathVariable Long id)
{
	return userservice.updateUser(user, id);
}
@DeleteMapping("/users/{id}")
public void deleteUser(@PathVariable Long id)
{
	userservice.deleteUser(id);
}
}
