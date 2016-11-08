package abstract1;

public class Circle extends Geometry {
	double r;
	Circle(double r){
		this.r=r;
	}

	public double getArea() {
		// TODO Auto-generated method stub
		return 3.14*r*r;
	}

}
