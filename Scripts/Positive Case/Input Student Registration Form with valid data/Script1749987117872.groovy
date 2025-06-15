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

WebUI.setText(findTestObject('Object Practice Form/Input Text', [('id') : 'firstName']), 'Windah')

WebUI.setText(findTestObject('Object Practice Form/Input Text', [('id') : 'lastName']), 'Anomali')

WebUI.setText(findTestObject('Object Practice Form/Input Text', [('id') : 'userEmail']), 'windah@anomali.com')

'Select Male'
WebUI.click(findTestObject('Object Practice Form/Gender Options', [('genderOption') : 'Male']))

WebUI.setText(findTestObject('Object Practice Form/Input Text', [('id') : 'userNumber']), '1234567890')

WebUI.click(findTestObject('Object Practice Form/Input Text', [('id') : 'dateOfBirthInput']))

WebUI.waitForElementVisible(findTestObject('Object Practice Form/Date of Birth/Date Picker', [('verifyPresent') : 'react-datepicker__month-container']), 
    0)

WebUI.waitForElementVisible(findTestObject('Object Practice Form/Date of Birth/Date Picker', [('verifyPresent') : 'react-datepicker__year-dropdown-container react-datepicker__year-dropdown-container--select']), 
    0)

WebUI.click(findTestObject('Object Practice Form/Date of Birth/Select Year'))

WebUI.click(findTestObject('Object Practice Form/Date of Birth/Option Year', [('year') : '2000']))

WebUI.waitForElementVisible(findTestObject('Object Practice Form/Date of Birth/Date Picker', [('verifyPresent') : 'react-datepicker__month-select']), 
    0)

WebUI.click(findTestObject('Object Practice Form/Date of Birth/Select Month'))

WebUI.click(findTestObject('Object Practice Form/Date of Birth/Option Month', [('month') : 'January']))

WebUI.click(findTestObject('Object Practice Form/Date of Birth/Option Date', [('date') : '1']))

WebUI.click(findTestObject('Object Practice Form/Input Text', [('id') : 'subjectsContainer']), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Practice Form/Input Text', [('id') : 'subjectsInput']), 'Math')

'Select Subjects'
WebUI.sendKeys(findTestObject('Object Practice Form/Input Text', [('id') : 'subjectsInput']), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Practice Form/Input Text', [('id') : 'subjectsInput']), 'Arts')

'Select Subjects'
WebUI.sendKeys(findTestObject('Object Practice Form/Input Text', [('id') : 'subjectsInput']), Keys.chord(Keys.ENTER))

'Select Sports'
WebUI.click(findTestObject('Object Practice Form/Hobbies Options', [('hobbiesOption') : 'Sports']))

'Select Reading'
WebUI.click(findTestObject('Object Practice Form/Hobbies Options', [('hobbiesOption') : 'Reading']))

WebUI.uploadFile(findTestObject('Object Practice Form/Input Text', [('id') : 'uploadPicture']), 'C:\\Users\\ASUS\\Downloads\\th.jpg')

WebUI.scrollToElement(findTestObject('Object Practice Form/Input Text', [('id') : 'currentAddress']), 0)

WebUI.setText(findTestObject('Object Practice Form/Input Text', [('id') : 'currentAddress']), 'Jalan Suka Suka Ya Ya Ya')

WebUI.click(findTestObject('Object Practice Form/Input Text', [('id') : 'state']))

WebUI.click(findTestObject('Object Practice Form/Dropdown State and City/State_NCR'))

WebUI.click(findTestObject('Object Practice Form/Input Text', [('id') : 'city']))

WebUI.click(findTestObject('Object Practice Form/Dropdown State and City/City_Noida'))

WebUI.click(findTestObject('Object Practice Form/Button/Button Submit'))

WebUI.verifyElementVisible(findTestObject('Object Practice Form/Title Page and Modal/Title After Submit'))

WebUI.enhancedClick(findTestObject('Object Practice Form/Button/Button Close'))

