package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import base.BaseTest;
import pages.HomePage;
import pages.ToDoPage;

public class ToDosTest extends BaseTest {
	// HomePage homePage;
	// ToDoPage toDoPage;
	// String[] todos;

	// @BeforeEach
	// public void initialization() {
	// homePage = new HomePage(driver);
	// toDoPage = new ToDoPage(driver);
	// todos = properties.getProperty("todos").split(",");
	// }

	// @DisplayName("Add and remove todos test")
	// @ParameterizedTest
	// @ValueSource(strings = { "Backbone.js",
	// "AngularJS",
	// "Dojo",
	// "React" })
	// public void userCanAddAndRemoveToDoSuccessfully(String platform) {
	// homePage.openHomePage();
	// homePage.choosePlatform(platform);
	// for (String todo : todos)
	// toDoPage.addToDo(todo);
	// toDoPage.removeToDo(1);

	// assertEquals(2, toDoPage.itemsLeft());

	// // assertItemsLeft(2, toDoPage.getItemsLeftSpan());
	// }

	@Test
	public void hello() {
		System.out.println("Hello, world!");
	}

	// private void assertItemsLeft(int expectedLeft, WebElement element) {
	// String expectedTest = (expectedLeft == 1 ) ? String.format("$d item left",
	// expectedLeft) : String.format("$d items left", expectedLeft) ;
	// validateInnerText(element,expectedTest);
	// }
	//
	// private void validateInnerText(WebElement element, String expectedTest) {
	// ExpectedConditions.textToBePresentInElement(element, expectedTest);
	// }

}
