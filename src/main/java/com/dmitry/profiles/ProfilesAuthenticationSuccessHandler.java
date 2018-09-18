package com.dmitry.profiles;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

/**
 * @author du376ye
 *
 */
public class ProfilesAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
	private static Logger LOG = LogManager.getLogger(ProfilesAuthenticationSuccessHandler.class);

	/* (non-Javadoc)
	 * @see org.springframework.security.web.authentication.AuthenticationSuccessHandler#onAuthenticationSuccess(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, org.springframework.security.core.Authentication)
	 */
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException
	{
		LOG.info("onAuthenticationSuccess(): called. authentication = {}", authentication);

		// If home page needs to be calculated, do it here and use response.sendRedirect("/"); to issue redirect.
		// Static home page can be provided in *LoginConfigurer.loginProcessingUrl("/")
	}

}
