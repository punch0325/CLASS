package test200715;

public class Student {

	String name = "������";
	String adress = "������";
	String hobby = "����";
	String s = "����";
	int age = 24;

//	Student(String name, String adress, String hobby, int age){
//		this.adress = adress;
//		this.age = age;
//		this.hobby = hobby;
//		this.name = name;
//	}
	
	public Student(String name, String adress, String hobby, int age) {
		super();
		this.name = name;
		this.adress = adress;
		this.hobby = hobby;
		this.age = age;
	}
//���콺 ��Ŭ��->source->�ؿ��� 3��° ������ �ڵ� �Ű����� �ϼ�!
	
	Student(){
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", adress=" + adress + ", hobby=" + hobby + ", s=" + s + ", age=" + age + "]";
	}
//�ʵ� ���� ������� �� �ִ� �޼ҵ�
//���콺 ��Ŭ��->source->�ؿ��� 4��° Ŭ��!

	
	
}
