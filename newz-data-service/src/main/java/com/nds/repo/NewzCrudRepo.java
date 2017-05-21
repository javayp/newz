package com.nds.repo;

import org.springframework.data.repository.CrudRepository;

import com.nds.entity.Newz;

public interface NewzCrudRepo extends CrudRepository<Newz,Integer> {
	
}
