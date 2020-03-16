import java.util.ArrayList;

/*
Representing Graph with 3 with 3 vertices, numbered 0 to 2. In addition,
let's assume there are 3 edges in the graph (0, 1), (1, 2), and (2, 0), 
where a pair of vertices represents an edge.
We can represent the edges in a 2-D ArrayList by creating and populating an ArrayList of ArrayLists
*/
public class TwoDimentionalArrayList {
	
	public static void main(String [] args) {
		int vertexCount = 3;
		ArrayList<ArrayList<Integer>> graph = new ArrayList();
		
		for(int i =0; i< vertexCount;i++) {
			graph.add(new ArrayList<>());
		}
		graph.get(0).add(1);
		graph.get(1).add(2);
		graph.get(2).add(0);
		
		graph.get(1).add(0);
		graph.get(2).add(1);
		graph.get(0).add(2);
		
		int vertexCount1 = graph.size();
		
		for(int i =0; i< vertexCount;i++) {
			int edgeCount = graph.get(i).size();
			for(int j=0; j<edgeCount;j++) {
				Integer startVertex = i;
				Integer endVertex = graph.get(i).get(j);
				System.out.printf("Vertex %d is connected to vertex %d%n", startVertex, endVertex);
			}
		}
		
	}
}
