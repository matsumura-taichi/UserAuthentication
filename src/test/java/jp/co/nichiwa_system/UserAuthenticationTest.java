package jp.co.nichiwa_system;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserAuthenticationTest {

	@Test
	public void testAuth() {

		class UserDAOMock implements UserDAO {

			public String getPassword(String userName) {
				if (userName.equals("YAMADA")) {
					return "XXX";
				}
				fail("想定外の引数が渡されています");
				return "";
			}
		}

		UserAuthentication auth = new UserAuthentication() {
			protected UserDAO createDAO() {
				return new UserDAOMock();
			}
		};

		assertFalse(auth.isCertified("YAMADA", "AAA"));
	}

	@Test
	public void testIsCertified() {
		assertFalse(new UserAuthentication().isCertified("YAMADA", "YYY"));
	}

}
