
public class Customer {
	private static String custNo;
	private static String custName;
	private static String category;

	public String getCustNo()
	{
	return custNo;
	}



	public void setCustNo(String custNo)
	{
	this.custNo = custNo;
	}




	public String getCustName()
	{
	return custName;
	}



	public void setCustName(String custName)
	{
	this.custName = custName;
	}




	public String getCategory()
	{
	return category;
	}



	public void setCategory(String category)
	{
	this.category = category;
	}

	public static void main(String[] args) throws MissMatchExceeption
	{
	char ch;
	Customer c = new Customer();
	c.custNo="C113";
	c.custName="John";
	c.category="Gold";

	if(custNo.charAt(0) == 'C' || custNo.charAt(0) == 'c' )
	{
	if(custName.length()>=4)
	{
	if(category == "Gold" || category == "Platinum" || category == "Silver")
	{
	System.out.println("All the conditions are satisfied!. . .");
	System.out.println(c.getCustNo());
	System.out.println(c.getCustName());
	System.out.println(c.getCategory());
	}
	else
	{
	throw new MissMatchExceeption("The category must be either Gold or Platinum or Sliver");
	}

	}
	else
	{
	throw new MissMatchExceeption("Name of the Customer must be greater than or equal to 4 charecter");
	}

	}
	else
	{
	throw new MissMatchExceeption("The Customer id must be starts with C or c");
	}
	}
	
}
