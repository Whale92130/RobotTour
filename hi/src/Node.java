import java.util.ArrayList;

public class Node {
	boolean visisted;
	public int x;
	public int y;
	int index;
	Node(int x, int y, int index) {
		this.index = index;
		this.x = x;
		this.y = y;
	}

	public boolean wasVisited() {
		return visisted;
	}

	public void setVisited(boolean is) {
		this.visisted = is;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getIndex() {
		return index;
	}
	public ArrayList<Integer> getNeighbors() {
		Maze maze = new Maze();
		return maze.getNeighbors(x, y);
		
	}
}
