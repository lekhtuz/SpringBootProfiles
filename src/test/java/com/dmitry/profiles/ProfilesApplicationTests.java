package com.dmitry.profiles;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.hamcrest.core.StringContains.containsString;

/**
 * @author du376ye
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ProfilesApplicationTests {
	@Autowired
	private MockMvc mvc;

	/**
	 * @throws Exception
	 */
	@Test
	public void testRootHtml() throws Exception
	{
		mvc.perform(get("/index.html").accept(MediaType.TEXT_HTML))
			.andExpect(status().isOk())
			.andExpect(content().contentType(MediaType.TEXT_HTML))
			.andExpect(content().string(containsString("HELLO WORLD")));
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testRootJson() throws Exception
	{
		mvc.perform(get("/").accept(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8));
	}

}
