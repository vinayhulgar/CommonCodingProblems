
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class SaleProductsTest {

	private SaleProducts salesItems;
	 
    @Before
    public void setup() {
        salesItems = new SaleProducts(Arrays.asList(
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
    public void groupByTypeWithCounts() {
    	
        Map<FruitType, Long> groupByItems = salesItems.groupByTypeWithCounts();
        System.out.println("groupByTypeWithCounts: " + groupByItems);
        assertEquals(3, groupByItems.get(FruitType.APPLE).intValue());
        assertEquals(2, groupByItems.get(FruitType.BANANA).intValue());
        assertEquals(1, groupByItems.get(FruitType.ORANGE).intValue());
        assertEquals(1, groupByItems.get(FruitType.PAPAYA).intValue());
        assertEquals(1, groupByItems.get(FruitType.WATERMELON).intValue());
    }
     
 
    @Test
    public void groupByType() {
    	
    	Map<FruitType, List<Fruit>> spCategores = salesItems.groupByType();
        System.out.println("groupByType: " + spCategores);
        assertEquals(1, spCategores.get(FruitType.PAPAYA).size());
        assertEquals(2, spCategores.get(FruitType.BANANA).size());
        assertEquals(3, spCategores.get(FruitType.APPLE).size());
    }
 
    @Test
    public void groupByLikes_lambda() {
    	
    	Map<FruitType, List<Fruit>> spCategores = salesItems.groupByType_lambda();
        System.out.println("groupByType: " + spCategores);
        assertEquals(1, spCategores.get(FruitType.PAPAYA).size());
        assertEquals(2, spCategores.get(FruitType.BANANA).size());
        assertEquals(3, spCategores.get(FruitType.APPLE).size());
    }
    @Test
    public void groupByLikes() {
    
    	Map<Integer, List<Fruit>> groupByItems = salesItems.groupByLikes();
        System.out.println("groupByLikes: " + groupByItems);
        assertEquals(3, groupByItems.get(new Integer(2)).size());
        assertEquals(1, groupByItems.get(new Integer(4)).size());
        assertEquals(1, groupByItems.get(new Integer(3)).size());
        assertEquals(1, groupByItems.get(new Integer(1)).size());
        assertEquals(2, groupByItems.get(new Integer(5)).size());
    }
    @Test
    public void groupByTypeConcrrently() {
    	
    	Map<FruitType, List<Fruit>> groupByItems = salesItems.groupByTypeConcrrently();
        System.out.println("groupByTypeConcrrently: " + groupByItems);
        assertEquals(1, groupByItems.get(FruitType.PAPAYA).size());
        assertEquals(2, groupByItems.get(FruitType.BANANA).size());
        assertEquals(3, groupByItems.get(FruitType.APPLE).size());
    }
 
    @Test
    public void groupByTypeToSet() {
    	
    	Map<FruitType, Set<Fruit>> groupByItems = salesItems.groupByTypeToSet();
        System.out.println("groupByTypeConcrrently: " + groupByItems);
        assertEquals(1, groupByItems.get(FruitType.PAPAYA).size());
        assertEquals(2, groupByItems.get(FruitType.BANANA).size());
        assertEquals(3, groupByItems.get(FruitType.APPLE).size());
 
    }
 
    @Test
    public void groupByQuantity() {
    
    	Map<Integer, List<Fruit>> groupByItems = salesItems.groupByQuantity();
        System.out.println("groupByQuantity: " + groupByItems);
        assertEquals(6, groupByItems.get(10).size());
        assertEquals(2, groupByItems.get(20).size());
    }
 
    @Test
    public void groupByLikesWithCounts() {
    	
    	Map<Integer, Long> groupByItems = salesItems.groupByLikesWithCounts();
        System.out.println("groupByLikesWithCounts: " + groupByItems);
        assertEquals(2, groupByItems.get(new Integer(5)).intValue());
        assertEquals(1, groupByItems.get(new Integer(4)).intValue());
        assertEquals(1, groupByItems.get(new Integer(3)).intValue());
        assertEquals(3, groupByItems.get(new Integer(2)).intValue());
        assertEquals(1, groupByItems.get(new Integer(1)).intValue());
 
    }
 
    @Test
    public void groupByTypeAndLike() {
    
    	Map<String, List<Fruit>> groupByItems = salesItems.groupByTypeAndLike();
        System.out.println("groupByTypeAndLike: " + groupByItems);
 
        assertEquals(1, groupByItems.get(FruitType.PAPAYA.name() + 1).size());
        assertEquals(1, groupByItems.get(FruitType.APPLE.name() + 3).size());
        assertEquals(2, groupByItems.get(FruitType.APPLE.name() + 5).size());
        assertEquals(1, groupByItems.get(FruitType.ORANGE.name() + 4).size());
        assertEquals(2, groupByItems.get(FruitType.BANANA.name() + 2).size());
    }
 
    @Test
    public void groupByTypeAndLike_2() {
    	
    	Map<FruitType, Map<Integer, List<Fruit>>> groupByItems = salesItems.groupByTypeAndLike_2();
        System.out.println("groupByTypeAndLike_2: " + groupByItems);
        assertEquals(1, groupByItems.get(FruitType.PAPAYA).get(new Integer(1)).size());
        assertEquals(1, groupByItems.get(FruitType.APPLE).get(new Integer(3)).size());
        assertEquals(2, groupByItems.get(FruitType.APPLE).get(new Integer(5)).size());
        assertEquals(1, groupByItems.get(FruitType.ORANGE).get(new Integer(4)).size());
        assertEquals(2, groupByItems.get(FruitType.BANANA).get(new Integer(2)).size());
    }
 
    @Test
    public void groupByTypeQuantity() {
    
    	Map<TypeQuantity, List<Fruit>> groupByItems = salesItems.groupByTypeQuantity();
        System.out.println("groupByTypeQuantity: " + groupByItems);
        assertEquals(1, groupByItems.get(new TypeQuantity(FruitType.PAPAYA, 20)).size());
        assertEquals(3, groupByItems.get(new TypeQuantity(FruitType.APPLE, 10)).size());
        assertEquals(1, groupByItems.get(new TypeQuantity(FruitType.BANANA, 10)).size());
        assertEquals(1, groupByItems.get(new TypeQuantity(FruitType.BANANA, 20)).size());
    }
 
    @Test
    public void groupByTypeWithQuantitySum() {
    	
    	Map<FruitType, Integer> groupByItems = salesItems.groupByTypeWithQuantitySum();
        System.out.println("groupByTypeWithQuantitySum" + groupByItems);
        assertEquals(30, groupByItems.get(FruitType.APPLE).intValue());
        assertEquals(30, groupByItems.get(FruitType.BANANA).intValue());
        assertEquals(10, groupByItems.get(FruitType.ORANGE).intValue());
        assertEquals(20, groupByItems.get(FruitType.PAPAYA).intValue());
        assertEquals(10, groupByItems.get(FruitType.WATERMELON).intValue());
    }
 
    @Test
    public void groupByTypeWithTotalSum() {
    
    	Map<FruitType, Double> groupByItems = salesItems.groupByTypeWithTotalSum();
        System.out.println("groupByTypeWithTotalSum" + groupByItems);
        assertEquals(240, groupByItems.get(FruitType.APPLE).intValue());
        assertEquals(550, groupByItems.get(FruitType.BANANA).intValue());
        assertEquals(300, groupByItems.get(FruitType.ORANGE).intValue());
        assertEquals(200, groupByItems.get(FruitType.PAPAYA).intValue());
        assertEquals(300, groupByItems.get(FruitType.WATERMELON).intValue());
    }
     
    @Test
    public void groupByTypeWithAverageSum() {
    	
    	Map<FruitType, Double> groupByItems = salesItems.groupByTypeWithAverageSum();
        System.out.println("groupByTypeWithAverageSum" + groupByItems);
        assertEquals(80, groupByItems.get(FruitType.APPLE).intValue());
        assertEquals(275, groupByItems.get(FruitType.BANANA).intValue());
        assertEquals(300, groupByItems.get(FruitType.ORANGE).intValue());
        assertEquals(200, groupByItems.get(FruitType.PAPAYA).intValue());
        assertEquals(300, groupByItems.get(FruitType.WATERMELON).intValue());
    }
     
    @Test
    public void groupByType_TotalSummary() {
    	
    	Map<FruitType, DoubleSummaryStatistics> groupByItems = salesItems.groupByType_TotalSummary();
        System.out.println("groupByType_TotalSummary" + groupByItems);
         
        assertEquals(3, groupByItems.get(FruitType.APPLE).getCount());
        assertEquals(240, groupByItems.get(FruitType.APPLE).getSum(),0);
        assertEquals(80, groupByItems.get(FruitType.APPLE).getAverage(),0);
        assertEquals(100, groupByItems.get(FruitType.APPLE).getMax(),0);
        assertEquals(60, groupByItems.get(FruitType.APPLE).getMin(),0);
    }

}
