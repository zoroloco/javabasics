package test.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTest {

	public static void main(String[] args) {
		Customer bob  = new Customer("bob","bobby",4);
		Customer ken  = new Customer("ken","centurion",1);
		Customer frew = new Customer("walter", "frey",2);
		Customer jon  = new Customer("jon", "snow", 3);

		List<Customer>c = new ArrayList<Customer>();
		
		c.add(bob);
		c.add(frew);
		c.add(jon);
		c.add(ken);
		
		//Collections.sort(c,new CustomerComparator());
		Collections.sort(c);//collections.sort works now because you made customer a comparable.
		
		System.out.println(c.toString());
	}

}
