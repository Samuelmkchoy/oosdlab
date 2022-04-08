package Sys;

public class Main {

	public static void main(String[] args) {
		IDandPw idandPasswords = new IDandPw();

		LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());

	}

}
