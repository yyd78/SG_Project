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

WebUI.openBrowser('https://demo.automationtesting.in/Frames.html')

WebUI.maximizeWindow()

WebUI.deleteAllCookies()

WebUI.switchToFrame(findTestObject('Frames/Frame'), 3)

WebUI.setText(findTestObject('Frames/Textbox1'), 'Test Frame')

WebUI.switchToDefaultContent()

WebUI.delay(3)

WebUI.click(findTestObject('Frames/2nd Tab'))

WebUI.switchToFrame(findTestObject('Frames/Frame 2'), 0)

WebUI.switchToFrame(findTestObject('Frames/Frame 3'), 0)

WebUI.setText(findTestObject('Frames/Textbox2'), 'Test Frame 2')

WebUI.closeBrowser()

