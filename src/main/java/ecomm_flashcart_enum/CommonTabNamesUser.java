package ecomm_flashcart_enum;
/**
 * This is the enum which consist of commontab names which are used to access easily and available in all the pages 
 * @author Subhas bhosale
 *
 */
public enum CommonTabNamesUser {

MYACCOUNT("My Account")
,WISHLIST("Wishlist")
,MYCART("My Cart")
,LOGIN ("Login")
,LOGOUT("Logout");
	private String Y;
	
	private CommonTabNamesUser(String Y)
	{
		this.Y=Y;
	}
	
	public String getTabName()
	{
		return Y;
	}
}
