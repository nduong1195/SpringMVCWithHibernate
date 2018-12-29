package com.example.demo.resources;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.UsersMapper;
import com.example.demo.model.Users;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {
	
	private UsersMapper usersMapper;
	
	public UsersResource(UsersMapper usersMapper) {
		super();
		this.usersMapper = usersMapper;
	}

	@GetMapping(value="/all", produces=MediaType.APPLICATION_XML_VALUE)
	public List<Users> getAll() {
		return usersMapper.findAll();
	}
	
	@GetMapping("/insert")
	public List<Users> insert() {
		Users user = new Users();
		user.setName("Hai");
		user.setSalary(1235345534L);
		
		usersMapper.insert(user);
		return usersMapper.findAll();
	}
}
