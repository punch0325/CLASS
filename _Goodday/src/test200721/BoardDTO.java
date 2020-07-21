package test200721;

public class BoardDTO {
	
	private int contentsNum;
	private String title;
	private String contents;
	private String password;
// 필요한 필드를 선언
	
	public BoardDTO(int contentsNum, String title, String contents, String password) {
		super();
		this.contentsNum = contentsNum;
		this.title = title;
		this.contents = contents;
		this.password = password;
	}
	public BoardDTO() {

	}
// 매개변수가 있는 생성자와 기본 생성자를 선언
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getContentsNum() {
		return contentsNum;
	}
	public void setContentsNum(int contentsNum) {
		this.contentsNum = contentsNum;
	}
// 필드를 보호하면서 쓰기 위한 게터 세터 메소드 생성
	
	@Override
	public String toString() {
		return "★ 글번호:" + contentsNum + ", 제목:" + title + ", 내용:" + contents + ", 비밀번호:" + password
				+ "★";
	}
// 출력을 간편하게 하기 위한 toString 메소드 생성
	
}
