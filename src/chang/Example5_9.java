package chang;
class Animal{
	void cry(){
		
	}
}
class Dog extends Animal{
	void cry(){
		System.out.println("ÍôÍô");
	}
}
class Cat extends Animal{
	void cry(){
              System.out.println("ß÷ß÷");
	}
}
public class Example5_9 {
	 public static void main(String args[]){
		 Animal animal;
		 animal =new Dog();
		 animal.cry();
		 animal =new Cat();
		 animal.cry();
	 }
}
