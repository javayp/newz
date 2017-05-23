package com.feign.config;

import java.util.Collection;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nui.modelData.Newz;

@Component
@FeignClient(configuration=FeignEncoderConfig.class,value="NEWZ-DATA-SERVICE")
public interface NewzCrudServiceClient {
	
	@GetMapping(value="/nds/read")
	public Collection<Newz> ndsRead();
	
	@PostMapping(value="/nds/write")
	public Newz ndsWrite(Newz newz);
}
