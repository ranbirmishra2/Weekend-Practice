package com.hello.application;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class HelloControllerApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testHelloEndpoint() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
				.andExpect(status().isOk())
				.andExpect(content().string("My Mock Test just Passed with this Spring Boot Application!!"));
	}
//	@Test
//	public void testAddNumbers() throws Exception {
//		String requestBody = "{\"number1\": 5, \"number2\": 10}";
//
//		mockMvc.perform(MockMvcRequestBuilders.post("/add")
//						.contentType(MediaType.APPLICATION_JSON)
//						.content(requestBody))
//				.andExpect(status().isOk())
//				.andExpect(MockMvcResultMatchers.content().string("15"));
//	}g
	@Test
	public void testtwoNumbers() throws Exception {
		String requestBody = "{\"number1\": 5, \"number2\": 10}";

		mockMvc.perform(MockMvcRequestBuilders.post("/add")
						.contentType(MediaType.APPLICATION_JSON)
						.content(requestBody))
				.andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("20")); // Incorrect expected result
	}


}
