package Sys;

import java.util.HashMap;

public class IDandPw {

	HashMap<String, String> logininfo = new HashMap<String, String>();

	IDandPw() {
		logininfo.put("abc", "111");
		logininfo.put("c00246492", "123");
		logininfo.put("happy", "999");
	}

	protected HashMap getLoginInfo() {
		return logininfo;
	}
}
