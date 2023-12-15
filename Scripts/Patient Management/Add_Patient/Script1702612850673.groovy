import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'loginPage.Login.performLogin'(GlobalVariable.ID, GlobalVariable.Pass)

WebUI.click(findTestObject('Object Repository/Page_Demo Hospital/i_fa fa-user'))

WebUI.click(findTestObject('Object Repository/Page_Demo Hospital/a_Add Patient'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Hospital/input_full_name'), 'Test12')

WebUI.setText(findTestObject('Object Repository/Page_Demo Hospital/input_user_name'), 'TestUser')

WebUI.setText(findTestObject('Object Repository/Page_Demo Hospital/input_mobile_no'), '1111111111')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Demo Hospital/select_Please Select GenderMaleFemaleOther'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Demo Hospital/select_Please Select GenderMaleFemaleOther'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Demo Hospital/input_dob'))

WebUI.click(findTestObject('Object Repository/Page_Demo Hospital/td_1'))

WebUI.click(findTestObject('Object Repository/Page_Demo Hospital/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Demo Hospital/select_Please Select Patient Blood GroupABA_6d419e'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Demo Hospital/select_Please Select Patient Blood GroupABA_6d419e'), 
    '1', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Demo Hospital/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Hospital/input_email_1'), 'testuser@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Demo Hospital/input_password_1'), 'Test@123')

WebUI.setText(findTestObject('Object Repository/Page_Demo Hospital/input_confirm_password'), 'Test@123')

WebUI.click(findTestObject('Object Repository/Page_Demo Hospital/button_Finish'))

WebUI.setText(findTestObject('Page_Demo Hospital/input_form-control input-sm'), 'Test12')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Demo Hospital/td_Test12'), 'Test12')

WebUI.closeBrowser()

