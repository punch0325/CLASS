package test200630;

public class B02_LogicalOperator {

	public static void main(String[] args) {

		boolean var1, var2, var3;
		var1 = false;
		var2 = false;
		var3 = false;
		
//AND ����
		var3 = var1 && var2;
		System.out.println(var3);// false

		var2 = true;
		var3 = var1 && var2;
		System.out.println(var3);// false
        
		var3 = (7>3) && (3<1);
		System.out.println(var3);
		
//OR ����
		var3= var1||var2;
		System.out.println(var3);//true
		
		var2= false;
		var3 = var1||var2;
		System.out.println(var3);//false
		
//NOT ����	
		System.out.println("NOT������ ��� �� : "+var2);
		var2=!var2; 
		System.out.println("NOT������ ��� �� : "+var2);
		
	}

}
