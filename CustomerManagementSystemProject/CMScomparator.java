package CustomerManagementSystemProject;

import java.util.Comparator;

public class CMScomparator implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		
		return o1.getFirstName().compareTo(o2.getFirstName());
	}

}
