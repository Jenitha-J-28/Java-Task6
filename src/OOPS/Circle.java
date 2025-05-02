package OOPS;

public class Circle {
double radius;

public Circle() {
	this.radius = 0;
	}
public Circle(double radius) {
	this.radius = radius;
	}
public double CircleCircumference() {
	double circumference = 2 * Math.PI * this.radius;
	return circumference;
}
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
	public static void main(String[] args) {
	Circle circle1 = new Circle();
	Circle circle2 = new Circle(10);
	
	System.out.println("The Circumference of the Circle1 : " + circle1.CircleCircumference());
	System.out.println("The Circumference of the circle2 : " + circle2.CircleCircumference());

	}

}
