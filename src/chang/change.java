package chang;
class A{
	double n;
	int m;
	void f(){
		System.out.println("子类继承方法f(),n="+n+"     m="+m);
	}
	void g(){
		System.out.println("你好，n="+n+"    "+"   m="+m);
	}
}
class B extends A{
	int n=12;
	void g(){
		System.out.println("子类重写的方法n="+n+"    m="+m);
	}
	void cry(){
		System.out.println("子类新增的方法n="+n+"    m="+m);
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
