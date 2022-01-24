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

Mobile.tap(findTestObject('Object Repository/Latihan Soal/android.view.ViewGroup - Ubah'), 0)

Mobile.tap(findTestObject('Object Repository/Latihan Soal/android.widget.TextView - Kelas 1'), 0)

Mobile.tap(findTestObject('Object Repository/Latihan Soal/android.widget.TextView - Simpan'), 0)

Mobile.tap(findTestObject('Latihan Soal/android.view.ViewGroup -MTK'), 0)

Mobile.tap(findTestObject('Object Repository/Latihan Soal/android.widget.TextView - Latihan Soal 1'), 0)

Mobile.tap(findTestObject('Latihan Soal/android.widget.TextView - Buka Test'), 0)

Mobile.tap(findTestObject('Latihan Soal/android.widget.TextView - Mulai Test'), 0)

Mobile.tap(findTestObject('Object Repository/Latihan Soal/android.widget.Button - Mulai'), 0)

Mobile.tap(findTestObject('Object Repository/Latihan Soal/android.widget.TextView - 10'), 30)

Mobile.tap(findTestObject('Object Repository/Latihan Soal/android.widget.Button - Finish'), 30)

Mobile.tap(findTestObject('Object Repository/Latihan Soal/android.widget.TextView - Simpan Setelah Menjawab'), 0)

Mobile.tap(findTestObject('Object Repository/Latihan Soal/android.widget.TextView - Simpan Jawaban'), 0)

Mobile.tap(findTestObject('Object Repository/Latihan Soal/android.widget.TextView - Selesai Review'), 0)

Mobile.tap(findTestObject('Object Repository/Latihan Soal/android.widget.TextView - Back LMS'), 0)

Mobile.tap(findTestObject('Object Repository/Latihan Soal/android.view.ViewGroup -  Back Pijar'), 0)

Mobile.closeApplication()

