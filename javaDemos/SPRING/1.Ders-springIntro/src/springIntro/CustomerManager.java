package springIntro;

public class CustomerManager implements ICustomerService
{
	private ICustomerDal customerDal;

/*
	//constructor injector: sekt�rde genelde kullan�lan
	public CustomerManager(ICustomerDal customerDal)
	{
		this.customerDal = customerDal;
	}
	*/

	//4.Ders-setterInjection: Sekt�rde �ok �ok az kullan�l�r
	public void setCustomerDal(ICustomerDal customerDal)
	{
		this.customerDal = customerDal;
	}
	
	public void add()
	{
		customerDal.add();
	}
	

}
