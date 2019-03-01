package assignmnet3q1;

public class Triangle extends GeometricObject {

	private double side1=1.0;
	private double side2=1.0;
	private double side3=1.0;
	Triangle()
	{
		
	}
	Triangle(double side1,double side2,double side3)
	{
		
	}
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	public double getArea()
	{
		side1=this.getSide1();
		side2=this.getSide2();
		side3=this.getSide3();
		return side1*side2*side3;
	}
	public double getPerimeter()
	{
		side1=this.getSide1();
		side2=this.getSide2();
		side3=this.getSide3();
		return (side1+side2+side3)/2;
	}
	
	
}
