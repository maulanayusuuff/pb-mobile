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

Mobile.startApplication('D:\\Users\\Maulana Yusuf\\kuliah\\MAGANG\\app.apk', true)

Mobile.tap(findTestObject('Object Repository/Sign Up/android.view.ViewGroup - Next 1'), 0)

Mobile.tap(findTestObject('Object Repository/Sign Up/android.view.ViewGroup - Next 2'), 0)

Mobile.tap(findTestObject('Object Repository/Sign Up/android.view.ViewGroup -  Daftar'), 0)

Mobile.tap(findTestObject('Login/android.widget.EditText - examplemail.com'), 30)

Mobile.delay(45, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Sign Up/android.view.ViewGroup - Lanjutkan'), 30)

Mobile.tap(findTestObject('Object Repository/Sign Up/android.widget.TextView - OTP'), 30)

Mobile.delay(45, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Sign Up/android.widget.EditText - Nama Lengkap'), 'Maulana', 0)

Mobile.setText(findTestObject('Object Repository/Sign Up/android.widget.EditText -  Nomor Telepon'), '81908048888', 0)

Mobile.setText(findTestObject('Object Repository/Sign Up/android.widget.EditText - Password'), 'yusuf123', 0)

Mobile.tap(findTestObject('Object Repository/Sign Up/android.view.ViewGroup - Lanjutkan (Isi Profil)'), 0)

Mobile.tap(findTestObject('Sign Up/android.view.ViewGroup - Kelas 1'), 0)

Mobile.tap(findTestObject('Sign Up/android.view.ViewGroup - Lanjutkan (Isi Pendidikan)'), 0)

