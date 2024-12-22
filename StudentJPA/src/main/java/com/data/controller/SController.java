package com.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.data.Entity.student;
import com.data.service.SService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class SController {
	@Autowired
	SService se;

	@PostMapping("/seve")
	public String savee(@RequestBody student s) {
		return se.savee(s);
	}
	@PostMapping("/save")
	public String saveall(@RequestBody List<student> slist) {
		//TODO: process POST request
		
		return se.save(slist);
	}
	
	@GetMapping("/find")
	public List<student> getfindalls() {
		return se.findalls();
	}
	
	@GetMapping("/findid")
	public student getfindid(@RequestParam int rollno) {
		return se.findid(rollno);
	}
	@DeleteMapping("/delete")
	public String deletebyid(@RequestParam int rollno)
	{
		return se.deletestudbyid(rollno);
	}
	
	@PutMapping("/updated")
	public String putupdate(@RequestParam int rollno ,@RequestBody student s) {
		//TODO: process PUT request
		
		return se.updates(rollno, s);
	}
	
	@GetMapping("/count")
	public long getcount() {
		return se.Count();
	}
	

}
