package test200716_class3;

public class StudentDTO {
	
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

	public void setBirth(String birth) {
		this.birth = birth;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setProgram(boolean program) {
		this.program = program;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getBirth() {
		return birth;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String getAdress() {
		return adress;
	}
	public String getPhone() {
		return phone;
	}
	public boolean getProgram() {
		return program;
	}
	public String getEmail() {
		return email;
	}
	
}
