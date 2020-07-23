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
			System.out.println("1.�� ��� | 2.���� Ȯ�� | 3.���� | 4.��� | 5.�ܰ� | 6.����");
			System.out.println("-------------------------------------------------");
			System.out.print("���� > ");
			int menuNum = scan.nextInt();
			
			switch(menuNum) {
			case 1 :
				System.out.print("���� �̸��� �Է��ϼ��� : ");
				String costomerName = scan.next();
				System.out.print("����� ���� ��ȣ�� �Է��ϼ��� : ");
				String accountNum = scan.next();
				System.out.print("��й�ȣ�� �Է��ϼ��� : ");
				int pw = scan.nextInt();
				System.out.print("�ʱ� �Ա� �ݾ��� �Է��ϼ��� : ");
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
				System.out.println("ATM�� ����Ǿ����ϴ�. �����մϴ�.");
				break;
			default :
				System.out.println("�޴� ���� ��ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �������ּ���.");
				break;
			}
		}

		scan.close();
		
		
		
		
		
		
	}

}
