package test200713;


import java.util.Scanner;

public class K02_2DArrayEx1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		
		double[][] grade = new double[4][2];
		double sum = 0;
		int average = (grade.length*grade[0].length);
		
	    for (int i = 0; i<grade.length; i++) {
	    	for (int j =0 ; j<grade[i].length; j++){
	    		System.out.print((i+1)+"�г�"+(j+1)+"�б� : ");
	    		grade[i][j] = scan.nextDouble();
	    		sum+=grade[i][j];	
	    	}
	    }
	    System.out.println("���� : "+sum);
	    System.out.println("���� ��� : "+sum/average);

//	    count������ �ϳ� �����ؼ� �ݺ��� �ȿ� count++��
//	       �ݺ����� �� �� ���� ������ �ϳ��� �÷���
//	       �հ踦 ������ ����� ���ϴ� ����� ����!
	    
	    
	    scan.close();
	}

}
