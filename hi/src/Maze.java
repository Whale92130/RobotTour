import java.util.ArrayList;

public class Maze {
	Nodes[][] maze = new Nodes[4][4];
	Maze() {
		
	}
	ArrayList<Integer> getNeighbors(int x, int y) {
		ArrayList<Integer[]> neighbors = new ArrayList<Integer[]>();
		//get top
		if (y+1 < 4) {
			Integer[] nums = new Integer[2];
			nums[0] = x;
			nums[1] = y+1;
			neighbors.add(nums);
		}
		//get bottom
		if (y-1 < 0) {
			Integer[] nums = new Integer[2];
			nums[0] = x;
			nums[1] = y-1;
			neighbors.add(nums);
		}
		//get right
		if (x+1 < 4) {
			Integer[] nums = new Integer[2];
			nums[0] = x+1;
			nums[1] = y;
			neighbors.add(nums);
		}
		//get right
		if (x-1 < 4) {
			Integer[] nums = new Integer[2];
			nums[0] = x-1;
			nums[1] = y;
			neighbors.add(nums);
		}
		
		return null;
		
	}
	
}