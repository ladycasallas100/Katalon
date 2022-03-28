import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://demoqa.com/automation-practice-form')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('student_registration/firstName'), findTestData('student').getValue(1, 1))

WebUI.setText(findTestObject('student_registration/lastName'), findTestData('student').getValue(2, 1))

WebUI.setText(findTestObject('student_registration/email'), findTestData('student').getValue(3, 1))

WebUI.doubleClick(findTestObject('student_registration/gender'))

WebUI.setText(findTestObject('student_registration/mobile'), findTestData('student').getValue(4, 1))

WebUI.scrollToElement(findTestObject('student_registration/btnSubmit'), 3)

WebUI.doubleClick(findTestObject('student_registration/date'))

WebUI.click(findTestObject('student_registration/dateMounth'))

WebUI.selectOptionByIndex(findTestObject('student_registration/dateMounth'), 0)

WebUI.click(findTestObject('student_registration/dateYear'))

WebUI.selectOptionByValue(findTestObject('student_registration/dateYear'), '1996', true)

WebUI.click(findTestObject('student_registration/dateDay'))

WebUI.setText(findTestObject('student_registration/subjects'), findTestData('student').getValue(5, 1))

WebUI.sendKeys(findTestObject('student_registration/subjects'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('student_registration/subjects'), findTestData('student').getValue(6, 1))

WebUI.sendKeys(findTestObject('student_registration/subjects'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('student_registration/hobbies'))

WebUI.uploadFile(findTestObject('student_registration/btnupload'), 'C:\\Users\\ladym\\Katalon Studio\\katalon_Challenge\\Img\\foto.jpg')

WebUI.setText(findTestObject('student_registration/currentAddress'), findTestData('student').getValue(7, 1))

WebUI.setText(findTestObject('student_registration/state'), findTestData('student').getValue(8, 1))

WebUI.sendKeys(findTestObject('student_registration/state'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('student_registration/city'), findTestData('student').getValue(9, 1))

WebUI.sendKeys(findTestObject('student_registration/city'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('student_registration/btnSubmit'))

WebUI.verifyTextPresent(findTestData('student').getValue(1, 1), false)

WebUI.verifyTextPresent(findTestData('student').getValue(2, 1), false)

WebUI.verifyTextPresent(findTestData('student').getValue(3, 1), false)

WebUI.verifyTextPresent(findTestData('student').getValue(4, 1), false)

WebUI.verifyTextPresent(findTestData('student').getValue(5, 1), false)

WebUI.verifyTextPresent(findTestData('student').getValue(6, 1), false)

WebUI.verifyTextPresent(findTestData('student').getValue(7, 1), false)

WebUI.verifyTextPresent(findTestData('student').getValue(8, 1), false)

WebUI.verifyTextPresent(findTestData('student').getValue(9, 1), false)

WebUI.takeScreenshot('C:\\Users\\ladym\\Katalon Studio\\katalon_Challenge\\Img\\Screenshots\\screenshot.png')

WebUI.closeBrowser()