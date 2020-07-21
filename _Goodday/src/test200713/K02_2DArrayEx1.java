package test200713;


import java.util.Scanner;

public class K02_2DArrayEx1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("성적을 입력하세요");
		
		double[][] grade = new double[4][2];
		double sum = 0;
		int average = (grade.length*grade[0].length);
		
	    for (int i = 0; i<grade.length; i++) {
	    	for (int j =0 ; j<grade[i].length; j++){
	    		System.out.print((i+1)+"학년"+(j+1)+"학기 : ");
	    		grade[i][j] = scan.nextDouble();
	    		sum+=grade[i][j];	
	    	}
	    }
	    System.out.println("총합 : "+sum);
	    System.out.println("학점 평균 : "+sum/average);

//	    count변수를 하나 선언해서 반복문 안에 count++로
//	       반복문이 돌 때 마다 개수를 하나씩 올려서
//	       합계를 나누어 평균을 구하는 방법도 있음!
	    
	    
	    scan.close();
	}

}
