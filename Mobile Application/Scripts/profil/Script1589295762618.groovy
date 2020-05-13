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

WebUI.delay(5)

Mobile.tap(findTestObject('android.widget.TextView0'), 0)

WebUI.delay(3)

Mobile.setText(findTestObject('android.widget.EditText0 - Ketik email atau username (1)'), 'harytestingapp2@gmail.com', 
    0)

Mobile.setEncryptedText(findTestObject('android.widget.EditText0 - Minimum 6 karakter (2)'), 'nYikaMf9+4whhbLlOm+dHQ==', 
    0)

Mobile.tap(findTestObject('android.widget.Button0 - Lanjutkan (2)'), 0)

Mobile.tap(findTestObject('android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - OKE'), 0)

Mobile.tap(findTestObject('android.widget.RadioButton0 - Laki-laki'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - Lanjutkan (3)'), 0)

Mobile.tap(findTestObject('android.widget.FrameLayout0 (2)'), 0)

Mobile.tap(findTestObject('android.widget.ImageView0 (2)'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 - Type something'), '180', 0)

Mobile.setText(findTestObject('android.widget.EditText0 - Type something (1)'), '80', 0)

Mobile.scrollToText('simpan')

Mobile.setText(findTestObject('android.widget.EditText0 - Type something (2)'), '089622908656', 0)

Mobile.setText(findTestObject('android.widget.EditText0 - Type something (3)'), 'jalan murai 2 no 64 RT 006 RW 02 serua indah ciputat', 
    0)

Mobile.tap(findTestObject('android.view.ViewGroup0'), 0)

Mobile.closeApplication()

