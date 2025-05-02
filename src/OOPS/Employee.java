package OOPS;
public class Employee {
	int Id;
	String FirstName;
	String LastName;
	int Salary;
public Employee(int Id, String FirstName, String LastName, int Salary) {
	this.Id = Id;
	this.FirstName = FirstName;
	this.LastName = LastName;
	this.Salary = Salary;
}
public int getId() {
	return Id;
}
public String getFirstName() {
	return FirstName;
}
public String getLastName() {
	return LastName;
}
public String getName() {
	String Name = FirstName + LastName;
	return Name ;
}
public int getSalary() {
	return Salary;
}
public int getAnnualSalary() {
	int AnnualSalary = Salary*12;
	return AnnualSalary ;
}
public void setSalary(int salary) {
    this.Salary = salary;
}
public void raiseSalary(double percentage) {
    double raiseAmount = Salary * percentage / 100;
    Salary += raiseAmount;
}
public String toString() {
	return "Employee :{" + "Id = " + Id + ", Name = '" + FirstName + " " + LastName + '\'' + ", Salary = " + Salary + '}';
}
	public static void main(String[] args) {
		Employee obj1 = new Employee(100, "Jenitha", "Jeyasekaran", 25000);
		System.out.println(obj1);
		System.out.println("Annual Salary : " + obj1.getAnnualSalary());
		System.out.println("Initial Salary : "+ obj1.getSalary());
		obj1.raiseSalary(20);
		System.out.println("Salary after 20% hike : "+ obj1.getSalary());
		
		}

	}

