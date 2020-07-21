package test200707;

public class G02_WhileExample01 {

	public static void main(String[] args) {
		// 1~10까지 더한 값을 while문으로 출력
		
		int i =0;
		int sum = 0;
		i=1;
		
		while (i<=10) {
			sum+=i;
			i++;
		}System.out.println(sum);

	}

}
