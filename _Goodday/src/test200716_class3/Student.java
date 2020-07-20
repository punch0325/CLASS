package test200716_class3;

public class Student {


// 필드,생성자 생성용 클래스
	
	
	String name;
	String birth;
	int age;
	String gender;
	String adress;
	String phone;
	boolean program;
	String email;
	
	Student() {
		
	}
	
	public Student(String name, String birth, int age, String gender, String adress, String phone, boolean program, String email) {
		super();
		this.name = name;
		this.birth = birth;
		this.age = age;
		this.gender = gender;
		this.adress = adress;
		this.phone = phone;
		this.program = program;
		this.email = email;
	}

	public Student(String name, String adress, String phone) {
		super();
		this.name = name;
		this.adress = adress;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", adress=" + adress + ", phone=" + phone + "]";
	}

	

	
	
	
	
}
