public class stock 
{
	public static void main(String[]args) 
	{	
		//construct a object  
		newStock Stock = new newStock("ORACLE CORPORATION","ORCL"); // name=ORACLE CORPORATION symbol=ORCL
		Stock.currentPrice = 34.35;
		Stock.previousClosingPrice = 34.5;
		System.out.println(Stock.symbol);
		System.out.println(Stock.name);
		System.out.printf("Price change percentage is %.2f%%",Stock.getChangePercent()); 
	}
}

//create a class named newStock
class newStock 
{
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	//constructor
	newStock() 
	{
	}
	
	//constructor with specified argument
	public newStock(String name,String symbol) 
	{
		this.symbol = symbol;
		this.name = name;
	}
	//return the percentage of the price-change percentage
	double getChangePercent()
	{
		return ((currentPrice-previousClosingPrice)/previousClosingPrice)*100;
	}
}