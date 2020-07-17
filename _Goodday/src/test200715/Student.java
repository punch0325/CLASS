package test200715;

public class Student {

	String name = "김은비";
	String adress = "연수구";
	String hobby = "게임";
	String s = "여자";
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
//마우스 우클릭->source->밑에서 3번째 누르면 자동 매개변수 완성!
	
	Student(){
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", adress=" + adress + ", hobby=" + hobby + ", s=" + s + ", age=" + age + "]";
	}
//필드 값을 출력해줄 수 있는 메소드
//마우스 우클릭->source->밑에서 4번째 클릭!

	
	
}
