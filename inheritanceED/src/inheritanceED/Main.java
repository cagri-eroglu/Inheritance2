package inheritanceED;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer cagri = new IndividualCustomer();
		cagri.customerNumber="12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";
			
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "99999";
		
		CustomerManager customerManager = new CustomerManager();
//		customerManager.add(hepsiBurada);
//		customerManager.add(cagri);
//		customerManager.add(abc);
		
		Customer[] customers = {cagri,abc,hepsiBurada};
		
		customerManager.addMultiple(customers);
		
		
	}

}
