package test200713;

public class K01_2DArray {

	public static void main(String[] args) {
		// 2행 3열 정수형 배열
		int [][] number = new int[2][3];
		
		//number 배열의 크기 구하는 법
		System.out.println(number.length);
		System.out.println(number[1].length);
		
		//크기만 지정한 number배열에 데이터 값 지정하기
		number[0][0] = 1;
		number[0][1] = 3;
		number[0][2] = 5;
		number[1][0] = 7;
		number[1][1] = 9;
		number[1][2] = 0;
		
		//for문을 이용하여 number배열의 모든 값 출력
		for (int i = 0; i<number.length; i++) {
			for(int j = 0; j<number[i].length; j++) {
				System.out.println("number"+i+","+j+"값 : "+number[i][j]);	
			}
		}
		
		// 3행 3열 정수형 배열
		int[][] number1 = new int[3][3];
		System.out.println(number1); //신경X
		
		//1행에 1,2,3   2행에 4,5,6 을 지정
		int[][] number2 = {{1,2,3},{4,5,6}};
		System.out.println(number2); //신경X
		
		
		
		
		
		
		
	}

}
