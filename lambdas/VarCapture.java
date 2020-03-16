public class VarCapture {

	public static void main(String[] args) {
		
		// A local variable that can be captured.
		int num = 10;
		
		MyFunc mylambda = (n) -> {
			// This use of num is OK, it does not modify num.
			int v = num + n;
			
			// it is illegal, cax it tries to modify num
			//num++;
			
			// even this causes error
			//num =9;
			
			return v;
			
		};
		
		
		
		
		
	}

}
