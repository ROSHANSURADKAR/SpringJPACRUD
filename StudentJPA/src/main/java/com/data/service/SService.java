package com.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.Entity.student;
import com.data.repository.SRepository;

@Service
public class SService {
	@Autowired
	SRepository resp;

	public String savee(student s) {
		resp.save(s);
		return "record added susseccefully";
	}

	public String save(List<student> slist) {
		resp.saveAll(slist);
		return "record add sucessfully";
	}

	public List<student> findalls() {
		return resp.findAll();
	}

	// Find student by roll number
	public student findid(int rollno) {
		return resp.findById(rollno).orElse(null);
	}

	public String deletestudbyid(int rollno) {
		resp.deleteById(rollno);

		return "record deleted sucessfully";

	}

	public String updates(int rollno, student newst) {
		student existstu = resp.findById(rollno).orElse(null);
		if (existstu != null) {

			if (newst != null) {
				if (newst.getName() != null) {
					existstu.setName(newst.getName());
				}
				if (newst.getCourse() != null) {
					existstu.setCourse(newst.getCourse());
				}
				resp.save(existstu);
				return "record updated sucessfully";
			}
		} else {
			return "record not found";
		}
		return "failed";
	}
	
	public long Count()
	{
		return resp.count();
	}

}
