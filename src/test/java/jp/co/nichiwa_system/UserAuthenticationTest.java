package jp.co.nichiwa_system;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserAuthenticationTest {

	@Test
	public void testAuth() {

		class UserDAOMock implements UserDAO {

			@Override
			public String getPassword(String userName) {
				if (userName.equals("YAMADA")) {
					return "YYY";
				}
				fail("想定外の引数が渡されています");
				return "";
			}
		}

		UserAuthentication auth = new UserAuthentication(new UserDAOMock());

		assertFalse(auth.isCertified("YAMADA", "AAA"));

		assertTrue(auth.isCertified("YAMADA", "YYY"));
	}

}
