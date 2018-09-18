package com.dmitry.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author du376ye
 *
 */
@Configuration
@EnableWebSecurity
public class ProfilesSecurityConfig extends WebSecurityConfigurerAdapter {
	/* (non-Javadoc)
	 * @see org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#authenticationManagerBean()
	 */
	@Bean("authenticationManager")
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception
	{
		return super.authenticationManagerBean();
	}
 
	/**
	 * @param auth
	 * @throws Exception
	 */
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.inMemoryAuthentication()
			.withUser("user").password("{noop}user").roles("USER")
			.and()
			.withUser("spadmin").password("{noop}admin").roles("ADMIN");
	}

	/* (non-Javadoc)
	 * @see org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.web.builders.HttpSecurity)
	 */
	@Override
	protected void configure(final HttpSecurity http) throws Exception
	{
		http.authorizeRequests()
		.antMatchers("/login*").permitAll()
			.anyRequest().authenticated()

		.and()
		.formLogin()
//			.permitAll()
			.loginProcessingUrl("/")
			.successHandler(new ProfilesAuthenticationSuccessHandler())

//		.and()
//		.logout()
  //          .permitAll()
			;
    }

}
