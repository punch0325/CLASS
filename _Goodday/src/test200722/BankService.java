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
		System.out.print("�� ��ȣ�� �Է����ּ��� : ");
		int costomerNum = scan.nextInt();
		System.out.print("��� ��ȣ�� �Է����ּ��� : ");
		int pw = scan.nextInt();
		
		for (int i = 0; i < bankList.size(); i++) {
			if (costomerNum == bankList.get(i).getCostomerNum() && pw == bankList.get(i).getPw()) {
				System.out.print("���ݾ� �� ");
				int money = scan.nextInt();
				int balance = bankList.get(i).getBalance();
				balance+= money;
				bankList.get(i).setBalance(balance);
				System.out.println("���� �Ϸᢾ ���� �ܾ� " + bankList.get(i).getBalance()+"��");
			}else if (costomerNum == bankList.get(i).getCostomerNum() || pw == bankList.get(i).getPw()) {
				System.out.println("��й�ȣ �����Դϴ�. �ٽ� �õ��ϼ���. ");
			}
		}
		return bankList;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public List<BankDTO> withdraw(List<BankDTO> bankList) {
		System.out.print("�� ��ȣ�� �Է����ּ��� : ");
		int costomerNum = scan.nextInt();
		System.out.print("��� ��ȣ�� �Է����ּ��� : ");
		int pw = scan.nextInt();
		
		for (int i = 0; i < bankList.size(); i++) {
			if (costomerNum == bankList.get(i).getCostomerNum() && pw == bankList.get(i).getPw()) {
				System.out.print("��ݾ� �� ");
				int money = scan.nextInt();
				int balance = bankList.get(i).getBalance();
				if (money > balance) {
					System.out.println("�ܾ��� �����Ͽ� ����� �� �����ϴ�.");
					System.out.println("���� �ܾ� " + bankList.get(i).getBalance()+"��");
				}else if (money <= balance) {
					balance-= money;
					bankList.get(i).setBalance(balance);
					System.out.println("��� �Ϸᢾ ���� �ܾ� " + bankList.get(i).getBalance()+"��");
				}
			}else if (costomerNum == bankList.get(i).getCostomerNum() || pw == bankList.get(i).getPw()) {
				System.out.println("��й�ȣ �����Դϴ�. �ٽ� �õ��ϼ���. ");
			}
		}
		return bankList;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void balanceView(List<BankDTO> bankList) {
		System.out.print("�� ��ȣ�� �Է����ּ��� : ");
		int costomerNum = scan.nextInt();
		System.out.print("��� ��ȣ�� �Է����ּ��� : ");
		int pw = scan.nextInt();
		
		for (int i = 0; i < bankList.size(); i++) {
			if (costomerNum == bankList.get(i).getCostomerNum() && pw == bankList.get(i).getPw()) {
				System.out.println("���� ������ �ܰ� �ݾ��� "+bankList.get(i).getBalance()+"�� �Դϴ٢�");
			}else if (costomerNum == bankList.get(i).getCostomerNum() || pw == bankList.get(i).getPw()) {
				System.out.println("��й�ȣ �����Դϴ�. �ٽ� �õ��ϼ���. ");
			}
		}	
	}






















}
