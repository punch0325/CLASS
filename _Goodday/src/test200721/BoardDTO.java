package test200721;

public class BoardDTO {
	
	private int contentsNum;
	private String title;
	private String contents;
	private String password;
// �ʿ��� �ʵ带 ����
	
	public BoardDTO(int contentsNum, String title, String contents, String password) {
		super();
		this.contentsNum = contentsNum;
		this.title = title;
		this.contents = contents;
		this.password = password;
	}
	public BoardDTO() {

	}
// �Ű������� �ִ� �����ڿ� �⺻ �����ڸ� ����
	
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
// �ʵ带 ��ȣ�ϸ鼭 ���� ���� ���� ���� �޼ҵ� ����
	
	@Override
	public String toString() {
		return "�� �۹�ȣ:" + contentsNum + ", ����:" + title + ", ����:" + contents + ", ��й�ȣ:" + password
				+ "��";
	}
// ����� �����ϰ� �ϱ� ���� toString �޼ҵ� ����
	
}
