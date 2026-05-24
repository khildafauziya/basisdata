import java.util.LinkedList;
import java.util.Queue;
public class MainQueue {
public static void main(String[] args) {
Queue queue = new LinkedList<>();
System.out.println("Proses Enqueue FIFO:");
int[] data = {15, 25, 35, 45, 55, 65, 75, 85};
for (int item : data) {
queue.add(item);
System.out.println("Enqueue " + item);
}
System.out.println("Isi Queue sebelum Dequeue: " + queue);
System.out.println("Proses Dequeue FIFO:");
System.out.println("Dequeue " + queue.poll());
System.out.println("Dequeue " + queue.poll());
System.out.println("Isi Queue sesudah Dequeue: " + queue);
}
}