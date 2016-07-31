package com.fdp.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @author filippo di pisa
 */

@Service
@ConfigurationProperties(prefix = "rules")
public class MappingsConfiguration {

	private List<MappingProperties> mappingProperties = new ArrayList<>();

	@PostConstruct
	public void init() {
		for(MappingProperties current : this.getMappingProperties()) {
			// DO STUFF, or you can call your get method wherever you want
			System.out.println(current);
		}
	}

	public List<MappingProperties> getMappingProperties() {
		return this.mappingProperties;
	}

}
