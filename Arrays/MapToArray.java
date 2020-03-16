import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapToArray {

	public static void main(String[] args) {
		Map<Integer, String> studentmap = new HashMap<>();
		studentmap.put(1, "John");
		studentmap.put(2, "Rob");
		studentmap.put(3, "Mark");
		studentmap.put(4, "Jill");
		studentmap.put(5, "Jack");
		String [] output = convertToArray(studentmap);
		for(int i=0; i<output.length;i++) {
			System.out.println(output[i]);
		}
	}

	private static String[] convertToArray(Map<Integer, String> studentmap) {
		Collection<String> student = studentmap.values();
		String [] targetArray = student.toArray(new String[student.size()]);
		return targetArray;
	}

}
