package test200703;

public class E02_ForExample01 {

	public static void main(String[] args) {
		// 3~9���� ����ϱ�
		/*  for (int num =3; num<=9; num++ ) {
			System.out.println(num);
		    }    */
		
		
		// 1���� 10���� ���� ��� ���
		int sum = 0;
		
		for (int num = 1; num <=10; num++) {
			sum+=num;  //sum=sum+num
		   if(num<=9) {
			 System.out.print(num+"+");
		   }else if (num==10) {
			 System.out.print(num+"=");
			//System.out.print(num);
			   }
			
		} System.out.print(sum);
		  //System.out.print("="+sum);
		
		//������ ��� ���� 55�� ���������� ���
	    /* ���� ��� �޼ҵ尡 for�� �ȿ� ������
	       sum+=num�� ��� 
	       �ִ� �ݺ����� ��� ���*/



		
	}

}
