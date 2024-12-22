package com.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.Entity.Library;

import com.data.repository.LRepository;

@Service
public class LService {
	@Autowired
	LRepository r;

	public String saveli(Library li) {
		r.save(li);
		return "add sucessfully";
	}
	public String saveall(List<Library> llist)
	{
		r.saveAll(llist);
		return "record added sucessfully";
	}
	
	public List<Library> findalls() {
		return r.findAll();
	}

	
	public Library findid(int id) {
		return r.findById(id).orElse(null);
	}

	public String deleteprobyid(int id) {
		r.deleteById(id);

		return "record deleted sucessfully";

	}
	
	public String updates(int id, Library newli) {
		Library existli = r.findById(id).orElse(null);
		if (existli != null) {

			if (newli != null) {
				if (newli.getTitle() != null) {
					existli.setTitle(newli.getTitle());
				}
				if (newli.getAuthor() != null) {
					existli.setAuthor(newli.getAuthor());
				}
				if (newli.getCopies()!= 0) {
					existli.setCopies(newli.getCopies());
				}
				
				r.save(existli);
				return "record updated sucessfully";
			}
		} else {
			return "record not found";
		}
		return "failed";
	}
}
