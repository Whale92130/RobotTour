import java.util.ArrayList;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}

	public static ArrayList<Integer> bfs(int start, int end) {
		Maze maze = new Maze();
		ArrayList<Integer> visited = new ArrayList<>();
		Queue queue = new Queue();
		queue.enqueue(start);
		visited.add(start);
		maze.setNodeVisited(start, true);
		while (!queue.isEmpty()) {
			queue.enqueueAll((maze.getNodeByIndex(start).getNeighbors()));
		}
		return visited;
	}

}