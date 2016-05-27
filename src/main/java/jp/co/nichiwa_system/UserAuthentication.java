package jp.co.nichiwa_system;

public class UserAuthentication {

	UserDAO dao = this.createDAO();

	protected UserDAO createDAO() {
		return new UserDAOImpl();
	}

	public boolean isCertified(String name, String password) {

		return false;
	}

}
