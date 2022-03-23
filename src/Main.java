import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        SimplePriorityQueue<Integer> simplePriorityQueue = new SimplePriorityQueue<>();
        LinkedHashMap<Integer, Integer> testData = new LinkedHashMap<>();
        testData.put(2, 6);
        testData.put(1, 5);
        testData.put(4, 8);
        testData.put(3, 7);
        testData.forEach(simplePriorityQueue::insert);

        System.out.println(simplePriorityQueue);

        System.out.println("the element with highest priority in the queue");
        System.out.println(simplePriorityQueue.min());

        System.out.println("remove and return the element with highest priority in the queue");
        System.out.println(simplePriorityQueue.removeMin());
        System.out.println(simplePriorityQueue);
    }
}
