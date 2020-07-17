package test200716_class3;

import java.util.Date;

public class Application {

// 기능 수행용 클래스
	
	public void enter(Student stu) {
	 System.out.println("Applicaition 클래스의 enter 메소드");
	 System.out.println(stu.name+"님 입실완료");
	 System.out.println("입실시간 : "+ new Date());
	}

	public void info(Student stu) {
		System.out.println(stu.name+"님의 정보입니다");
		System.out.println("주소 : "+stu.adress);
		System.out.println("전화번호 : "+stu.phone);
	}

	public void info_1(Student stu) {
		System.out.println("정보를 확인하세요");
		System.out.println(stu.toString());
	}

	public void change(Student stu) {
		System.out.println("정보가 수정되었습니다");
		stu.adress = "서울특별시";
		System.out.println(stu.toString());
	}

	
}
