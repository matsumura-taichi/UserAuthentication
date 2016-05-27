package jp.co.nichiwa_system;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserAuthenticationTest {

	@Test
	public void testIsCertified() {
		assertFalse(new UserAuthentication().isCertified("YAMADA", "YYY"));
	}
}
