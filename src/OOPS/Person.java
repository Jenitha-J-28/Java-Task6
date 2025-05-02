package OOPS;
public class Person {
private String name;
private int age;

Person(String name){
	this.name = name;
	}
Person(int age){
	this.age = age;
	}

public void getName() {
	System.out.println("Name : " + this.name);
	}
public void getAge() {
	System.out.println("Age : " + this.age);
	}
	public static void main(String[] args) {
		Person obj1 = new Person("Guvi");
		Person obj2 = new Person(35);
		obj1.getName();
		obj2.getAge();
	}
}
