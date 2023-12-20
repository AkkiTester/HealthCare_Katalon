
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import org.openqa.selenium.WebDriver

import org.openqa.selenium.By

import java.util.List

import java.lang.String



def static "listPrint.verifyNavMenu"(
    	WebDriver driver	
     , 	By object	
     , 	java.util.List<String> expectedMenuName	) {
    (new listPrint()).verifyNavMenu(
        	driver
         , 	object
         , 	expectedMenuName)
}


def static "loginPage.Login.performLogin"(
    	String username	
     , 	String password	) {
    (new loginPage.Login()).performLogin(
        	username
         , 	password)
}
