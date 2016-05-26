package jp.co.nichiwa_system;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserAuthenticationTest {

	private class UserDAOMock implements UserDAO {

		public String getPassword(String userName) {
			if (userName.equals("YAMADA")) {
				return "XXX";
			}
			fail("想定外の引数が渡されています。");
			return "";
		}
	}

	private UserAuthentication auth;

	protected void setUp() {
		auth = new UserAuthentication(new UserDAOMock());
	}

	@Test
	public void testIsCertified() {
		assertTrue(auth.isCertified("YAMADA", "XXX"));
		assertFalse(auth.isCertified("YAMADA", "YYY"));
	}
}
