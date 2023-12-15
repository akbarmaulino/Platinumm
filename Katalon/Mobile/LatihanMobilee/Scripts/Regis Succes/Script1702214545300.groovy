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
import java.util.Random as Random
import java.util.Collections as Collections

def randomEmail = generateRandomEmail()

def randomName = generateRandomName()

Mobile.startApplication('D:\\Binar Academy\\Pembelajaran\\Pembelajran Chapter Platinum\\Katalon\\Mobile\\secondhand-24082023.apk', 
    true)

Mobile.tap(findTestObject('HomePage Mobile/Icon_Profile'), 0)

Mobile.tap(findTestObject('Daftar Page/Button_Masuk'), 0)

Mobile.tap(findTestObject('Daftar Page/Text_Daftar'), 0)

Mobile.setText(findTestObject('Daftar Page/Input_Nama'), randomName, 0)

Mobile.setText(findTestObject('Daftar Page/Input_Email'), randomEmail, 0)

Mobile.setText(findTestObject('Daftar Page/Input_Password'), '123456', 0)

Mobile.tap(findTestObject('Daftar Page/Icon_View_Password'), 0)

Mobile.setText(findTestObject('Daftar Page/Input_Nomor_HP'), '123456789101123', 0)

Mobile.setText(findTestObject('Daftar Page/Input_Kota'), 'Jakarta', 0)

Mobile.setText(findTestObject('Daftar Page/Input_Alamat'), 'Jakarta Selatan', 0)

Mobile.tap(findTestObject('Daftar Page/Input_Daftar'), 0)

def getRandomName() {
    def names = ['john', 'alice', 'bob', 'emma', 'david']

    Collections.shuffle(names)

    return names.first()
}

def getRandomString(int length) {
    def characters = (('abcdefghijklmnopqrstuvwxyz0123456789') as char[]).toList()

    Collections.shuffle(characters)

    return (1..length).collect({ 
            characters[(it % characters.size())]
        }).join()
}

def generateRandomEmail() {
    def randomName = getRandomName()

    def randomChars = getRandomString(7)

    def domain = 'example.com'

    return "$randomName$randomChars@$domain"
}

def generateRandomName() {
    def randomName = getRandomName()

    def randomChars = getRandomString(7)

    return "$randomName$randomChars"
}

