import java.util.ArrayList;


public class Maze{
	Node[][] maze = new Node[4][4];
	
	Maze() {
		for (int i = 0; i < maze.length; i++) {
			for (int o = 0; o < maze[0].length; o++) {
				maze[i][o] = new Node();
				maze[i][o].setX(i);
				maze[i][o].setY(o);
				maze[i][o].setVisited(false);
			}
		}
	}
	ArrayList<Node> getNeighbors(int x, int y) {
		
		ArrayList<Node> neighbors = new ArrayList<Node>();
		
		//get top
		if (y+1 < 4) {
			Integer[] nums = new Integer[2];
			nums[0] = x;
			nums[1] = y+1;
			neighbors.add(maze[nums[0]][nums[1]]);
		}
		else {
			neighbors.add(null);
		}
		//get bottom
		if (y-1 > 0) {
			Integer[] nums = new Integer[2];
			nums[0] = x;
			nums[1] = y-1;
			neighbors.add(maze[nums[0]][nums[1]]);
		}
		else {
			neighbors.add(null);
		}
		//get right
		if (x+1 < 4) {
			Integer[] nums = new Integer[2];
			nums[0] = x+1;
			nums[1] = y;
			neighbors.add(maze[nums[0]][nums[1]]);
		}
		else {
			neighbors.add(null);
		}
		//get right
		if (x-1 > 0) {
			Integer[] nums = new Integer[2];
			nums[0] = x-1;
			nums[1] = y;
			neighbors.add(maze[nums[0]][nums[1]]);
		}
		else {
			neighbors.add(null);
		}
		
		return neighbors;
		
	}
	
}