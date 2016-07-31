package com.fdp.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author filippo di pisa
 */
@Service
public class DemoService {

	@Autowired
	AvailableChannelsConfiguration availableChannelsConfiguration;

	public DemoService() {
		int a = 1;
	}
}
