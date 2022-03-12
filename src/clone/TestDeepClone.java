 package clone;

public class TestDeepClone {
public static void main(String[] args) throws CloneNotSupportedException{
	Address add=new Address("pune","IND", 01234);
	Student s1=new Student(10,"Ram",add);
	System.out.println("Original (s1)="+s1);
	
	Student s2=(Student)s1.clone();
	System.out.println("Original (s2)="+s2);
	 
	s1.add.city="Mumbai";
	System.out.println("Original (s1)after change in original="+s2);

	System.out.println("s1 hashcode="+s1.hashCode()+"s1-address hashcode="+s1.add.hashCode());
System.out.println("s2 hashcode="+s2.hashCode()+"s2-address hashcode="+s2.add.hashCode());
}
}

