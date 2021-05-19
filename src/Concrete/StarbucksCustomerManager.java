package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerManager;
import Abstract.CustomerService;
import Entities.Customer;

public class StarbucksCustomerManager extends CustomerManager{

	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved to Database : " + customer.firstName);
		} else {
			System.out.println("Not a valid person!");
		}
		
	}

}
