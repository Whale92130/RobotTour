import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(346);
		q.enqueue(99);
		for (int i =0; i< 3; i++) {
		System.out.println(q.dequeue());
		}
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
