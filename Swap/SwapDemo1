/**
 * Swapping Two Objects when member is known
 *
 */
public class SwapDemo1 {

	public static void main(String[] args) {
		SwapDemo x = new SwapDemo();
		Car c1 = x.new Car(1);
		Car c2 = x.new Car(2);
		
		swap(c1,c2);
		System.out.println("c1.number"+c1.number);
		System.out.println("c2.number"+c2.number);
	}
	private static void swap(Car c1, Car c2) {
		int temp = c1.number;
		c1.number = c2.number;
		c2.number = temp;
	}
	class Car{
		int number;
		Car(int number)
		{
			this.number = number;
		}
	}
}
