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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hospitalb.com/login')

WebUI.setText(findTestObject('Object Repository/visual testing checkpoints/Page_Demo Hospital/Page_Demo Hospital/Page_Demo Hospital/Page_Demo Hospital/Page_Demo Hospital/input_email'), 
    'admin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/visual testing checkpoints/Page_Demo Hospital/Page_Demo Hospital/Page_Demo Hospital/Page_Demo Hospital/Page_Demo Hospital/input_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/visual testing checkpoints/Page_Demo Hospital/Page_Demo Hospital/Page_Demo Hospital/Page_Demo Hospital/Page_Demo Hospital/input_custom-btn'))

WebUI.click(findTestObject('Object Repository/visual testing checkpoints/Page_Demo Hospital/Page_Demo Hospital/Page_Demo Hospital/Page_Demo Hospital/Page_Demo Hospital/i_fa fa-user'))

WebUI.waitForPageLoad(4)

WebUI.takeScreenshotAsCheckpoint('Patient List')

WebUI.verifyElementText(findTestObject('Object Repository/visual testing checkpoints/Page_Demo Hospital/Page_Demo Hospital/Page_Demo Hospital/Page_Demo Hospital/Page_Demo Hospital/h1_Patient List'), 
    'Patient List')

WebUI.closeBrowser()

