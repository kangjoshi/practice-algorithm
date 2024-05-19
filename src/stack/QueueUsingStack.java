package stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;

/**
 * 스택을 이용한 큐 구현
 * - 스택을 이용해 다음 연산을 지원하는 큐를 구현
 * 조건
 *  - push(x): 엘리먼트 x를 큐 마지막에 삽입
 *  - pop(): 큐 터음에 있는 엘리먼트 제거
 *  - peek(): 큐 처음에 있는 엘리먼트 조회
 *  - empty(): 큐가 비어 있는지 여부 리턴
 * */

public class QueueUsingStack {

    public static void main(String[] args) {
        var queue = new MyQueue<Integer>();

        queue.push(1);
        queue.push(2);
        System.out.println(queue.pop()); // 1
        queue.push(3);
        System.out.println(queue.peek()); // 2
        System.out.println(queue.pop()); // 2
        System.out.println(queue.empty()); // false
    }

    /**
     * 시도
     * - push 할 때 정렬 - 안됨. 계속 결과가 뒤집힘.
     * - pop, peek에서 결과 정리
     * 풀이
     * - 시도와 동일
     * 회고
     * -
     * */
    static class MyQueue<E> {
        Deque<E> input;
        Deque<E> output;

        MyQueue() {
            input = new ArrayDeque<>();
            output = new ArrayDeque<>();
        }

        public void push(E e) {
            input.push(e);
        }

        public E pop() {
            peek();
            return output.pop();
        }

        public E peek() {
            // out 스택에 결과가 없는 경우만 (이 조건이 없다면 input에 있는 상위 값이 상단으로 오기 때문에 원하는 결과가 아님.)
            if (output.isEmpty()) {
                while (!input.isEmpty()) {
                    output.push(input.pop());
                }
            }
            return output.peek();
        }

        public boolean empty() {
            return input.isEmpty() && output.isEmpty();
        }
    }
}
