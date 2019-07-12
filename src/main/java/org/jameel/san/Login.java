package org.jameel.san;

public class Login {

public Login(String userName, String password) {
this.custUserName = userName;
this.custPassword = password;

this.assoUserName = userName;
this.assoPassword = password;
}

@Page(value = "//*[@id=\"auth_name1\"]")
public String custUserName;

@Page(value = "//*[@id=\"auth_pass1\"]")
public String custPassword;

@Page(value = "//*[@id=\\\"login_frm1\\\"]/div[3]/button", type = DOMType.BUTTON)
private String custLogin;

@Page(value = "//*[@id=\"auth_name\"]")
public String assoUserName;

@Page(value = "//*[@id=\"auth_pass\"]")
public String assoPassword;

@Page(value = "//*[@id=\\\"login_frm\\\"]/div[3]/button", type = DOMType.BUTTON)
private String assoLogin;
}