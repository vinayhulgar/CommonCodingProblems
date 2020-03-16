import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

public class SortTestDemo {
	
	@Test
	public void Sortints(){
		final int [] numbers = {-3,-5,1,7, 4,-2 };
		final int [] expected = {-5,-3,-2,1,4,7};
		
		Arrays.sort(numbers);
		assertArrayEquals(expected,numbers);
	}
	@Test
	public void sortObjects(){
		final String[] strings = {"z","x","y","abc","zzz","zazzy"};
		final String[] expected = {"abc","x","y","z","zazzy","zzz"};
		Arrays.sort(strings);
		assertArrayEquals(expected, strings);
	}
	private static class NotComparable {
		private int i;
		private NotComparable(final int i){
			this.i = i;
		}
	}
	
	@Test
	public void sortNotComparable(){
		final List<NotComparable> objects = new ArrayList<>();
		for(int i=0;i<10;i++){
			objects.add(new NotComparable(i));
		}
		try{
			Arrays.sort(objects.toArray());
		}catch(Exception e){
			return;
		}
		fail();
	}
	
}
