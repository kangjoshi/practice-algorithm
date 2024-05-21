package stack_queue;

/**
 * 원형 큐 디자인
 * -원형 큐를 디자인
 * 조건
 *  -  큐가 비어 있다면 -1을 리턴
 * */

public class CircularQueue {

    /*
    * 원형 큐(또는 버퍼)에 size를 지정
      front: 원형 큐의 시작 head
      rear: 원형 큐의 마지막 tail
      enqueue: 큐에 새로운 자료를 추가하는 연산
      dequeue: 큐에서 먼저 들어온 자료를 제거하는 연산
    * */
    public static void main(String[] args) {
        var queue = new MyCircularQueue<Integer>(5);

        queue.enQueue(10); // true
        queue.enQueue(20); // true
        queue.enQueue(30); // true
        queue.enQueue(40); // true

        System.out.println(queue.rear()); // 40
        System.out.println(queue.isFull()); // false

        System.out.println(queue.deQueue()); // true
        System.out.println(queue.deQueue()); // true

        queue.enQueue(50); // true
        queue.enQueue(60); // ture


        System.out.println(queue.rear()); // 60
        queue.enQueue(70); // true  데이터 덮어 쓰기?

        System.out.println(queue.isFull()); // true
        System.out.println(queue.front()); // 30
    }

    /**
     * 시도
     * - 원형 큐 성격 보고 구현
     * 풀이
     * - 시도와 비슷, 조금 더 코드 보강
     * 회고
     * - 원형 큐는 사실 잘 몰랐음..
     * */

    static class MyCircularQueue<E> {
        private Object[] elements;
        private int front, rear = -1, size;

        MyCircularQueue(int size) {
            elements = new Object[size];
        }

        public boolean enQueue(E e) {
            if (!this.isFull()) {
                rear = (rear + 1) % elements.length;
                elements[rear] = e;
                size++;
                return true;
            } else {
                return false;
            }
        }

        public boolean deQueue() {
            if (!this.empty()) {
                front = (front + 1) % size;
                size--;
                return true;
            } else {
                return false;
            }
        }

        public E front() {
            return (E) elements[front];
        }

        public E rear() {
            return (E) elements[rear];
        }

        public boolean isFull() {
            return size == elements.length;
        }

        public boolean empty() {
            return size == 0;
        }
    }

}
