package deque;

/**
 * 원형 데크 디자인
 * - 다음 연산을 제공하는 원형 데크를 디자인하라
 * 조건
 *  -
 * */

public class CircularDeque {

    public static void main(String[] args) {

    }
    /**
     * 시도
     * -
     * 풀이
     * -
     * */
    static class MyCircularDeque<E> {

        int head, tail, size;

        MyCircularDeque(int size) {
            this.size = size;
        }

        /**
         * 데크 처음에 아이템을 추가하고 성공시 true 리턴
         * */
        public boolean insertFront(E e) {
            return true;
        }

        /**
         * 데크 마지막아이템을 추가하고 성공시 true 리턴
         * */
        public boolean insertLast(E e) {
            return true;
        }

        /**
         * 데크 처음에 아이템을 삭제하고 성공시 true 리턴
         * */
        public boolean deleteFront() {
            return true;
        }

        /**
         * 데크 마지막아이템을 삭제하고 성공시 true 리턴
         * */
        public boolean deleteLast() {
            return true;
        }

        /**
         * 데크 처음에 아이템을 가져온다. 데크가 비어 있다면 -1을 리턴
         * */
        public boolean getFront() {
            return true;
        }

        /**
         * 데크 마지막아이템을 가져온다. 데크가 비어 있다면 -1을 리턴
         * */
        public boolean getLast() {
            return true;
        }

        /**
         * 데크가 비어 있는지 여부를 판별
         * */
        public boolean isEmpty() {
            return true;
        }

        /**
         * 데크가 가득 차 있는지 여부 판별
         * */
        public boolean isFull() {
            return true;
        }
    }
}
