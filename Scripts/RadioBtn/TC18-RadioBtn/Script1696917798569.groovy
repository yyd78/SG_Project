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

WebUI.openBrowser('https://demo.automationtesting.in/Register.html')

WebUI.deleteAllCookies()

WebUI.maximizeWindow()

WebUI.setText(findTestObject('RadioBtn/Page_Register/First Name'), 'Kelvin')

WebUI.setText(findTestObject('RadioBtn/Page_Register/Last Name'), 'Gan')

WebUI.setText(findTestObject('RadioBtn/Page_Register/Address'), 'Tampines Street')

WebUI.setText(findTestObject('RadioBtn/Page_Register/Email'), 'abc@hotmail.com')

WebUI.setText(findTestObject('RadioBtn/Page_Register/Phone'), '12345678')

WebUI.check(findTestObject('RadioBtn/Page_Register/label_Male'))

WebUI.click(findTestObject('RadioBtn/Page_Register/checkbox1'))

WebUI.selectOptionByValue(findTestObject('RadioBtn/Page_Register/Languages'), 'English', false)

WebUI.selectOptionByValue(findTestObject('RadioBtn/Page_Register/select_Select Skills'), 'C++', false)

WebUI.selectOptionByIndex(findTestObject('RadioBtn/Page_Register/select_Select Country'), '2', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('RadioBtn/Page_Register/select_year'), '1978', false)

WebUI.selectOptionByValue(findTestObject('RadioBtn/Page_Register/select_Month'), 'June', false)

WebUI.selectOptionByValue(findTestObject('RadioBtn/Page_Register/select_Day'), '6', false)

WebUI.setText(findTestObject('RadioBtn/Page_Register/FirstPass'), 'Kelvin')

WebUI.setText(findTestObject('RadioBtn/Page_Register/SecondPass'), 'Kelvin')

WebUI.uploadFile(findTestObject('RadioBtn/Page_Register/FieUploadBtn'), 'C:\\desktop\\screenshot.png')

