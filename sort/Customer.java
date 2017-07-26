package test.sort;
/**
 * Implementing comparable , you will have to override the
 * compareTo method that jsut returns -1,0,1 if the input to the metho
 * is equal to 'this'.  how do you determine equal? well you have to override the
 * equals method.  equals method you can define what data fields make somehting equal.
 * 
 * if you override equals then you have to override hashcode method as well.
 * 
 * 
 * 
 * @author kcenturion
 *
 */
public class Customer implements Comparable<Customer>{

	private String firstName;
	private String lastName;
	private int employeeId;
	
	public Customer(String fn,String ln, int eId){
		this.firstName = fn;
		this.lastName  = ln;
		this.employeeId= eId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public int compareTo(Customer c) {			
		if(c.employeeId==this.employeeId){
			return 0;
		}
		else if(c.employeeId > this.employeeId){
			return -1;
		}
		else if(c.employeeId < this.employeeId){
			return 1;
		}		
		
		return 0;
	}
	
	public boolean equals(Customer c){
		
	}
	
	
	
	public String toString(){
		return firstName+" "+lastName+" "+employeeId;
	}
	
}
