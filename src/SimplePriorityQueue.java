/**
 * @author YFCodeDream
 * @version 1.0.0
 * @date 2022/3/23
 * @description 链表为底层结构的优先队列
 */
public class SimplePriorityQueue<T> {
    private final LinkedSimplePriorityList<T> linkedSimplePriorityList;

    public SimplePriorityQueue() {
        linkedSimplePriorityList = new LinkedSimplePriorityList<>();
    }

    public T min() {
        return linkedSimplePriorityList.getHeadValue();
    }

    public void insert(int k, T x) {
        linkedSimplePriorityList.addWithPriority(k, x);
    }

    public T removeMin() {
        return linkedSimplePriorityList.removeHead();
    }

    @Override
    public String toString() {
        return "SimplePriorityQueue{" +
                "linkedSimplePriorityList=" + linkedSimplePriorityList +
                '}';
    }
}
