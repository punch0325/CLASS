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
	String adress = "������ ����1��";
	
	Naver() {
		int number = 10;
		System.out.println("�⺻ ������ ȣ��"+number);
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
		System.out.println("������");
	}

	//�޼ҵ�(Method)
	// @ ������̼�(Annotation)
	@Override
	public String toString() /*returnŸ�� �޼ҵ��̸�()*/ {
		return "Naver [id=" + id + ", pw=" + pw + ", pwCheck=" + pwCheck + ", name=" + name + ", birth=" + birth
				+ ", gender=" + gender + ", emaile=" + emaile + ", phone=" + phone + ", adress=" + adress + "]";
	}

	
	

}
