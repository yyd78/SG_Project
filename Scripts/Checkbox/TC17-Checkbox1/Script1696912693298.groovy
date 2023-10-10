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

WebUI.check(findTestObject('Checkbox/box1'))

WebUI.check(findTestObject('Checkbox/box2'))

WebUI.check(findTestObject('Checkbox/box3'))

WebUI.delay(3)

WebUI.verifyElementChecked(findTestObject('Checkbox/box1'), 5)

WebUI.verifyElementChecked(findTestObject('Checkbox/box2'), 5)

WebUI.verifyElementChecked(findTestObject('Checkbox/box3'), 5)

WebUI.uncheck(findTestObject('Checkbox/box1'))

WebUI.uncheck(findTestObject('Checkbox/box2'))

WebUI.uncheck(findTestObject('Checkbox/box3'))

WebUI.verifyElementNotChecked(findTestObject('Checkbox/box1'), 5)

WebUI.verifyElementNotChecked(findTestObject('Checkbox/box2'), 5)

WebUI.verifyElementNotChecked(findTestObject('Checkbox/box3'), 5)

WebUI.closeBrowser()

