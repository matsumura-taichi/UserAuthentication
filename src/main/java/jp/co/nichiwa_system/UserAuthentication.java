package jp.co.nichiwa_system;

public class UserAuthentication {

	UserDAO dao;

	public UserAuthentication(UserDAO dao) {
		this.dao = dao;
	}

	public boolean isCertified(String name, String password) {

		if (dao.getPassword(name).equals(password)) {
			return true;
		} else {
			return false;
		}

	}

}
