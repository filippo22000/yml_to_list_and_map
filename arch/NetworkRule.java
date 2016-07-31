package com.fdp.example;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author filippo di pisa
 */
@Data
@NoArgsConstructor
public class NetworkRule {

	private int size;
	private String prefix;
	private String regex;

	public NetworkRule(int size, String prefix, String regex) {
		this.size = size;
		this.prefix = prefix;
		this.regex = regex;
	}

	// GETTERS & SETTERS
}
