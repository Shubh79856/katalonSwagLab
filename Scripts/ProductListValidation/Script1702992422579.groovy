import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('LoginTest'), [:], FailureHandling.STOP_ON_FAILURE)

def actualList = WebUI.findWebElements(findTestObject('Object Repository/HomePageObjects/productNamesList'), 10)

List<String> productList = new ArrayList<String>(Arrays.asList("Sauce Labs Backpack","Sauce Labs Bike Light","Sauce Labs Bolt T-Shirt","Sauce Labs Fleece Jacket","Sauce Labs Onesie","Test.allTheThings() T-Shirt (Red)"))

List<String> list= new ArrayList()

for(var in actualList) {
	list.add(var.getText())
}

print(productList)

print(list)	

WebUI.verifyEqual(productList, list)
	

