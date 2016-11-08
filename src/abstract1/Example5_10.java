package abstract1;

public class Example5_10 {
	public static void main(String[] args) {
		Pillar pillar;
		Geometry tuxing;
		tuxing=new Lader(12,22,100);
		System.out.println("梯形的面积"+tuxing.getArea());
		pillar=new Pillar(tuxing, 58);
        System.out.println("梯形底的柱体的体积"+pillar.getVolume());
        tuxing=new Circle(10);
        System.out.println("半径为10的圆的面积"+tuxing.getArea());
        pillar.changeBottom(tuxing);
        System.out.println("图形底的柱体的体积"+pillar.getVolume());
	}
}
