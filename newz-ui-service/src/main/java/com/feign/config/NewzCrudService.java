package com.feign.config;

import java.util.Collection;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.nui.modelData.Newz;

@Component
@FeignClient("NEWZ-DATA-SERVICE")
public interface NewzCrudService {
	
	@GetMapping(value="/nds/read")
	public Collection<Newz> ndsRead();
}
