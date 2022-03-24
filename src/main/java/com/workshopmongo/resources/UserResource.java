package com.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User us = new User("1", "Diego Brito", "teste@teste");
		User us2 = new User("2", "Douglas Brito", "teste2@teste");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(us, us2));
		return ResponseEntity.ok().body(list);
	}
}
