package com.dmitry.profiles.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.dmitry.profiles.aop.Auditable;

/**
 * @author du376ye
 *
 */
@Service
public class PingServiceImpl implements PingService {
	private static Logger LOG = LogManager.getLogger(PingServiceImpl.class);

	/* (non-Javadoc)
	 * @see com.dmitry.profiles.service.PingService#ping()
	 */
	@Override
	@Auditable(value = "ping()", log = PingServiceImpl.class)
	public String ping()
	{
		final String _M = "ping():";
		
		LOG.info("{} called.", _M);
		return("Hello, world!");
	}
}
