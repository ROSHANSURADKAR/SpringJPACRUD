package com.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.data.Entity.Product;

import com.data.service.PService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/pro")
public class PController {
	@Autowired
	PService sev;
	@PostMapping("/save")
	public String postsave(@RequestBody Product p) {
		//TODO: process POST request
		
		return sev.saveproduct(p);
	}
	
	@PostMapping("/saveall")
	public String postsaveall(@RequestBody List<Product> plist) {
		//TODO: process POST request
		
		return sev.saveall(plist);
	}
	
	@GetMapping("/find")
	public List<Product> getfindalls() {
		return sev.findalls();
	}
	
	@GetMapping("/findid")
	public Product getfindid(@RequestParam int id) {
		return sev.findid(id);
	}
	@DeleteMapping("/delete")
	public String deletebyid(@RequestParam int id)
	{
		return sev.deleteprobyid(id);
	}
	@PutMapping("/updated")
	public String putupdate(@RequestParam int id ,@RequestBody Product p) {
		//TODO: process PUT request
		
		return sev.updates(id, p);
	}
	
	@GetMapping("/count")
	public long getMethodName() {
		return sev.Count();
	}
	

}
