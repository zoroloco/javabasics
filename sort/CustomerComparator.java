package test.sort;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer arg0, Customer arg1) {
		if(arg0.getEmployeeId() == arg1.getEmployeeId())
			return 0;
		if(arg0.getEmployeeId() > arg1.getEmployeeId())
			return 1;
		if(arg0.getEmployeeId() < arg1.getEmployeeId())
			return -1;
		
		return 0;
	}

}
