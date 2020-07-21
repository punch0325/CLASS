package test200702;

public class D06_SwitchCase {

	public static void main(String[] args) {
		
		/*
		 * switch case 문
		 * switch(조건변수) {
		 * 
		 * case 변수값:
		 *    해당 조건이 맞을 때 실행하는 내용;
		 *    break;(조건을 끝내주는 명령)
		 * case 변수값
		 *    해당 조건이 맞을 때 실행하는 내용;
		 *    break;
		 * ~~~~~~~(case 변수값은 계속 추가 가능)
		 * default(if문에서 else같은 역할) :
		 *    어떠한 조건도 충족하지 못했을 때 실행;
		 *    break;
		 * }
		 */
		
		int num = 2;
		switch(num) {
		case 0 :
			System.out.println("num 값이 0입니다.");
			break;
		case 1 :
			System.out.println("num 값이 1입니다.");
			break;
		case 2 :
			System.out.println("num 값이 2입니다.");
			break;
		default : 
			System.out.println("숫자가 아닙니다.");
			break ;
		}

	}

}
