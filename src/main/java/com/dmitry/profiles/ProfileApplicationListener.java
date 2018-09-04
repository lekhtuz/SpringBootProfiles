package com.dmitry.profiles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author du376ye
 *
 */
@Component
public class ProfileApplicationListener {
	private static Logger LOG = LogManager.getLogger(ProfileApplicationListener.class);

	/**
	 * @param event
	 */
	@EventListener
	public void listen(ApplicationEvent event)
	{
		final String _M = "listen(ApplicationEvent):";
		
		LOG.info("{} called. event = {}", _M, event);
	}
}
