package com.legatohealth;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.legatohealth.controller.UserRestController;
import com.legatohealth.service.UserService;

@WebMvcTest(value = UserRestController.class)
class SpringBootAppApplicationTests {

	@Autowired
	private MockMvc mvc;

	@MockBean
	private UserService service;

	@Test
	public void testForOkStatus() throws Exception {
		//mvc.perform(get("/api/user")).andExcept(status.OK);
	}

}
