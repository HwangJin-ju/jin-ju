package com.yedam.myserver;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptTest {
	@Test
	public void test() {
		// Create an encoder with strength 16
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(4);
		String result = encoder.encode("1111");
		System.out.println(result);
		assertTrue(encoder.matches("1234", result));
								// (로그인페이지에서 입력한 값, db에 있는값)						
	}
}
