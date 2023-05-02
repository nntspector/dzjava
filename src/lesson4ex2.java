import java.util.LinkedList;
/*
Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент
fиз очереди, не удаляя.
 */
public class lesson4ex2 {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        queue.enqueue("first");
        queue.enqueue("second");
        queue.enqueue("third");

        System.out.println("First element in queue: " + queue.first());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("First element in queue: " + queue.first());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("First element in queue: " + queue.first());
    }

    public static class Queue<T> {
        private LinkedList<T> list = new LinkedList<>();

        public void enqueue(T item) {
            list.addLast(item);
        }

        public T dequeue() {
            return list.poll();
        }

        public T first() {
            return list.peek();
        }

    }
}


