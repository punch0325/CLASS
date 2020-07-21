package test200710;

public class J02_ForEach {

	public static void main(String[] args) {
		// advanced for (향상된 for)
		// for each
		
		int[] num = {1,2,3,4,5};
		
		for (int i:num) {
			//int a가  반복 변수
			//num자리는 반복 대상이 옴
			System.out.println(i);
		}
//      a에 num 배열 값이 차례대로 대입 되어 출력 되고,
//      num 배열 값이 다 반복 되고 나면 자동으로 종료 됨
		
		String[] any = {"우리","집","고양이","이름은","펀치이다"
		};
		
		for (String j:any) {
			System.out.print(j);
		}
		
		
		
	}

}
