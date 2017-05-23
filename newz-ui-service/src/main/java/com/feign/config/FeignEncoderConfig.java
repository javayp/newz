package com.feign.config;

import feign.codec.Encoder;
import feign.form.FormEncoder;

public class FeignEncoderConfig {
	
	public Encoder encoder(){
		return new FormEncoder();
		
	}
}
