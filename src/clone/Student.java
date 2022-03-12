package clone;

public class Student implements Cloneable {
int rollno;
String name;
Address add;


public Student() {
	
}


public Student(int rollno, String name, Address add) {
	this.rollno = rollno;
	this.name = name;
	this.add = add;
}


@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", add=" + add + "]";
}


@Override
protected Object clone() throws CloneNotSupportedException {
	Student dummyStd=(Student)super.clone();
	Address addr=(Address)add.clone();
	dummyStd.add=addr;
	return dummyStd;
}



}
