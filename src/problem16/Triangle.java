package problem16;

public abstract class Triangle extends GeometricObject {
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
	// Default Constructor
	public Triangle() { }
	
	//  
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	 
	 
		public double getSide1() {
			return this.side1;
		}
		
		public double getSide2() {
			return this.side2;
		}
		
		public double getSide3() {
			return this.side3;
		}
		
	 
	 // Triangle Methods 
	 public double getArea(){
		 return (getPerimeter() * 
				 (getPerimeter() - getSide1())
				 * (getPerimeter() - getSide2())
				 * (getPerimeter() - getSide3())) * 0.5;
		 
	 }
	 
	 public double getPerimeter(){
		 return getSide1() + getSide2() + getSide3();
		 
	 }
	 
	 public String toString(){
		 return "This triangle has an area " + getArea() + ", and a perimeter " 
	 + getPerimeter() + ".";
		 
	 }
	 
	 
	 // Main Method
	 public static void main(String[] args){
		 System.out.println();
	 }
	 
	}

