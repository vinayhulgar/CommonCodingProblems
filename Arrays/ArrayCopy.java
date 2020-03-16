
public class ArrayCopy {

	public static void main(String[] args) {
		int integers[] = {0,1,2,3,4};
		int newintegers[] = new int[integers.length + 1];
		System.arraycopy(integers, 0, newintegers, 0, integers.length);
		integers = newintegers;
		integers[5] = 5;
		for(int i=0;i<integers.length;i++){
			System.out.println("Integers"+integers[i]);
		}
		for(int j=0;j<newintegers.length;j++){
			System.out.println("NewIntegers"+newintegers[j]);
		}
		
	}

}
