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

Mobile.verifyElementExist(findTestObject('Side Bar/Informasi Pendakian'), 0)

Mobile.tap(findTestObject('Side Bar/Informasi Pendakian'), 0)

Mobile.verifyElementExist(findTestObject('Informasi Pendakian/Info Pendakian'), 0)

Mobile.verifyElementExist(findTestObject('Informasi Pendakian/LUAR JAWA/LUAR JAWA'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/LUAR JAWA/LUAR JAWA'), 0)

Mobile.verifyElementExist(findTestObject('Informasi Pendakian/LUAR JAWA/LUAR JAWA - Pendakian Gunung Jaya Wijaya'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/LUAR JAWA/LUAR JAWA - Pendakian Gunung Jaya Wijaya'), 0)

Mobile.verifyElementExist(findTestObject('Informasi Pendakian/LUAR JAWA/Gunung Jaya Wijaya - Jalur Jaya Wijaya'), 0)

Mobile.verifyElementExist(findTestObject('Informasi Pendakian/LUAR JAWA/Gunung Jaya Wijaya - Jalur Jaya Wijaya - Details'), 
    0)

Mobile.tap(findTestObject('Informasi Pendakian/LUAR JAWA/Gunung Jaya Wijaya - Jalur Jaya Wijaya'), 0)

Mobile.verifyElementNotExist(findTestObject('Informasi Pendakian/LUAR JAWA/Gunung Jaya Wijaya - Jalur Jaya Wijaya - Details'), 
    0)

Mobile.tap(findTestObject('Informasi Pendakian/LUAR JAWA/Gunung Jaya Wijaya - Jalur Jaya Wijaya'), 0)

Mobile.verifyElementExist(findTestObject('Informasi Pendakian/LUAR JAWA/Gunung Jaya Wijaya - Jalur Jaya Wijaya - Details'), 
    0)

Mobile.tap(findTestObject('Informasi Pendakian/JAWA BARAT/Back Informasi Pendakian'), 0)

Mobile.verifyElementExist(findTestObject('Informasi Pendakian/Info Pendakian'), 0)

