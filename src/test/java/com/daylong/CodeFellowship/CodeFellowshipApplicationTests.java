package com.daylong.CodeFellowship;


import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;


@SpringBootTest
@AutoConfigureMockMvc
class CodeFellowshipApplicationTests {

//	@Autowired
//	private MockMvc mockMvc;

//	@Autowired
//	private ApplicationUserController applicationUserController;

////	@Test
////	public void homePageMVCTest() throws Exception{
////		this.mockMvc.perform(get("/"))
////				.andDo(print())
////				.andExpect(status().isOk())
////				.andExpect(content().string(containsString("<h2>Make users here</h2>")))
////				.andExpect(content().string(containsString("<h2>Make users here</h2>")))
////				.andExpect(content().string(containsString("<h2>Make users here</h2>")));
////	}
}
