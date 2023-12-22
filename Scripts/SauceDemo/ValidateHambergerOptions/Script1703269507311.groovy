import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword



WebUI.callTestCase(findTestCase('LoginTest'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HomePageObjects/hamburgerBTN'))

 hamburgerList = WebUI.findWebElements(findTestObject('Object Repository/HomePageObjects/hamburgerListOptions'),5)

for(var in hamburgerList)
{
	print(var.getText())
}


