import java.util.ArrayList;


public class Maze{
	Node[][] maze = new Node[4][4];
	
	Maze() {
		int index= 0;
		for (int i = 0; i < maze.length; i++) {
			for (int o = 0; o < maze[0].length; o++) {
				maze[i][o] = new Node(i, o, index);
				maze[i][o].setVisited(false);
				//System.out.println(maze[i][o].getIndex());
				index++;
			}
		}
	}
	ArrayList<Integer> getNeighbors(int nodeX, int nodeY) {
		
		ArrayList<Integer> neighbors = new ArrayList<Integer>();
		
		//get top
		if (nodeY+1 < 4) {
			int x;
			int y;
			x = nodeX;
			y = nodeY+1;
			neighbors.add(maze[x][y].getIndex());
		}
		//get bottom
		if (nodeY-1 >= 0) {
			int x;
			int y;
			x = nodeX;
			y = nodeY-1;
			neighbors.add(maze[x][y].getIndex());
		}
		//get right
		if (nodeX+1 < 4) {
			int x;
			int y;
			x = nodeX+1;
			y = nodeY;
			neighbors.add(maze[x][y].getIndex());
		}
		//get right
		if (nodeX-1 >= 0) {
			int x;
			int y;
			x = nodeX-1;
			y = nodeY;
			neighbors.add(maze[x][y].getIndex());
		}
		
		
		return neighbors;
		
	}
	void setNodeVisited(int index, boolean state) {
		for (int i = 0; i < maze.length; i++) {
			for (int o = 0; o < maze[0].length; o++) {
				if (maze[i][o].getIndex() == index) {
					maze[i][o].setVisited(state);
				}
			}
		}
	}
	Node getNodeByIndex(int index) {
		for (int i = 0; i < maze.length; i++) {
			for (int o = 0; o < maze[0].length; o++) {
				if (maze[i][o].getIndex() == index) {
					return maze[i][o];
				}
			}
		}
		return null;
	}
	
}