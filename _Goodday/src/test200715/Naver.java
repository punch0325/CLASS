package test200715;

public class Naver {
	
	String id;
	String pw;
	String pwCheck;
	String name;
	int birth;
	char gender;
	String emaile;
	String phone;
	String adress = "연수구 옥련1동";
	
	Naver() {
		int number = 10;
		System.out.println("기본 생성자 호출"+number);
	}

	public Naver(String id, String pw, String pwCheck, String name, int birth, char gender, String emaile,
			String phone, String adress) {
		super();
		this.id = id;
		this.pw = pw;
		this.pwCheck = pwCheck;
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		this.emaile = emaile;
		this.phone = phone;
		this.adress = adress;
		System.out.println("룰루랄라");
	}

	//메소드(Method)
	// @ 어노테이션(Annotation)
	@Override
	public String toString() /*return타입 메소드이름()*/ {
		return "Naver [id=" + id + ", pw=" + pw + ", pwCheck=" + pwCheck + ", name=" + name + ", birth=" + birth
				+ ", gender=" + gender + ", emaile=" + emaile + ", phone=" + phone + ", adress=" + adress + "]";
	}

	
	

}
