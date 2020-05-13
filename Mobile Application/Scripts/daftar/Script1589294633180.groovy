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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\SETO\\Katalon Studio\\Testingmobileapps\\androidapp\\APIDemos.apk', true)

Mobile.pressBack()

Mobile.tap(findTestObject('android.widget.TextView0 - SehatQ'), 0)

Mobile.tap(findTestObject('android.widget.FrameLayout0'), 0)

Mobile.tap(findTestObject('android.widget.TextView0'), 0)

Mobile.tap(findTestObject('android.widget.RelativeLayout0'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 - Type your full name'), 'hary testing app', 0)

Mobile.setText(findTestObject('android.widget.EditText0 - exampleexample.com'), 'harytestingapp1@gmail.com', 0)

Mobile.setEncryptedText(findTestObject('android.widget.EditText0 - Minimum 6 karakter'), 'nYikaMf9+4xmH+bL1dzSMA==', 0)

Mobile.tap(findTestObject('android.widget.CheckBox0'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - Lanjutkan (1)'), 0)

Mobile.closeApplication()

