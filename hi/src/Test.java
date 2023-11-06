import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node = new Node(0,0,0); 
		ArrayList<Node> graph = reconstructPath(0, 5, bfs(0,5));
		for (int i = 0; i < graph.size(); i++) {
			System.out.println("prev " + i  + ": " + graph.get(i).index);
		}
	}

	public static ArrayList<Node> bfs(int start, int end) {
		Maze maze = new Maze();
		ArrayList<Integer> visited = new ArrayList<Integer>();
		Queue queue = new Queue();
		queue.enqueue(start);
		visited.add(start);
		maze.setNodeVisited(start, true);
		ArrayList<Node> prev = new ArrayList<Node>();
		System.out.println(prev.size());
		while (!queue.isEmpty()) {
	
			Node node = maze.getNodeByIndex(queue.dequeue());
			ArrayList<Integer> nei = node.getNeighbors();

			for (int i = 0; i < nei.size(); i++) {
				if (maze.getNodeByIndex(nei.get(i)).visisted == false) {
					queue.enqueue(nei.get(i));
					visited.add(nei.get(i));
					node.setVisited(true);
					prev.add(node);
				}
			}
			System.out.println("");
			for (int i = 0; i < prev.size(); i++) {
				System.out.println("prev " + i  + ": " + prev.get(i).index);
			}
		}
		return prev;
	}
	public static ArrayList<Node> reconstructPath(int start, int end, ArrayList<Node> prev) {
		ArrayList<Node> path = new ArrayList<Node>();
		Maze maze = new Maze();
		for (int i = 0; i<prev.size(); i++) {
		Node at = maze.getNodeByIndex(end);
		if (at != null) {	
			at = prev.get(end);
		}
		}
		Collections.reverse(path);
		if (path.get(0).getIndex() == start) {
			return path;
		}
		else {
			return null;
		}
	}

}