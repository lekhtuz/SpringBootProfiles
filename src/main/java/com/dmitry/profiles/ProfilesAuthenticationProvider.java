package com.dmitry.profiles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

/**
 * @author Dmitry Lekhtuz
 *
 */
public class ProfilesAuthenticationProvider implements AuthenticationProvider {
	private static final Logger log = LoggerFactory.getLogger(ProfilesAuthenticationProvider.class);

	/* (non-Javadoc)
	 * @see org.springframework.security.authentication.AuthenticationProvider#authenticate(org.springframework.security.core.Authentication)
	 */
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException
	{
		log.info("authenticate(Authentication): authentication = {}", authentication);
		
		String name = authentication.getName();
        String password = authentication.getCredentials().toString();
        
		// TODO Auto-generated method stub
		return(new UsernamePasswordAuthenticationToken(name, password));
	}

	/* (non-Javadoc)
	 * @see org.springframework.security.authentication.AuthenticationProvider#supports(java.lang.Class)
	 */
	@Override
	public boolean supports(Class<?> authentication)
	{
		log.info("supports(Class): authentication = {}", authentication);
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}
