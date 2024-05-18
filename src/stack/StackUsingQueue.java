package stack;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 큐를 이용한 스택 구현
 * - 큐를 이용해 다은 연산을 지원하는 스택을 구현
 * 조건
 *  - push(x): 엘리먼트 x를 스택에 삽입
 *  - pop(): 스택의 첫 번째 엘리먼트를 삭제
 *  - top(): 첫 번째 엘리먼트를 가져온다.
 *  - empty(): 비어 있는지 여부를 리턴
  * */

public class StackUsingQueue {

    public static void main(String[] args) {
        var stack = new MyStack<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
    }

    /**
     * 시도
     * - pop, top을 호출시 재정렬
     * 풀이
     * - push할 때 재정렬
     * 회고
     * - push할 때 재정렬이 좋을 것 같다.. 보통 쓰기 보다는 읽기 동작이 많으므로..
     * - 풀이할 때도 실무와 연관이 있도록 생각하면서 풀이하자.
     * */
    static class MyStack<E> {
        Queue<E> queue;

        MyStack() {
            queue = new LinkedList<>();
        }

        public void push(E e) {
            queue.offer(e);
            for (int i = 1; i < queue.size(); i++) {
                queue.offer(queue.poll());
            }
        }

        public E pop() {
            /*var newQueue = new LinkedList<E>();

            while (queue.size() > 1) {
                newQueue.offer(queue.poll());
            }

            var node = queue.poll();
            queue.addAll(newQueue);
            return node;*/

            return queue.poll();
        }

        public E top() {
            /*var node = pop();
            queue.offer(node);
            return node;*/
            return queue.peek();
        }

        public boolean empty() {
            return queue.isEmpty();
        }



    }
}
