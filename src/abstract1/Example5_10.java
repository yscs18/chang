package abstract1;

public class Example5_10 {
	public static void main(String[] args) {
		Pillar pillar;
		Geometry tuxing;
		tuxing=new Lader(12,22,100);
		System.out.println("���ε����"+tuxing.getArea());
		pillar=new Pillar(tuxing, 58);
        System.out.println("���ε׵���������"+pillar.getVolume());
        tuxing=new Circle(10);
        System.out.println("�뾶Ϊ10��Բ�����"+tuxing.getArea());
        pillar.changeBottom(tuxing);
        System.out.println("ͼ�ε׵���������"+pillar.getVolume());
	}
}
