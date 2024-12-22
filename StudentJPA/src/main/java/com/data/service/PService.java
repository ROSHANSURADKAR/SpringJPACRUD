package com.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.Entity.Product;

import com.data.repository.PRepository;

@Service
public class PService {
	@Autowired
	PRepository rep;
	
	public String saveproduct(Product prod)
	{
		rep.save(prod);
		return "record added sucessfully";
	}
	
	public String saveall(List<Product> plist)
	{
		rep.saveAll(plist);
		return "record added sucessfully";
	}
	
	public List<Product> findalls() {
		return rep.findAll();
	}

	
	public Product findid(int id) {
		return rep.findById(id).orElse(null);
	}

	public String deleteprobyid(int id) {
		rep.deleteById(id);

		return "record deleted sucessfully";

	}
	
	public String updates(int id, Product newst) {
		Product existpro = rep.findById(id).orElse(null);
		if (existpro != null) {

			if (newst != null) {
				if (newst.getPname() != null) {
					existpro.setPname(newst.getPname());
				}
				if (newst.getCategory() != null) {
					existpro.setCategory(newst.getCategory());
				}
				if (newst.getPrice()!= 0) {
					existpro.setPrice(newst.getPrice());
				}
				if (newst.getPrice()!= 0) {
					existpro.setQty(newst.getQty());
				}
				rep.save(existpro);
				return "record updated sucessfully";
			}
		} else {
			return "record not found";
		}
		return "failed";
	}
	
	public long Count()
	{
		return rep.count();
	}
	
}
