package ecomm_flashcart_enum;
/**
 * This enum contains particular sheet name in excel and testcase names help the tester to access easily
 *
 * @author Subhas bhosale
 *
 */
public enum Excelsheet {
   ORGANIZATION("Organization"),CONTACTS("contact"),WISHLISTMYCART("wishlist_mycart"),TEXTBOX("text box")
   ,CREATEPRODUCT("create product"),SEARCH("Search");          //key(value)
	String key;
	
	/**
	 * here we have to get the value using getter as constructor
	 * @param key
	 */
	private Excelsheet(String key)     //constructor    //setter(need to be private bcz it wont be used(visible) to user)
	{
		this.key=key;
	}
	/**
	 * @return
	 */
	public String getSheetName()                   //getter(by calling this method we'll get updated key value)
	{
		return key;
	}
}

//we use getters&setters to set the value as contact interms of CONTACTS         (v.v.v.Imp)
//and get the value(ans as contact) by calling getSheetName                        (v.v.v.Imp)
//How it will work..???
//enum is using during the implementation when we call enum automatically the paths present in the enum will display(like refer)
