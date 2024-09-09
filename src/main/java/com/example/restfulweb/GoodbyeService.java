package com.example.restfulweb;

import org.springframework.stereotype.Component;

@Component
public class GoodbyeService {
	
	//no fields
	
	//it has an implicit constructor
	// public GoodbyeService() {
	// }
	
	//methods
	public String goodbye() {
		return "That's all folks.";
	}

}
