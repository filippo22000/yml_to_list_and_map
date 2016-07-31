package com.fdp.example;

import com.sun.xml.internal.xsom.impl.scd.Iterators;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author filippo di pisa
 */
@Configuration
@EnableConfigurationProperties(DummyServiceProperties.class)
@ComponentScan
public class DummyConfiguration {

	@Autowired
	DummyServiceProperties dummyServiceProperties;

	@Bean
	public Map<String, String> getDummyMap() {
		//map xml now
		//then parse xml to json
		//then
		Map<String, String> map = dummyServiceProperties.getMappings()
				.stream()
				.collect(Collectors.toMap(Mapping::getKey,
										  Mapping::getValue));
		return map;
	}
}
