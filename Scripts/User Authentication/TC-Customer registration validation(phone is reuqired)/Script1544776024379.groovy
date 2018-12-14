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

WebUI.setText(findTestObject('Create New Customer Account Page/input_firstname'), findTestData('Masoko data/TD -Masoko registration').getValue(
        1, 1))

WebUI.setText(findTestObject('Create New Customer Account Page/input_lastname'), findTestData('Masoko data/TD -Masoko registration').getValue(
        2, 1))

WebUI.setText(findTestObject('Create New Customer Account Page/input_mobile'), '')

WebUI.setText(findTestObject('Create New Customer Account Page/input_email'), findTestData('Masoko data/TD -Masoko registration').getValue(
        4, 1))

WebUI.setText(findTestObject('Create New Customer Account Page/input_password'), findTestData('Masoko data/TD -Masoko registration').getValue(
        5, 1))

WebUI.setText(findTestObject('Create New Customer Account Page/input_password_confirmation'), findTestData('Masoko data/TD -Masoko registration').getValue(
        6, 1))

WebUI.click(findTestObject('Create New Customer Account Page/button_Create an Account'))

WebUI.verifyElementPresent(findTestObject('Create New Customer Account Page/empty_phone_field error'), 2)

WebUI.closeBrowser()

