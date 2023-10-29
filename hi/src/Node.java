
public class Node {
	boolean visisted;
	public int x;
	public int y;

	Node() {
		
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
}
