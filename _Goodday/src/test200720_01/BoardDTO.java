package test200720_01;

public class BoardDTO {
	
	private String nickName;
	private String pw;
	private String contents;
	private int contentsNum;

	
	public String getNickName() {
		return nickName;
	}
	public String getPw() {
		return pw;
	}
	public String getContents() {
		return contents;
	}
	public int getContentsNum() {
		return contentsNum;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public void setContentsNum(int contentsNum) {
		this.contentsNum = contentsNum;
	}
	
	BoardDTO(){
		
	}
	
	public BoardDTO(String nickName, String pw, String contents, int contentsNum) {
		this.nickName = nickName;
		this.pw = pw;
		this.contents = contents;
		this.contentsNum = contentsNum;
	}
	

	

}
