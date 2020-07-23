package test200722;

import java.util.*;
import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<BankDTO> bankList = new ArrayList<BankDTO>();
		BankDTO bank = null;
		BankService bankSer = new BankService();
		
		boolean stop = true;
		
		while(stop){
			System.out.println("-------------------------------------------------");
			System.out.println("1.고객 등록 | 2.정보 확인 | 3.예금 | 4.출금 | 5.잔고 | 6.종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택 > ");
			int menuNum = scan.nextInt();
			
			switch(menuNum) {
			case 1 :
				System.out.print("본인 이름을 입력하세요 : ");
				String costomerName = scan.next();
				System.out.print("등록할 계좌 번호를 입력하세요 : ");
				String accountNum = scan.next();
				System.out.print("비밀번호를 입력하세요 : ");
				int pw = scan.nextInt();
				System.out.print("초기 입금 금액을 입력하세요 : ");
				int balance = scan.nextInt();
				
				int costomerNum = bankList.size()+1;
				
				bank = new BankDTO();
				bank.setCostomerName(costomerName);
				bank.setAccountNum(accountNum);
				bank.setPw(pw);
				bank.setBalance(balance);
		        bank.setCostomerNum(costomerNum);
				
				bankList.add(bank);
				break;
			case 2:
				bankSer.infoView(bankList);
				break;
			case 3 :
				bankList = bankSer.Deposit(bankList);
				break;
			case 4 :
				bankList = bankSer.withdraw(bankList);
				break;
			case 5 :
				bankSer.balanceView(bankList);
				break;
			case 6 :
				stop = false;
				System.out.println("ATM이 종료되었습니다. 감사합니다.");
				break;
			default :
				System.out.println("메뉴 선택 번호가 틀렸습니다. 다시 선택해주세요.");
				break;
			}
		}

		scan.close();
		
		
		
		
		
		
	}

}
