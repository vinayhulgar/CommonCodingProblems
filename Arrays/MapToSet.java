import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapToSet {

	public static void main(String[] args) {
		Map<Integer, String> sourceMap = new HashMap<>();
		sourceMap.put(100, "ABC");
		sourceMap.put(101, "PQR");
		sourceMap.put(102, "XYZ");
		
		Set<String> targetset = mapToSet(sourceMap);
		System.out.println(targetset);
	}

	private static Set<String> mapToSet(Map<Integer, String> sourceMap) {
		Set<String> target = new HashSet<>(sourceMap.values());
		return target;
	}

}
