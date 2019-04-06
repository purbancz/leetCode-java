package leetCode.Easy;

public class Main {

	public static void main(String[] args) {

		NumberOfRecentCalls obj = new NumberOfRecentCalls();
		int param_1 = obj.pingrev(1);
		int param_2 = obj.pingrev(100);
		int param_3 = obj.pingrev(3001);
		int param_4 = obj.pingrev(3002);
		int param_5 = obj.pingrev(7002);
		int param_6 = obj.pingrev(10001);
		
		System.out.println(param_1);
		System.out.println(param_2);
		System.out.println(param_3);
		System.out.println(param_4);
		System.out.println(param_5);
		System.out.println(param_6);
		
		

	}

}
