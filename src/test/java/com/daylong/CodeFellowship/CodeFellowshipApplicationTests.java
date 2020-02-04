package com.daylong.CodeFellowship;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class CodeFellowshipApplicationTests {

	@Autowired
	private MockMvc mockMvc;

//	@Autowired
//	private ApplicationUserController applicationUserController;

	@Test
	void contextLoads() {
//		assert that
	}

//	@Test
//	public void homePageMVCTest() throws Exception{
//		this.mockMvc.perform(get("/"))
//				.andDo(print())
//				.andExpect(status().isOk())
//				.andExpect(content().string(containsString("<h2>Make users here</h2>")))
//				.andExpect(content().string(containsString("<h2>Make users here</h2>")))
//				.andExpect(content().string(containsString("<h2>Make users here</h2>")));

//	}

}
