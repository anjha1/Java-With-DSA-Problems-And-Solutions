import java.util.LinkedList;
import java.util.Iterator;

public class FullLinkedListMethods {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        // ---------- ADDING ----------
        ll.add(10);                // Add at end
        ll.addFirst(5);            // Add at beginning
        ll.addLast(15);            // Add at end
        ll.add(1, 7);              // Add at index
        ll.offer(20);              // Add at end
        ll.offerFirst(2);          // Add at beginning
        ll.offerLast(25);          // Add at end
        ll.push(99);               // Stack push (add at head)

        // ---------- ACCESSING ----------
        System.out.println("First: " + ll.getFirst());   // Get first element
        System.out.println("Last: " + ll.getLast());     // Get last element
        System.out.println("At index 2: " + ll.get(2));   // Get by index
        System.out.println("Index of 10: " + ll.indexOf(10));
        System.out.println("Last index of 15: " + ll.lastIndexOf(15));

        // ---------- CHECKING ----------
        System.out.println("Contains 15? " + ll.contains(15));
        System.out.println("Is empty? " + ll.isEmpty());
        System.out.println("Size: " + ll.size());

        // ---------- REMOVING ----------
        ll.remove();                  // Remove first
        ll.remove(2);                 // Remove by index
        ll.removeFirst();             // Remove first
        ll.removeLast();              // Remove last
        ll.removeFirstOccurrence(15);
        ll.removeLastOccurrence(20);

        ll.pop();                     // Stack pop (remove head)

        // ---------- POLLING ----------
        System.out.println("Poll: " + ll.poll());             // Remove first or return null
        System.out.println("Poll First: " + ll.pollFirst());
        System.out.println("Poll Last: " + ll.pollLast());

        // ---------- PEEKING ----------
        System.out.println("Peek: " + ll.peek());             // View head or null
        System.out.println("Peek First: " + ll.peekFirst());
        System.out.println("Peek Last: " + ll.peekLast());

        // ---------- ITERATION ----------
        System.out.print("Using for-each: ");
        for (int val : ll) {
            System.out.print(val + " ");
        }

        System.out.print("\nUsing iterator: ");
        Iterator<Integer> itr = ll.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        // ---------- CLONE / COPY ----------
        LinkedList<Integer> copy = (LinkedList<Integer>) ll.clone();
        System.out.println("\nCloned list: " + copy);

        // ---------- CONVERT TO ARRAY ----------
        Object[] array = ll.toArray();
        System.out.print("As array: ");
        for (Object o : array) {
            System.out.print(o + " ");
        }

        // ---------- CLEAR ----------
        ll.clear();
        System.out.println("\nCleared list: " + ll);
    }
}
