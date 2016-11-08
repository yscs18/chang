package abstract1;

public class Pillar {
	Geometry bottom;
	double height;
	Pillar(Geometry bottom,double height){
		this.bottom=bottom;
		this.height=height;
	}
	void changeBottom(Geometry bottom){
		this.bottom=bottom;
	}
	public double getVolume(){
		return  bottom.getArea()*height;
	}
}
