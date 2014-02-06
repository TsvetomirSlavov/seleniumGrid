package com.test.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * \ The Advanced User Interactions API is a new, more comprehensive API for
 * describing actions a user can perform on a web page. This includes actions
 * such as drag and drop or clicking multiple elements while holding down the
 * Control key.
 * 
 * Getting started (short how-to) In order to generate a sequence of actions,
 * use the Actions generator to build it. First, configure it:
 * 
 * Actions builder = new Actions(driver);
 * 
 * builder.keyDown(Keys.CONTROL) .click(someElement) .click(someOtherElement)
 * .keyUp(Keys.CONTROL); Then get the action:
 * 
 * Action selectMultiple = builder.build(); And execute it:
 * 
 * selectMultiple.perform(); The sequence of actions should be short - it's
 * better to perform a short sequence of actions and verify that the page is in
 * the right state before the rest of the sequence takes place. The next section
 * lists all available actions and how can they be extended.
 * 
 * There are currently several actions:
 * 
 * ButtonReleaseAction - Releasing a held mouse button. <br>
 * ClickAction - Equivalent to WebElement.click() <br>
 * ClickAndHoldAction - Holding down the left mouse button.<br>
 * ContextClickAction - Clicking the mouse button that (usually) brings up the
 * contextual menu.<br>
 * DoubleClickAction - double-clicking an element.<br>
 * KeyDownAction - Holding down a modifier key. <br>
 * KeyUpAction - Releasing a modifier key.<br>
 * MoveMouseAction - Moving the mouse from its current location to another
 * element.<br>
 * MoveToOffsetAction - Moving the mouse to an offset from an element (The
 * offset could be negative and the element could be the same element that the
 * mouse has just moved to).<br>
 * SendKeysAction - Equivalent to WebElement.sendKey(...)<br>
 * 
 * 
 * @author mulakshmanan
 * 
 */
public class ActionsClass {

	WebDriver driver = new FirefoxDriver();

	public void doRightClick() {
		Actions action = new Actions(driver);
		action.contextClick(driver.findElement(By.id(""))).build().perform();
	}
}
