package facade;

public class Buy implements IBuy
{
	private Sector sector;
	private Storage storage;
	private Invoice invoice;
	private Email email;
	
	@Override
	public void buy(String product, int value) 
	{
		instaceVariables();
		if(product != null && !product.isEmpty() && value > 0) 
		{
			this.sector.pack(product, value);
			this.storage.pool(product, value);
			this.invoice.generate(product);
			this.email.send();
			System.out.println("\n=============================================\n");
		}
	}
	
	public void instaceVariables() 
	{
		if(null == this.sector) 
			sector = new Sector();
		if(null == this.storage) 
			storage = new Storage();
		if(null == this.invoice) 
			invoice = new Invoice();
		if(null == this.email) 
			email = new Email();
	}
}
