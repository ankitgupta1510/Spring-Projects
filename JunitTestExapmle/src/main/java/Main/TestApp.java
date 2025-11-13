package Main;

import com.company.calc.Operation;

public class TestApp {
//	public static int sum(int a, int b) {
//		return a+b;
//	}
	
	public static void main(String[] args) {
//		System.out.println(sum(5,6));
		Operation add = new Operation() {
			
			@Override
			public int operationType(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
//		
//		Operation add= (a,b)->a+b;
//		Operation subs = (a,b)->a-b;
//		System.out.println(subs.operationType(5, 6000));
		
	}

}
