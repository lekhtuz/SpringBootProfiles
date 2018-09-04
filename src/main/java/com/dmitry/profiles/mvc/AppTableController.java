package com.dmitry.profiles.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmitry.profiles.service.PingService;

/**
 * @author du376ye
 *
 */
@RestController
public class AppTableController {
	
	@Autowired
	private PingService pingService;

	@GetMapping("/ping")
	public String ping()
	{
		return(pingService.ping());
	}
}
