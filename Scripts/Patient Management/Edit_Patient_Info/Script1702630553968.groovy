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

WebUI.setText(findTestObject('Page_Demo Hospital/input_form-control input-sm'), 'xyz')

WebUI.click(findTestObject('Object Repository/Page_Demo Hospital/i_fa fa-edit'))

WebUI.navigateToUrl('https://hospitalb.com/outdoor/edit-patient/2#step-1')

WebUI.setText(findTestObject('Object Repository/Page_Demo Hospital/input_mobile_no'), '1234567890')

WebUI.click(findTestObject('Object Repository/Page_Demo Hospital/button_Finish'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Hospital/input_form-control input-sm'), 'xyz')

WebUI.rightClick(findTestObject('Object Repository/Page_Demo Hospital/td_1234567890'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Demo Hospital/td_1234567890'), '1234567890')

WebUI.closeBrowser()

