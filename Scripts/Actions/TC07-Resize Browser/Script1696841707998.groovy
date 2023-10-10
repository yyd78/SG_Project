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

WebUI.navigateToUrl('https://mindmajix.com/')

WebUI.setViewPortSize(450, 550)

Pg_Ht = WebUI.getPageHeight()

Pg_Wd = WebUI.getPageWidth()

System.out.println('Height:' + Pg_Ht)

System.out.println('Width:' + Pg_Wd)

WebUI.setViewPortSize(800, 900)

WebUI.setViewPortSize(300, 200)

WebUI.setViewPortSize(600, 250)

Pg_Ht = WebUI.getPageHeight()

Pg_Wd = WebUI.getPageWidth()

System.out.println('Height:' + Pg_Ht)

System.out.println('Width:' + Pg_Wd)

WebUI.maximizeWindow()

vp_h = WebUI.getViewportHeight()

vp_w = WebUI.getViewportWidth()

System.out.println('Height:' + vp_h)

System.out.println('Width:' + vp_w)

WebUI.closeBrowser()

