import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maze maze = new Maze();
		System.out.println(maze.getNeighbors(0, 0));
		Node node = new Node(0,0,0); 
		ArrayList<Integer> graph = reconstructPath(0, 5, bfs(0,5));
		for (int i = 0; i < graph.size(); i++) {
			System.out.println("prev " + i  + ": " + graph.get(i));
		}
	}

	public static Integer[] bfs(int start, int end) {
		Maze maze = new Maze();
		Queue queue = new Queue();
		queue.enqueue(start);
		Boolean[] visited = new Boolean[16];
		for (int i = 0; i<visited.length; i++) {
			visited[i] = false;
		}
		visited[start] = true;
		Integer[] prev = new Integer[16];
		for (int i = 0; i<prev.length; i++) {
			prev[i] = -1;
		}
		while (!queue.isEmpty()) {
	
			int node = queue.dequeue();
			ArrayList<Integer> nei = maze.getNodeByIndex(node).getNeighbors();

			for (int i = 0; i < nei.size(); i++) {
				if (visited[i] == false) {
					queue.enqueue(nei.get(i));
					visited[i] = true;
					prev[i] = node;
				}
			}
			
		}
		System.out.println("");
		for (int i = 0; i < prev.length; i++) {
			System.out.println("prev " + i  + ": " + prev[i]);
		}
		return prev;
	}
	public static ArrayList<Integer> reconstructPath(int start, int end, Integer[] prev) {
		ArrayList<Integer> path = new ArrayList<Integer>();
		Maze maze = new Maze();
		int at = end;
		while(at!=-1) {
			at=prev[at];
			path.add(at);
		}
		Collections.reverse(path);
		if (path.get(0) == start) {
			return path;
		}
		else {
			return null;
		}
	}

}