/*
 * Armstrong Number which satisfies following equation:
 *	xy...z = x^n + y^n + .. +z^n
 * Example: 370
 * 3*3*3 + 7*7*7 + 0*0*0 = 27 + 343 + 0 = 370
 *	
*/
public class Armstrong {

	public static void main(String[] args) {
		int num = 370;
		int number;
		int temp;
		int total=0;
		
		number = num;
		while(number !=0){
			temp = number%10;
			total = total + temp*temp*temp;
			number /= 10;
		}
	
		if(total == num){
			System.out.println(num+" is an Armstrong Number");
		}
		else{
			System.out.println(num+" is not an Armstrong Number");
		}
	
	}


}
