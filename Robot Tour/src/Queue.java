import java.util.ArrayList;

public class Queue {
	ArrayList<Integer> arr = new ArrayList<Integer>();
	
	Queue() {
		
	}
	
	void enqueue(int num) {
		arr.add(num);
	}
	int dequeue() {
		return arr.remove(0);
	}
	int size() {
		return arr.size();
	}
	boolean isEmpty() {
		return arr.isEmpty();
	}

}
