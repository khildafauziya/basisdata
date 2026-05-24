import java.util.Stack;
public class MainStack {
public static void main(String[] args) {
Stack stack = new Stack<>();
System.out.println("Proses Push LIFO:");
int[] data = {10, 20, 30, 40, 50, 60, 70, 80};
for (int item : data) {
stack.push(item);
System.out.println("Push " + item);
}
System.out.println("Isi Stack sebelum Pop: " + stack);
System.out.println("Proses Pop LIFO:");
System.out.println("Pop " + stack.pop());
System.out.println("Pop " + stack.pop());
System.out.println("Isi Stack sesudah Pop: " + stack);
}
}