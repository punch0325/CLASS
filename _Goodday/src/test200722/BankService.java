package test200722;

import java.util.List;
import java.util.Scanner;

public class BankService {

	Scanner scan = new Scanner(System.in);
	
	public void infoView(List<BankDTO> bankList) {
		for (int i = 0; i < bankList.size(); i++) {
			System.out.println(bankList.get(i));
		}
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public List<BankDTO> Deposit(List<BankDTO> bankList) {
		System.out.print("고객 번호를 입력해주세요 : ");
		int costomerNum = scan.nextInt();
		System.out.print("비밀 번호를 입력해주세요 : ");
		int pw = scan.nextInt();
		
		for (int i = 0; i < bankList.size(); i++) {
			if (costomerNum == bankList.get(i).getCostomerNum() && pw == bankList.get(i).getPw()) {
				System.out.print("예금액 ▶ ");
				int money = scan.nextInt();
				int balance = bankList.get(i).getBalance();
				balance+= money;
				bankList.get(i).setBalance(balance);
				System.out.println("예금 완료♥ 현재 잔액 " + bankList.get(i).getBalance()+"원");
			}else if (costomerNum == bankList.get(i).getCostomerNum() || pw == bankList.get(i).getPw()) {
				System.out.println("비밀번호 오류입니다. 다시 시도하세요. ");
			}
		}
		return bankList;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public List<BankDTO> withdraw(List<BankDTO> bankList) {
		System.out.print("고객 번호를 입력해주세요 : ");
		int costomerNum = scan.nextInt();
		System.out.print("비밀 번호를 입력해주세요 : ");
		int pw = scan.nextInt();
		
		for (int i = 0; i < bankList.size(); i++) {
			if (costomerNum == bankList.get(i).getCostomerNum() && pw == bankList.get(i).getPw()) {
				System.out.print("출금액 ▶ ");
				int money = scan.nextInt();
				int balance = bankList.get(i).getBalance();
				if (money > balance) {
					System.out.println("잔액이 부족하여 출금할 수 없습니다.");
					System.out.println("현재 잔액 " + bankList.get(i).getBalance()+"원");
				}else if (money <= balance) {
					balance-= money;
					bankList.get(i).setBalance(balance);
					System.out.println("출금 완료♥ 현재 잔액 " + bankList.get(i).getBalance()+"원");
				}
			}else if (costomerNum == bankList.get(i).getCostomerNum() || pw == bankList.get(i).getPw()) {
				System.out.println("비밀번호 오류입니다. 다시 시도하세요. ");
			}
		}
		return bankList;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void balanceView(List<BankDTO> bankList) {
		System.out.print("고객 번호를 입력해주세요 : ");
		int costomerNum = scan.nextInt();
		System.out.print("비밀 번호를 입력해주세요 : ");
		int pw = scan.nextInt();
		
		for (int i = 0; i < bankList.size(); i++) {
			if (costomerNum == bankList.get(i).getCostomerNum() && pw == bankList.get(i).getPw()) {
				System.out.println("현재 고객님의 잔고 금액은 "+bankList.get(i).getBalance()+"원 입니다♬");
			}else if (costomerNum == bankList.get(i).getCostomerNum() || pw == bankList.get(i).getPw()) {
				System.out.println("비밀번호 오류입니다. 다시 시도하세요. ");
			}
		}	
	}






















}
