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

WebUI.callTestCase(findTestCase('CURA/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CURA/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/h2_Make Appointment'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107 (1)'), 
    'Seoul CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Apply for hospital readmission (2)'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_None_programs'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date (2)'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/td_25'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/textarea_Comment_comment (2)'), 'Seoul Center')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Book Appointment (2)'))

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/appointment.php#summary')

WebUI.rightClick(findTestObject('Object Repository/Page_CURA Healthcare Service/h2_Appointment Confirmation (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/h2_Appointment Confirmation (1)'), 
    'Appointment Confirmation')

WebUI.closeBrowser()

