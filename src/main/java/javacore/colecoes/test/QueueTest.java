package javacore.colecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    static void main() {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("C");
        queue.add("D");
        queue.add("A");
        queue.add("B");
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.offer("e")); // igual o add
    }
}
