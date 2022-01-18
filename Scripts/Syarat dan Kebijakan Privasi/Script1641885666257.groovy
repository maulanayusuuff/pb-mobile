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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Special Section 2/android.view.ViewGroup - Profil'), 0)

Mobile.tap(findTestObject('Object Repository/Special Section 2/android.widget.TextView - Syarat dan Ketentuan'), 0)

Mobile.tap(findTestObject('Object Repository/Special Section 2/android.widget.TextView - Nama Pengguna'), 0)

Mobile.tap(findTestObject('Special Section 2/android.widget.TextView - Nama Pengguna'), 0)

Mobile.tap(findTestObject('Object Repository/Special Section 2/android.widget.TextView - Informasi Pribadi'), 0)

Mobile.tap(findTestObject('Special Section 2/android.widget.TextView - Informasi Pribadi'), 0)

Mobile.tap(findTestObject('Object Repository/Special Section 2/android.widget.TextView - Penggunaan dan Pernyataan Kepada Pihak KeTiga'), 
    0)

Mobile.tap(findTestObject('Special Section 2/android.widget.TextView - Penggunaan dan Pernyataan Kepada Pihak KeTiga'), 
    0)

Mobile.tap(findTestObject('Object Repository/Special Section 2/android.widget.TextView - Layanan Penggunaan Pijar Belajar'), 
    0)

Mobile.tap(findTestObject('Special Section 2/android.widget.TextView - Layanan Penggunaan Pijar Belajar'), 0)

Mobile.tap(findTestObject('Object Repository/Special Section 2/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Special Section 2/android.widget.TextView - Kebijakan Privasi'), 0)

Mobile.tap(findTestObject('Object Repository/Special Section 2/android.widget.TextView - Rahasia Pribadi'), 0)

Mobile.tap(findTestObject('Special Section 2/android.widget.TextView - Rahasia Pribadi'), 0)

Mobile.tap(findTestObject('Object Repository/Special Section 2/android.widget.TextView - Pengumpulan dan Penggunaan Informasi'), 
    0)

Mobile.tap(findTestObject('Special Section 2/android.widget.TextView - Pengumpulan dan Penggunaan Informasi'), 0)

Mobile.tap(findTestObject('Special Section 2/android.view.ViewGroup'), 0)

