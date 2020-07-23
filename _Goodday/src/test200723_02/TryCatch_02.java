package test200723_02;

public class TryCatch_02 {

	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 0;
		
		try {
			int result = num1/num2;
			System.out.println(result);
		}catch (Exception e) {
			   //특정 Exception 오류가 아니라 모든 Exception오류가 뜰 때 catch를 실행시키겠다고 조건을 줄 수도 있음
			System.out.println("0으로는 나눌 수 없습니다.");
		}

		
	}

}
