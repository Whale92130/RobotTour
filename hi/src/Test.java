import java.util.ArrayList;

import org.w3c.dom.Node;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(346);
		q.enqueue(99);
		for (int i = 0; i < 3; i++) {
			System.out.println(q.dequeue());

		}
		Maze maze = new Maze();
		System.out.println(maze.getNeighbors(0, 0).get(0));
		System.out.println(maze.getNeighbors(0, 0).get(1));
		System.out.println(maze.getNeighbors(0, 0).get(2));
		System.out.println(maze.getNeighbors(0, 0).get(3));
	}

	public static ArrayList<Integer> bfs(int start, int end) {
		ArrayList<Integer> visited = new ArrayList<>();
		Queue queue = new Queue();
		queue.enqueue(start);
		visited.add(start);
		while (!queue.isEmpty()) {

		}
		return visited;
	}

}