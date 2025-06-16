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

WebUI.callTestCase(findTestCase('General/Go to URL'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Practice Form/Input Text', [('id') : 'firstName']), 'Brando')

WebUI.setText(findTestObject('Object Practice Form/Input Text', [('id') : 'lastName']), 'Roblox')

WebUI.setText(findTestObject('Object Practice Form/Input Text', [('id') : 'userEmail']), 'brando@roblox.com')

'Select Male'
WebUI.click(findTestObject('Object Practice Form/Gender Options', [('genderOption') : 'Male']))

WebUI.setText(findTestObject('Object Practice Form/Input Text', [('id') : 'userNumber']), 'Adik adiks')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Practice Form/Input Text', [('id') : 'currentAddress']), 0)

WebUI.click(findTestObject('Object Practice Form/Button/Button Submit'))

WebUI.verifyElementAttributeValue(findTestObject('Object Practice Form/Form'), 'class', 'was-validated', 0)

WebUI.scrollToElement(findTestObject('Object Practice Form/Title Page and Modal/Title Form'), 0)

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.closeBrowser()

