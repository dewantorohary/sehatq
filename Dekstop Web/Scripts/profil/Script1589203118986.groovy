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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.sehatq.com/login/email')

WebUI.setText(findTestObject('Page_Login/input_Email_email'), 'testinghary6@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Login/input_show password_password'), 'T4TplNhpT/B7EORzDNJMPw==')

WebUI.click(findTestObject('Page_Login/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/input__dob'))

WebUI.click(findTestObject('Object Repository/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/th_Mei 2020'))

WebUI.click(findTestObject('Object Repository/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/th_2020'))

WebUI.click(findTestObject('Object Repository/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/i_Des_fs icon-chevron-left'))

WebUI.click(findTestObject('Object Repository/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/i_Des_fs icon-chevron-left'))

WebUI.click(findTestObject('Object Repository/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/i_Des_fs icon-chevron-left'))

WebUI.click(findTestObject('Object Repository/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/span_1992'))

WebUI.click(findTestObject('Object Repository/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/span_Agt'))

WebUI.click(findTestObject('Object Repository/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/td_30'))

WebUI.click(findTestObject('Object Repository/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_SehatQ  Portal Informasi Terbaru Seput_797e81/img_Allow_sc-fjdhpX hNOWuN'))

WebUI.click(findTestObject('Object Repository/Page_SehatQ  Portal Informasi Terbaru Seput_797e81/a_Profil'))

WebUI.click(findTestObject('Object Repository/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/i_Hary Dewantoro_fs icon-chevron-circle-rig_70e6d7'))

WebUI.click(findTestObject('Object Repository/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/i_Berat (kg)_fs icon-edit font-16'))

WebUI.setText(findTestObject('Object Repository/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/input_Tinggi Badan (cm)_height'), 
    '180')

WebUI.setText(findTestObject('Object Repository/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/input_Berat Badan (kg)_weight'), 
    '80')

WebUI.setText(findTestObject('Object Repository/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/input__address'), 'Jalan Murai 2 no 64 RT 006 RW 02 Serua Indah Ciputat')

WebUI.setText(findTestObject('Object Repository/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/input__phone'), '089622908656')

WebUI.click(findTestObject('Object Repository/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/button_Simpan'))

