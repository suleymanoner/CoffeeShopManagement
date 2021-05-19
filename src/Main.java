import Abstract.CustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new NeroCustomerManager(new CustomerCheckManager());
		customerManager.save(new Customer(1,"Suleyman","Oner","1999","TC"));
		
		
	}

}
