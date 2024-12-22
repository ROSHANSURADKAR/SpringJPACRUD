package com.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.data.Entity.Library;

import com.data.service.LService;


@RestController
@RequestMapping("/li")
public class LController {
	@Autowired
	LService se;
	@PostMapping("/save")
	public String postsave(@RequestBody Library l) {
		//TODO: process POST request
		
		return se.saveli(l);
	}
	@PostMapping("/saveall")
	public String postsaveall(@RequestBody List<Library> llist) {
		//TODO: process POST request
		
		return se.saveall(llist);
	}
	
	@GetMapping("/find")
	public List<Library> getfindalls() {
		return se.findalls();
	}
	
	@GetMapping("/findid")
	public Library getfindid(@RequestParam int id) {
		return se.findid(id);
	}
	@DeleteMapping("/delete")
	public String deletebyid(@RequestParam int id)
	{
		return se.deleteprobyid(id);
	}
	@PutMapping("/updated")
	public String putupdate(@RequestParam int id ,@RequestBody Library l) {
		//TODO: process PUT request
		
		return se.updates(id, l);
	}
	
}
