package com.nds.service;


import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nds.entity.Newz;
import com.nds.repo.NewzCrudRepo;

@Service
public class NewzCrudService {
	
	@Autowired
	private NewzCrudRepo newzCrudRepo;
	
	public Collection<Newz> getAllNewz(){
		return newzCrudRepo.findAll();
	}
	
	public void save(Newz newz){
		newzCrudRepo.save(newz);
	}
}
