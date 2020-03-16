import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseArray {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  inputNum = br.readLine();                // Reading input from STDIN
        int intsize = Integer.parseInt(inputNum.substring(0,1));
        int inputarr = Integer.parseInt(inputNum.substring(1));
        Integer [] arr = new Integer[intsize];
        for(int i=0;i<intsize;i++){
            arr[i] =  inputarr;
        }
        
        for(int j=arr.length;j>0;j--){
            System.out.println(arr[j]);
        }
	}

}
