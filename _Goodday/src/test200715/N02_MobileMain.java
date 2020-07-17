package test200715;

public class N02_MobileMain {

	public static void main(String[] args) {
		
		Mobile mobile1 = new Mobile();
		mobile1.company = "애플";
		mobile1.model = "아이폰 8";
		mobile1.color = "silver";
		mobile1.type = 5;
		
		Mobile mobile2 = new Mobile();
		mobile2.model = "S20";
		mobile2.color = "red";
		mobile2.type = 5;
		
		System.out.println(mobile1.company);
		System.out.println(mobile2.company);
//		각각의 객체는 독립되어 있기 때문에 mobile1에서는
//		mobile1.company를 애플로 지정해주어서 애플이 출력,
//		mobile2에서는 company를 지정하지 않았기 때문에
//		클래스에서 지정한 삼성이 출력됨
		
		//모든 필드를 매개변수로 하는 생성자를 이용한 객체 생성
		Mobile mobile4 = new Mobile("삼성","노트10","black",5);
		System.out.println(mobile4.color);
		System.out.println(mobile4.company);
		System.out.println(mobile4.model);
		System.out.println(mobile4.type);
	}

}
