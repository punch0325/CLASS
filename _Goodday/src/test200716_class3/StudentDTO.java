package test200716_class3;

public class StudentDTO {
// DTO(Data Taransfer Object) : �����͸� ��Ƽ� �����ϱ� ���� Ŭ����	
	
	private String name;
	private String birth;
	private int age;
	private String gender;
	private String adress;
	private String phone;
	private boolean program;
	private String email;
	//public, private : ����������
	//private�� �� Ŭ���� �ȿ����� �� �� �ֱ� ������ �ٸ� Ŭ�������� Ȱ���� �Ұ����ϰ� �׷��Ƿ� �ʵ带 ��ȣ�� �� �ִ�
	//�ʵ�� ��ȣ �ؾ� �ϴ� �� ��Ģ!
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isProgram() {
                  //boolŸ���� ��쿡 ���ʹ� is��� �̸��� �ٴ´� (���������)		
		return program;
	}
	public void setProgram(boolean program) {
		this.program = program;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	/*
	 * get,set�޼ҵ�
	 * ������� : �ʵ忡 ���� ������ �ƴ� �޼ҵ带 ���� ���� �����Ͽ� �ʵ尪 ���� �� ����- 
	 *
	 *1.get �޼ҵ� : �ܺο��� �ʵ尪�� ������ �� �� (����)
	 *2.set �޼ҵ� : �ܺο��� �ʵ尪�� ������ �� (����)
	 */
	
	public void setName(String name) {
		this.name=name;
		
	}
	
	public String getName() {
		return name;
	}
	//���ʹ� ���� �Ѱܼ� ������ �Ǿ���ϱ� ������ ������ �־���Ѵ�
	//�׷��Ƿ� ������ ����Ÿ���� �ʵ��� Ÿ�԰� ����
	//���콺 ��Ŭ��->soure->Generate getter and setter�� Ŭ���ϸ� �ѹ��� ����,���� ���� ����

//	public StudentDTO(String name, String birth, int age, String gender, String adress, String phone, boolean program,
//			String email) {
//		super();
//		this.name = name;
//		this.birth = birth;
//		this.age = age;
//		this.gender = gender;
//		this.adress = adress;
//		this.phone = phone;
//		this.program = program;
//		this.email = email;
//	}
	
	StudentDTO() {
		
	}
	
	@Override
	public String toString() {
		return "StudentDTO [name=" + name + ", birth=" + birth + ", age=" + age + ", gender=" + gender + ", adress="
				+ adress + ", phone=" + phone + ", program=" + program + ", email=" + email + "]";
	}
	
	
}
