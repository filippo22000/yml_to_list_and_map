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
public class ConfigurationService {
	private List<NetworkRule> networkRules = new ArrayList<>();

	@PostConstruct
	public void init() {
		for(NetworkRule current : this.getNetworkRules()) {
			// DO STUFF, or you can call your get method wherever you want
		}
	}

	public List<NetworkRule> getNetworkRules() {
		return this.networkRules;
	}
}