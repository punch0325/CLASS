package test200720;

public class NaverMemberDTO {
	
	private String id;
	private String pw;
	private String pwCheck;
	private String name;
	private int birth;
	private char gender;
	private String emaile;
	private String phone;
	private String adress;
	

	
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getPwCheck() {
		return pwCheck;
	}
	public String getName() {
		return name;
	}
	public int getBirth() {
		return birth;
	}
	public char getGender() {
		return gender;
	}
	public String getEmaile() {
		return emaile;
	}
	public String getPhone() {
		return phone;
	}
	public String getAdress() {
		return adress;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setPwCheck(String pwCheck) {
		this.pwCheck = pwCheck;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setEmaile(String emaile) {
		this.emaile = emaile;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	

	NaverMemberDTO(){
		
	}
	public NaverMemberDTO(String name, String id, String pw) {
		this.id = id;
		this.name = name;
		this.pw = pw;
	}
	
	@Override
	public String toString() {
		return "ID:" + id + ", PW:" + pw + ", NAME:" + name;
	}
	//tostring 메소드의 리턴 값은 원하는대로 바꾸기 가능~
	




















}
