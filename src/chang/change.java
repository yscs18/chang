package chang;
class A{
	double n;
	int m;
	void f(){
		System.out.println("����̳з���f(),n="+n+"     m="+m);
	}
	void g(){
		System.out.println("��ã�n="+n+"    "+"   m="+m);
	}
}
class B extends A{
	int n=12;
	void g(){
		System.out.println("������д�ķ���n="+n+"    m="+m);
	}
	void cry(){
		System.out.println("���������ķ���n="+n+"    m="+m);
	}
}

public class change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a;
		a=new B();
		a.n=0.618;
		a.m=200;
		a.f();
		a.g();
		B b=(B)a;
		b.n=55;
		b.g();
	}

}
