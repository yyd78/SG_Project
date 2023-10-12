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

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/profile.php#login')

WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Username'), UserName)

WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Password'), Password)

WebUI.click(findTestObject('Page_CURA Healthcare Service/Login_Btn'))

WebUI.selectOptionByValue(findTestObject('Page_CURA Healthcare Service/select_Healthcare Center'), HealthCenter, false)

WebUI.check(findTestObject('Page_CURA Healthcare Service/Hospital readmission'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/input_None_programs'))

WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Visit Date'), VisitDate)

WebUI.setText(findTestObject('Page_CURA Healthcare Service/Comment'), Comment)

WebUI.submit(findTestObject('Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.takeScreenshot('C:\\desktop\\booking_confirm.jpg')

WebUI.click(findTestObject('Page_CURA Healthcare Service/Menu'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/Logout'))

WebUI.delay(3)

