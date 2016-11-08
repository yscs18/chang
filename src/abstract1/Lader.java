package abstract1;

public class Lader extends Geometry{
	double a,b,h;
	Lader (double a,double b,double h){
		this.a=a;
		this.b=b;
		this.h=h;
	}

	public double getArea() {
		// TODO Auto-generated method stub
		return ((1/2.0)*(a+b)*h);
	}

}
