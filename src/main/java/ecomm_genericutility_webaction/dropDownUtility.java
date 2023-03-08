package ecomm_genericutility_webaction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * By using this utility we can handle any kind of dropdown
 * @author Subhas bhosale
 *
 */
public class dropDownUtility {

/**
 * This method is used to select option from single select dropdown based on visible text
 * @param ele
 */
public void handleDropDown(WebElement ele,String visibleText)
{
	Select sel=new Select(ele);
	sel.selectByVisibleText(visibleText);
}
/**
 * This method is used to select option from single select dropdown based on value
 * @param value
 * @param ele
 */
public void handleDropDown(String value,WebElement ele)  //method_overloaded
{
	Select sel=new Select(ele);
	sel.selectByValue(value);
}
/**
 * This method is used to select option from single select dropdown based on index of option
 * @param ele
 * @param index
 */
public void handleDropDown(WebElement ele,int index)  //overloaded
{
	Select sel=new Select(ele);
	sel.selectByIndex(index);
}
}
