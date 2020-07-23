package test200722_01;

public class BookDTO {
	
	
    String bookSubject;
	String author;
	int bookNum;
	int memNum;
	boolean borrow;
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////	

	BookDTO(){
		
	}
	public BookDTO(String bookSubject, String author, int bookNum, boolean borrow, int memNum) {
		super();
		this.bookSubject = bookSubject;
		this.author = author;
		this.bookNum = bookNum;
		this.borrow = borrow;
		this.memNum = memNum;
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public String getBookSubject() {
		return bookSubject;
	}
	public String getAuthor() {
		return author;
	}
	public int getBookNum() {
		return bookNum;
	}
	public boolean isBorrow() {
		return borrow;
	}
	public int getMemNum() {
		return memNum;
	}
	public void setBookSubject(String bookSubject) {
		this.bookSubject = bookSubject;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}
	public void setBorrow(boolean borrow) {
		this.borrow = borrow;
	}
	public void setMemNum(int memNum) {
		this.memNum = memNum;
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	@Override
	public String toString() {
		return "[���� ��ȣ"+bookNum+"]"+"[���� ���� :"+bookSubject+"]"+"[���� ���� :"+author+"]"+"[���� ���� :"+borrow+"]"+"[���� ȸ����ȣ :"+memNum+"]";
	}











}
