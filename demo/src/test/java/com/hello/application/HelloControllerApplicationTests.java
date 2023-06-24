package com.hello.application;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@RunWith(SpringRunner.class)
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
				.andExpect(MockMvcResultMatchers.content().string("15")); // Incorrect expected result
	}
	@Test
	public void testsuiteNumbers() throws Exception {
		String requestBody = "{\"number1\": 5, \"number2\": 10}";

		mockMvc.perform(MockMvcRequestBuilders.post("/subtract")
						.contentType(MediaType.APPLICATION_JSON)
						.content(requestBody))
				.andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("-5")); // Incorrect expected result
	}
	@Test
	public void testtwomulNumbers() throws Exception {
		String requestBody = "{\"number1\": 5, \"number2\": 10}";

		mockMvc.perform(MockMvcRequestBuilders.post("/multiply")
						.contentType(MediaType.APPLICATION_JSON)
						.content(requestBody))
				.andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("50")); // Incorrect expected result
	}
	@Test
	public void testtwodivNumbers() throws Exception {
		String requestBody = "{\"number1\": 5, \"number2\": 10}";

		mockMvc.perform(MockMvcRequestBuilders.post("/divide")
						.contentType(MediaType.APPLICATION_JSON)
						.content(requestBody))
				.andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("0.5")); // Correct expected result
	}
	@Test
	public void testDivideByZero() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/divide")
						.param("number1", "10")
						.param("number2", "0"))
				.andExpect(MockMvcResultMatchers.status().isBadRequest())
				.andExpect(MockMvcResultMatchers.content().string("Error: Division by zero is not allowed."));
	}


}
