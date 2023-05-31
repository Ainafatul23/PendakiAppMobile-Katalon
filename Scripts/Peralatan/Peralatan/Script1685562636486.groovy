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

Mobile.verifyElementExist(findTestObject('Side Bar/Peralatan'), 0)

Mobile.tap(findTestObject('Side Bar/Peralatan'), 0)

Mobile.verifyElementExist(findTestObject('Peralatan/Peralatan'), 0)

Mobile.verifyElementExist(findTestObject('Peralatan/Alat/PERALATAN - Navbar'), 0)

Mobile.tap(findTestObject('Peralatan/Alat/PERALATAN - Navbar'), 0)

tenda = Mobile.getText(findTestObject('Peralatan/Alat/Peralatan - Tenda'), 0)

Mobile.verifyElementText(findTestObject('Peralatan/Alat/Peralatan - Tenda'), tenda)

Mobile.tap(findTestObject('Peralatan/Alat/Peralatan - Tenda'), 0)

Mobile.verifyElementExist(findTestObject('Peralatan/Alat/Peralatan - Tenda Title'), 0)

tendaDetails = Mobile.getText(findTestObject('Peralatan/Alat/Peralatan - Tenda - Details'), 0)

Mobile.verifyElementText(findTestObject('Peralatan/Alat/Peralatan - Tenda - Details'), tendaDetails)

Mobile.tap(findTestObject('Peralatan/Alat/Back to Peralatan'), 0)

Mobile.verifyElementExist(findTestObject('Peralatan/Peralatan'), 0)

