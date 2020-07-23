package test200722_01;

public class MemberDTO {

	String memberName;
	String memberPhone;
	int memberNum;

/////////////////////////////////////////////////////////////////////////////////////////////////////////	

	MemberDTO(){
		
	}
	public MemberDTO(String memberName, String memberPhone, int memberNum) {
		super();
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.memberNum = memberNum;
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	public String getMemberName() {
		return memberName;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public int getMemberNum() {
		return memberNum;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Override
	public String toString() {
		return "[회원 번호"+memberNum+"]"+"[회원 이름 :"+memberName+"]"+"[회원 전화번호 :"+memberPhone+"]";
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
