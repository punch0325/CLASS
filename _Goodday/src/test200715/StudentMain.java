package test200715;

public class StudentMain {

	public static void main(String[] args) {
		
		Student student_1 = new Student();
		student_1.name = "송지혜";
		student_1.adress = "부평구";
		student_1.hobby = "운동";
		student_1.s = "여자";
		student_1.age = 23;
		System.out.print(student_1.name+"|");
		System.out.print(student_1.adress+"|");
		System.out.print(student_1.hobby+"|");
		System.out.print(student_1.s+"|");
		System.out.println(student_1.age);
		
		Student student_2 = new Student();
		System.out.println(student_2.toString());
//      클래스에 입력한 출력 메소드를 이용한 것
		
		Student student_3 = new Student("김미정","서구","요리",29);
		System.out.print(student_3.name+"|");
		System.out.print(student_3.adress+"|");
		System.out.print(student_3.hobby+"|");
		System.out.print(student_3.s+"|");
		System.out.print(student_3.age);

	}

}
