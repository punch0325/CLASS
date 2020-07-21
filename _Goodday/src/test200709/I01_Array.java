package test200709;

public class I01_Array {

	public static void main(String[] args) {
		
	
		//정수형 배열 변수를 선언하며 초기 값 지정
		int[] number3 = {1,2,3,4};
//		인덱스 번호는 총 3까지 나옴
//		0번 인덱스 = 1 / 1번 인덱스 = 2 / 2번 인덱스 =3 /
//		3번 인덱스 =4 

		System.out.println(number3[0]);
		System.out.println(number3[1]);
		System.out.println(number3[2]);
		System.out.println(number3[3]);
		
		//String 타입 배열을 선언하여 같은 줄에 앉은
		//4명의 이름을 저장하고 출력
		String[] name = {"지혜","은비","미정","예린"};
		
		String change = "";
		change = "뚠냥";
		name[1] = change;
		name[3] = "펀치";
		/* 배운것과 마찬가지로 출력은 가장 마지막 값만 보이기
		 때문에 위 방법 처럼 초기 지정 값에서 다른 값으로 
		 바꾸어서 출력이 가능함 */
		
		System.out.print(name[0]+"|");
		System.out.print(name[1]+"|");
		System.out.print(name[2]+"|");
		System.out.println(name[3]+"|");
		
		//배열의 크기 값을 출력하는 메소드
		System.out.println(name.length);
		
		//for문을 이용해 배열에 저장된 값 모두 출력
		for (int i=0; i<name.length; i++) {
			System.out.print(name[i]+"|");
		}

		//배열의 초기값을 설정하는 법
		int[] num1;
		num1 = new int[10];
		System.out.println("\n"+num1.length);
		
		int[] num2 = new int[3];
		System.out.println(num2.length);
		System.out.println();
		for (int i = 0; i<num2.length; i++) {
			System.out.println(num2[i]);
		}
	
	
	
	}

}
