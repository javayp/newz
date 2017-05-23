package com.nds.apicontroller;


import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nds.entity.Newz;
import com.nds.service.NewzCrudService;

@RestController
public class NdsCrudController {

	@Autowired
	private NewzCrudService newzCrudService;

	@GetMapping(value="/nds/read", 
	produces={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public Collection<Newz> ndsRead(){
		return newzCrudService.getAllNewz();
	}

	@PostMapping(value="/nds/write",
			consumes={"application/json"},
			produces={"application/json"}
	)
	public Newz ndsWrite(@RequestBody Newz newz){
		newzCrudService.save(newz);
		return newz;
	}
}
