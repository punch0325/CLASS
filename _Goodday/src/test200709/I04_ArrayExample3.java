package test200709;

public class I04_ArrayExample3 {

	public static void main(String[] args) {
		// �迭�� �� �߿��� �ִ� ����ϴ� ��!
		
		
		int[] num = {1,10,3,90,2};
		//num[0] = 1
		//num[1] = 10
		//num[2] = 3
		//num[3] = 90
		//num[4] = 2
		int max = num[0]; // max = 1
			               
		for (int i = 0; i<num.length; i++) {
			if (max<num[i]) { //����° max =1 < num[0]=1
				max=num[i];   //ù��° max =1< num[1]=10
				              //�ι�° max =10 <num[2]=3
				              //����° max=10 <num[3]=90
				              //�׹�° max=90 <num[4]=2
			}                 // max=90
		}
		System.out.println(max);
		

		/*
		 1.�ִ��� ����� ������ �ϳ� ��������(max)
		 2.max ������ num �迭 ���� �� �� �ϳ��� �������־�
		     �ٸ� ����� ���� �� �ְ� �������
		 3.for �ݺ������� �� �ȿ��� num �迭�� ���� ����
		     ��� �ݺ��� �� �ְ� ����� �� ��,
		 4.if������ max�� num[i],�� num[0],num[1],num[2],
		   num[3],num[4] ���� �۴ٸ� max���� �� num[i]����
		     �����϶�� �������
		 5.for�� �ۿ� ��� �޼ҵ带 ����ָ� ���������� ���
		     ���� ū ���� ��� ��! 
		 */
		
		
		
		
		
		
	}

}
