```
/**
 * Swapping Two Objects without using temp variable
 *
 */
public class SwapDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		swap(a,b);
		
	}
	private static void swap(int a, int b) {
		a = a+b;//30
		b = a-b;// 10
		a = a-b;
		System.out.println("a= "+a+"b= "+b);
		
	}
	
}

```
