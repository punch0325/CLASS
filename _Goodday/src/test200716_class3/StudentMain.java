package test200716_class3;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

//객체를 생성해 필드값을 활용하는 메인 클래스		
		
		Scanner scan = new Scanner(System.in);
		boolean end = true;
		
		String name = "";
		String adress = "";
		String phone = "";
		int menu = 0 ;
		
		Student stu = null; //객체의 이름만 선언해놓은 것
		Application app = new Application();
		StudentDTO stuD = null;
		
		
		while (end) {
			System.out.println("--------------------------------------------------------------------");
			System.out.println("1.신규등록 | 2.출석체크 | 3.정보확인 | 4.정보수정 | 5.종료 | 6.DTO클래스를 이용한 객체");
			System.out.println("--------------------------------------------------------------------");
			
			System.out.print("선택 > ");
			menu = scan.nextInt();
			
			if (menu == 1) {
				System.out.print("이름 : ");
				name = scan.next();
				System.out.print("주소 : ");
				adress = scan.next();
				System.out.print("전화번호 : ");
				phone = scan.next();
				stu = new Student(name,adress,phone);				
			}else if (menu == 2) {
				app.enter(stu);
			}else if (menu == 3) {
				//app.info(stu);
				app.info_1(stu);
			}else if (menu == 4) {
				app.change(stu);
			}else if (menu == 6){
				System.out.print("이름 : ");
				name = scan.next();
				System.out.print("주소 : ");
				adress = scan.next();
				System.out.print("전화번호 : ");
				phone = scan.next();
				stuD = new StudentDTO();
				stuD.setName(name);
				stuD.setAdress(adress);
				stuD.setPhone(phone);
			}
			
			
		}
		
		stuD.setName("회원1"); // 세터 메소드를 이용하여 필드 값 지정
		System.out.println(stuD.getName()); // 게터 메소드를 이용하여 name 필드 값을 출력
		
		scan.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
