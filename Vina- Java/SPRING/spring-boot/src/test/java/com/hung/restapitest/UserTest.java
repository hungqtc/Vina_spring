package com.hung.restapitest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasSize;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.hung.controller.UserController;
import com.hung.dto.UserDTO;
import com.hung.service.UserService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = UserController.class, secure = false)
public class UserTest {
	@Autowired
	MockMvc mvc;

	@MockBean
	UserService userService;

	@Test
	public void testFindAll() throws Exception {
		List<String> roles = new ArrayList<>();
		roles.add("ADMIN");

		UserDTO hung = new UserDTO("hung", null, roles);
		UserDTO hoa = new UserDTO("hoa", null, null);
		// convert Array -> Collection ??? for what
		List<UserDTO> listUser = Arrays.asList(hung, hoa);

		given(userService.getAll()).willReturn(listUser);

		mvc.perform(get("/user").contentType(MediaType.APPLICATION_JSON))
				.andDo(print()).andExpect(status().isOk())
				.andExpect(jsonPath("$", hasSize(2)))
				.andExpect(jsonPath("$[0,1].name", is(listUser.get(0).getName())))
				.andExpect(jsonPath("$[0].roles", is(hung.getRoles())));
	}

}
