import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class GroupByPriorJDK8Test {
	private GroupBy_PriorJDK8 salesItems;
	
	@Before
	public void setup() {
		salesItems = new GroupBy_PriorJDK8(Arrays.asList(
                new Fruit(1, "Fuji", FruitType.APPLE, 10, new BigDecimal("10"), 3),
                new Fruit(2, "Apple Banana", FruitType.BANANA, 20, new BigDecimal("20"), 2),
                new Fruit(3, "Mandarin Orange", FruitType.ORANGE, 10, new BigDecimal("30"), 4),
                new Fruit(4, "Seedless Watermelon", FruitType.WATERMELON, 10, new BigDecimal("30"), 2),
                new Fruit(5, "Papaya", FruitType.PAPAYA, 20, new BigDecimal("10"), 1),
                new Fruit(6, "Gala", FruitType.APPLE, 10, new BigDecimal("8"), 5),
                new Fruit(7, "Cuban Red Banana", FruitType.BANANA, 10, new BigDecimal("15"), 2),
                new Fruit(8, "Golden Delicious", FruitType.APPLE, 10, new BigDecimal("6"), 5)));
	}
	
	 @Test
	    public void groupByType_PriorJava8() {
	        Map<FruitType, List<Fruit>> groupByItems = salesItems.groupByType();
	        System.out.println("groupByType_priorJava8: " + groupByItems);
	        assertEquals(1, groupByItems.get(FruitType.PAPAYA).size());
	        assertEquals(2, groupByItems.get(FruitType.BANANA).size());
	        assertEquals(3, groupByItems.get(FruitType.APPLE).size());
	    }

}
