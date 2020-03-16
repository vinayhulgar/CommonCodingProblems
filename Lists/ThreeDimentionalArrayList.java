import java.util.ArrayList;

/**
 * Representing 3D Space in each point will be represented by three coordinates X, Y & Z
 * Each points have color , lets say RED, GREEN, BLUE
 * Each Point (x,y,z) and its color can be represented by a Three Dimensional ArrayList
 *
 * A (2 x 2 x 2) 3-D space. 
 * It will have eight points: 
 * (0, 0, 0), (0, 0, 1), (0, 1, 0), (0, 1, 1), (1, 0, 0), (1, 0, 1), (1, 1, 0), and (1, 1, 1).
 */
public class ThreeDimentionalArrayList {
		
	public static void main(String [] args) {
		int x_axis_length = 2;
		int y_axis_length = 2;
		int z_axis_length = 2;
		
		
		ArrayList<ArrayList<ArrayList<String>>> space = new ArrayList<>(x_axis_length);
		
		for(int i=0; i< x_axis_length; i++) {
			space.add(new ArrayList<ArrayList<String>>(y_axis_length));
			for(int j=0; j< y_axis_length; j++) {
				space.get(i).add(new ArrayList<String>(z_axis_length));
			}
		}
		
		// Adding Colors to space
		space.get(0).get(1).add(0,"Blue");
		space.get(0).get(1).add(1,"Blue");
		
	}
	

}
