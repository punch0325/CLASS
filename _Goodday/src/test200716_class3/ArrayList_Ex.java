package test200716_class3;

import java.util.*;

public class ArrayList_Ex {

	public static void main(String[] args) {
		/*
		 * ArrayList
		 * index번호를 가지고 있음
		 * 크기 지정이 따로 없고 값을 넣는대로 크기가 늘어남 
		 * 중간에 데이터 값을 끼워 넣을 수 있음 (원래 있던 값들은 그 다음 인덱스 번호로 밀려나게 됨) 
		 */
		
		List<Integer> numbers = new ArrayList<Integer>();
		List<String> str = new ArrayList<String>();
		List<StudentDTO> stuL = new ArrayList<StudentDTO>();
		// <> : 제네릭(generic)
		// 타입변환을 하지 않고도 해당 타입을 사용할 수 있게 해줌
		// 제네릭 안에는 클래스타입이 와야함
		// ex) Integer(정수를 담을 수 있는 클래스) , String , StudentDTO(직접 만든 클래스)
		
		numbers.add(10);
		      //add : 데이터 추가 메소드
		int num = 100;
		numbers.add(num);
		numbers.add(30);
		numbers.add(60);
		numbers.add(-1);
		numbers.add(0, 101); //0번 인덱스에 101 이라는 값을 끼워넣음
		numbers.add(0, 12);
		
//		numbers.clear();
		       //clear : 전체 데이터를 삭제해주는 메소드
		numbers.remove(2);
		       //remove : 원하는 인덱스 번호 값을 하나 지워주는 메소드
		       //         자동으로 인덱스 번호와 값을 조정해줌
		
		System.out.println(numbers);
		System.out.println(numbers.get(0));
		System.out.println(numbers.get(1));

		System.out.println(numbers.size());
		                         //size : ArrayList의 크기를 알려주는 메소드
		

		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(i+"번 인덱스 값 : "+numbers.get(i));
		}
		
		str.add("안녕안녕!");
		String word = "김펀치는 핵귀탱냥";
		str.add(word);
		str.add("펀치는 5살이다");
		str.add("펀치는 수컷 고양이이다");
		str.add(1, "김은비는 고양이를 키운다");
		str.add(2, "김은비가 키우는 고양이의 이름은 김펀치이다");
		
		str.remove(0);
		
		System.out.println("__________________________");
		for (int i = 0; i < str.size(); i++) {
			System.out.println(i+"번 인덱스 값 : "+str.get(i));
		}
		
		StudentDTO stuD1 = new StudentDTO();
		StudentDTO stuD2 = new StudentDTO();
		
		stuD1.setName("회원1");
		stuD1.setAdress("인천광역시");
		stuD1.setPhone("010-1234-5678");
		stuL.add(stuD1); // stuL
		
		System.out.println(stuL.get(0)); 
		//stuD의 상자의 이름만 출력되는 것, 하지만 만약 StudentDTO에 tostring메소드가 있다면 전체 값이 출력
		System.out.println(stuL.get(0).getName());
		
		stuD2.setName("회원2");
		stuD2.setAdress("경기도부천시");
		stuD2.setPhone("000-0000-0000");
		stuL.add(stuD2);
		System.out.println(stuL.get(1).getName());
		
		for (int i = 0; i < stuL.size(); i++ ) {
			System.out.println("전체 출력 : "+stuL.get(i));
			System.out.println("이름 출력 : "+stuL.get(i).getName());
		}
		

	}

}
