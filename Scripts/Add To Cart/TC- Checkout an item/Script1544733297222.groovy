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

WebUI.callTestCase(findTestCase('User Authentication/TC-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Home Page/search bar'), findTestData('Masoko data/TD- Product Search').getValue(1, 1))

WebUI.click(findTestObject('Home Page/button_Search'))

WebUI.click(findTestObject('Product search page/img_product_1'))

WebUI.click(findTestObject('Product search page/button_Add to Cart'))

WebUI.delay(5)

WebUI.click(findTestObject('Product search page/span_My Cart'))

WebUI.delay(2)

WebUI.click(findTestObject('Product search page/button_Checkout'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Checkout Page/step_Delivery Address'), 1)

WebUI.verifyElementPresent(findTestObject('Checkout Page/step_Payment method'), 1)

WebUI.verifyElementPresent(findTestObject('Checkout Page/button_Place Order'), 1)

WebUI.closeBrowser()

