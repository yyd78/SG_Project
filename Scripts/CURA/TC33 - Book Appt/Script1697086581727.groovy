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

WebUI.callTestCase(findTestCase('CURA/TC32-Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Page_CURA Healthcare Service/select_Healthcare Center'), '2', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('Page_CURA Healthcare Service/Hospital readmission'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/input_None_programs'))

WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Visit Date'), '26/10/2023')

WebUI.setText(findTestObject('Page_CURA Healthcare Service/Comment'), 'Testing Appointment')

WebUI.submit(findTestObject('Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.takeScreenshot('C:\\desktop\\booking_confirm1.jpg')

WebUI.callTestCase(findTestCase('CURA/TC34 - Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

