package com.dmitry.profiles;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @author du376ye
 *
 */
@SpringBootApplication
@EnableJpaAuditing
@EnableConfigurationProperties(ProfilesProperties.class)
public class ProfilesApplication {
	private static Logger LOG = LogManager.getLogger(ProfilesApplication.class);

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		final String _M = "main():";
		
		LOG.info("{} started. args = {}", _M, Arrays.toString(args));

		SpringApplication.run(ProfilesApplication.class, args);
		LOG.info("{} ended.", _M);
	}
}
