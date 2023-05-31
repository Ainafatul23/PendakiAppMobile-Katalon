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

Mobile.startExistingApplication('com.wahidari.pendaki')

Mobile.tap(findTestObject('Side Bar/Side Bar'), 0)

Mobile.verifyElementExist(findTestObject('Side Bar/Informasi Gunung'), 0)

Mobile.tap(findTestObject('Side Bar/Informasi Gunung'), 0)

Mobile.verifyElementExist(findTestObject('Informasi Gunung/Pendaki - Text View'), 0)

Mobile.verifyElementExist(findTestObject('Informasi Gunung/JATIM/JATIM - Navbar'), 0)

Mobile.tap(findTestObject('Informasi Gunung/JATIM/JATIM - Navbar'), 0)

Mobile.verifyElementExist(findTestObject('Informasi Gunung/JATIM/JATIM - Gunung Bromo'), 0)

gunungBromo = Mobile.getText(findTestObject('Informasi Gunung/JATIM/JATIM - Gunung Bromo'), 0)

Mobile.tap(findTestObject('Informasi Gunung/JATIM/JATIM - Gunung Bromo'), 0)

Mobile.verifyElementText(findTestObject('Informasi Gunung/JATIM/Detail - Gunung Bromo Title'), gunungBromo)

Mobile.verifyElementExist(findTestObject('Informasi Gunung/JATIM/Detail - Gunung Bromo Deskripsi'), 0)

Mobile.scrollToText('Jalur Pendakian', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Informasi Gunung/JATIM/Jalur Pendakian - Gunung Bromo'), 0)

Mobile.verifyElementExist(findTestObject('Informasi Gunung/JATIM/Jalur Pendakian - Jalur Gunung Bromo'), 0)

Mobile.verifyElementExist(findTestObject('Informasi Gunung/JATIM/Informasi - Gunung Bromo'), 0)

Mobile.verifyElementExist(findTestObject('Informasi Gunung/JATIM/Informasi - Gunung Bromo Bio'), 0)

Mobile.tap(findTestObject('Informasi Gunung/JABAR/Back Dashboard - Button'), 0)

Mobile.verifyElementExist(findTestObject('Informasi Gunung/Pendaki - Text View'), 0)

