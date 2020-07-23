package test200723_01;

public class AnimalMain {

	public static void main(String[] args) {
		
		Dog puppy = new Dog();
		Cat kitty = new Cat();
		
		puppy.sound();
		puppy.breath();
		
		kitty.sound();
		kitty.breath();
		
		Animal animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		/*다형성(polymorphism)
		  - 자바의 객체 지향성 특징 중 하나로, Animal 클래스는 Dog와 Cat클래스의 부모 클래스이기 때문에
		         위와 같은 유형의 다형성을 지니고 있을 수 있으므로 Dog와 Cat클래스의 생성자로도 Animal클래스 타입 객체를 선언할 수 있다*/
		
		
		
	}

}
