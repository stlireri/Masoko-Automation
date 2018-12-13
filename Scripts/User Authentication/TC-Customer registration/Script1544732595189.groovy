import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.masoko)

WebUI.click(findTestObject('Home Page/Register'))

WebUI.setText(findTestObject('Create New Customer Account Page/input_firstname'), 'stella')

WebUI.setText(findTestObject('Create New Customer Account Page/input_lastname'), 'kiki')

WebUI.setText(findTestObject('Create New Customer Account Page/input_mobile'), '0771457007')

WebUI.setText(findTestObject('Create New Customer Account Page/input_email'), 'stellaireri@ymail.com')

WebUI.setText(findTestObject('Create New Customer Account Page/input_password'), 'Kenya@123')

WebUI.setText(findTestObject('Create New Customer Account Page/input_password_confirmation'), 'Kenya@123')

WebUI.click(findTestObject('Create New Customer Account Page/button_Create an Account'))

WebUI.closeBrowser()

