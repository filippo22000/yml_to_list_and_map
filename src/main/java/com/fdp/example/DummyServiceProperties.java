package com.fdp.example;

/*
 * #%L
 * spring-boot-ff4j-autoconfigure
 * %%
 * Copyright (C) 2013 - 2016 FF4J
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Filippo di Pisa
 */
@ConfigurationProperties(prefix = DummyServiceProperties.PREFIX)
public class DummyServiceProperties {

	public static final String PREFIX = "service.ff4j";


	private String url;

	private List<Mapping> mappings;


	public String getUrl() {
		return this.url;
	}


	public void setUrl(String url) {
		this.url = url;
	}

	public List<Mapping> getMappings() {
		return mappings;
	}

	public void setMappings(List<Mapping> mappings) {
		this.mappings = mappings;

	}


}
