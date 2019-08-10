package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

	public HomePage() {

	}

	public void clickLogout() {

		WebElement logout = locateElement("class", "decorativeSubmit");
		click(logout);
		

	}
}