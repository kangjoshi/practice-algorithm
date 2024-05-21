package hashtable;

/**
 * 해시맵 디자인
 * - 다음과 같은 기능을 제공하는 해시맵을 디자인하라
 * 조건
 *  -
 * */

public class HashMap {

    public static void main(String[] args) {

    }

    /**
     * 시도
     * -
     * 풀이
     * -
     * */
    static class MyHashMap<K, V> {

        static class Node<K, V> {
            K key;
            V value;

            Node<K, V> next;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private final Node[] nodes = new Node[100000];

        /**
         * 키, 값을 해시맵에 삽입, 이미 존재하는 키라면 업데이트
         * */
        public void put(K key, V value) {
            var index = key.hashCode();
        }

        /**
         * 키에 해당하는 값을 조회, 키가 존재하지 않는다면 -1 리턴
         * */
        public V get(K key) {
            return null;
        }

        /**
         * 키에 해당하는 키, 값을 해시맵에서 삭제
         * */
        public void remove(K key) {

        }

        /**
         * 개별 체이닝
         * - 해시가 충돌하는 경우 연결 리스트로 연결
         *  1. 키의 해시값을 계산
         *  2. 해시값을 이용해 배열의 인덱스를 구한다.
         *  3. 같은 인덱스가 있다면 연결 리스트로 연결
         * - 대부분의 탐색은 O(1)이지만 최악의 경우, O(n)이 된다.
         * */
    }
}
