package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage() {

	}

	public LoginPage enterUsername(String username) {

		WebElement user = locateElement("id", "username");
		clearAndType(user, username);
		return this;

	}

	public LoginPage enterPassword(String password) {

		WebElement pwd = locateElement("id", "password");
		clearAndType(pwd, password);
		return this;

	}

	public HomePage clickLogin() {

		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);
		return new HomePage();

	}

}
