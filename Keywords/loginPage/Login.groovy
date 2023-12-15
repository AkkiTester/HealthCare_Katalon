package loginPage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows


public class Login {
    
    @Keyword
    public static void performLogin(String username, String password) {
        // Open browser
        WebUI.openBrowser('')
        
        // Navigate to the login page URL
        WebUI.navigateToUrl('https://hospitalb.com/login')
        
        // Enter credentials
        WebUI.setText(findTestObject('Object Repository/Page_Demo Hospital/input_email'), username)
        WebUI.setText(findTestObject('Object Repository/Page_Demo Hospital/input_password'), password)
        
        // Click login button (Assuming a Test Object for the login button exists)
        WebUI.click(findTestObject('Object Repository/Page_Demo Hospital/input_custom-btn'))
    }
}
