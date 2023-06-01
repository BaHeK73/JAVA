import java.util.LinkedList;
import java.util.Queue;

interface QueueBehaviour<T> {
    boolean isEmpty();
    int size();
    void enqueue(T item);
    T dequeue();
    T peek();
}

interface MarketBehaviour {
    void acceptOrder(Order order);
    boolean hasOrders();
    Order getNextOrder();
}

public class Market implements QueueBehaviour<Customer>, MarketBehaviour {

    private Queue<Customer> queue;
    private Queue<Order> orders;

    public Market() {
        this.queue = new LinkedList<>();
        this.orders = new LinkedList<>();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public void enqueue(Customer item) {
        queue.add(item);
    }

    @Override
    public Customer dequeue() {
        return queue.poll();
    }

    @Override
    public Customer peek() {
        return queue.peek();
    }

    @Override
    public void acceptOrder(Order order) {
        orders.add(order);
    }

    @Override
    public boolean hasOrders() {
        return !orders.isEmpty();
    }

    @Override
    public Order getNextOrder() {
        return orders.poll();
    }
}
