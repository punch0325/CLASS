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
		/*������(polymorphism)
		  - �ڹ��� ��ü ���⼺ Ư¡ �� �ϳ���, Animal Ŭ������ Dog�� CatŬ������ �θ� Ŭ�����̱� ������
		         ���� ���� ������ �������� ���ϰ� ���� �� �����Ƿ� Dog�� CatŬ������ �����ڷε� AnimalŬ���� Ÿ�� ��ü�� ������ �� �ִ�*/
		
		
		
	}

}
