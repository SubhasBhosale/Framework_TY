package ecomm_flashcart_enum;
/**
 *  This is the enum which consist of commontab names which are used to access easily and available in all the pages in admin page
 * @author Subhas bhosale
 *
 */
public enum TabNamesAdmin
{
	ORDERMANAGEMENT("Order Management"),MANAGEUSERS("Manage users")
	,CREATECATEGORY("Create Category")
	,SUBCATEGORY("Sub Category"),INSERTPRODUCT("Insert Product")
	,MANAGEPRODUCTS("Manage Products"),USERLOGINLOG("User Login Log"),LOGOUT(" Logout");
	private String X;


	
	
	private TabNamesAdmin(String X)             //setter
	{
		this.X=X;
	}
	
	public String getTab()                         //getter
	{
		return X;
	}
}
