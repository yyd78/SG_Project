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

WebUI.openBrowser(GlobalVariable.url)

WebUI.deleteAllCookies()

WebUI.maximizeWindow()

WebUI.selectOptionByValue(findTestObject('BlazeDemo/Page_BlazeDemo/Departure_City'), GlobalVariable.Departure_City, false)

WebUI.selectOptionByValue(findTestObject('BlazeDemo/Page_BlazeDemo/Destination_City'), GlobalVariable.Destination_City, 
    false)

WebUI.click(findTestObject('BlazeDemo/Page_BlazeDemo/Find Flights'))

WebUI.click(findTestObject('BlazeDemo/Page_BlazeDemo - reserve/Choose Flight'))

WebUI.setText(findTestObject('BlazeDemo/Page_BlazeDemo Purchase/Name'), 'Kelvin')

WebUI.setText(findTestObject('BlazeDemo/Page_BlazeDemo Purchase/Address'), 'Tampines')

WebUI.setText(findTestObject('BlazeDemo/Page_BlazeDemo Purchase/City'), 'Singapore')

WebUI.setText(findTestObject('BlazeDemo/Page_BlazeDemo Purchase/State'), 'NA')

WebUI.setText(findTestObject('BlazeDemo/Page_BlazeDemo Purchase/ZipCode'), '520915')

WebUI.selectOptionByIndex(findTestObject('BlazeDemo/Page_BlazeDemo Purchase/Card_Type'), 2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('BlazeDemo/Page_BlazeDemo Purchase/CreditCardNumber'), '76347826489')

WebUI.setText(findTestObject('BlazeDemo/Page_BlazeDemo Purchase/CreditCardMonth'), '12')

WebUI.setText(findTestObject('BlazeDemo/Page_BlazeDemo Purchase/CreditCardYear'), '2025')

WebUI.setText(findTestObject('BlazeDemo/Page_BlazeDemo Purchase/NameOnCard'), 'Kelvin Gan')

WebUI.click(findTestObject('BlazeDemo/Page_BlazeDemo Purchase/RememberMe'))

WebUI.verifyElementChecked(findTestObject('BlazeDemo/Page_BlazeDemo Purchase/RememberMe'), 1)

WebUI.click(findTestObject('BlazeDemo/Page_BlazeDemo Purchase/Purchase Flight'))

WebUI.verifyTextPresent('Thank you for your purchase today!', false)

WebUI.takeScreenshot('C:\\desktop\\Purchase Confirm.jpg')

WebUI.closeBrowser()

