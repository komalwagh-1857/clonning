package copyConstructor;

public class TestCopyConstructor {
public static void main(String[] args) {
	
	Address add=new Address("pune","IND",123);
	Employee emp1= new Employee(10,"ram",add);
	
	System.out.println(emp1);
	
	Employee emp2=new Employee(emp1);
	System.out.println(emp2);
	
	emp1.address.city="Mumbai";
	
	System.out.println("Emp1 changed:"+emp1);
	System.out.println("Emp2 changed:"+emp2);
	System.out.println(emp1.hashCode());
	System.out.println(emp2.hashCode());
	
}
}
