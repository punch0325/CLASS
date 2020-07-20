package test200716_class3;

public class StudentDTO {
// DTO(Data Taransfer Object) : 데이터를 담아서 전달하기 위한 클래스	
	
	private String name;
	private String birth;
	private int age;
	private String gender;
	private String adress;
	private String phone;
	private boolean program;
	private String email;
	//public, private : 접근제한자
	//private은 이 클래스 안에서만 쓸 수 있기 때문에 다른 클래스에서 활용이 불가능하고 그러므로 필드를 보호할 수 있다
	//필드는 보호 해야 하는 게 원칙!
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
                  //bool타입인 경우에 게터는 is라고 이름이 붙는다 (통상적으로)		
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
	 * get,set메소드
	 * 사용이유 : 필드에 직접 접근이 아닌 메소드를 통한 간접 접근하여 필드값 지정 및 수정- 
	 *
	 *1.get 메소드 : 외부에서 필드값을 쓰고자 할 때 (게터)
	 *2.set 메소드 : 외부에서 필드값을 지정할 때 (세터)
	 */
	
	public void setName(String name) {
		this.name=name;
		
	}
	
	public String getName() {
		return name;
	}
	//게터는 값을 넘겨서 쓰임이 되어야하기 때문에 리턴이 있어야한다
	//그러므로 게터의 리턴타입은 필드의 타입과 같다
	//마우스 우클릭->soure->Generate getter and setter를 클릭하면 한번에 게터,세터 생성 가능

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
