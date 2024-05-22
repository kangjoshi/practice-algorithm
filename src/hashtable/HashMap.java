package hashtable;

import java.util.NoSuchElementException;
import java.util.Objects;

/**
 * 해시맵 디자인
 * - 다음과 같은 기능을 제공하는 해시맵을 디자인하라
 * 조건
 *  -
 * */

public class HashMap {

    public static void main(String[] args) {
        var map = new MyHashMap<Integer, Integer>();

        map.put(1, 1);
        map.put(2, 2);

        map.put(2, 1);
        System.out.println(map.get(2)); // 1

        System.out.println(map.get(2));
        map.remove(2);
        System.out.println(map.get(2));
        System.out.println();
    }

    /**
     * 시도
     * - 해시맵 구현
     * 풀이
     * -
     * 회고
     * - 경계에 대한 테스트 코드 보강 필요..
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
            var index = key.hashCode() % nodes.length;

            if (nodes[index] == null) {
                nodes[index] = new Node(key, value);
                return;
            }

            var node = nodes[index];
            Node prev = null;
            while (node != null) {
                if (node.key.equals(key)) {
                    node.value = value;
                    return;
                }
                prev = node;
                node = node.next;
            }
            prev.next = new Node(key, value);
        }

        /**
         * 키에 해당하는 값을 조회, 키가 존재하지 않는다면 -1 리턴
         * */
        public V get(K key) {
            var index = key.hashCode() % nodes.length;

            if (nodes[index] == null) {
                return null;
            }

            var node = nodes[index];
            while (node != null) {
                if (node.key.equals(key)) {
                    return (V) node.value;
                }
                node = node.next;
            }
            return null;
        }

        /**
         * 키에 해당하는 키, 값을 해시맵에서 삭제
         * */
        public void remove(K key) {
            var index = key.hashCode() % nodes.length;

            if (nodes[index] == null) {
                return;
            }

            var node = nodes[index];
            Node<K, V> prev = null;
            while (node != null) {
                if (node.key.equals(key)) {
                    if (prev != null) {
                        prev.next = node.next;
                        return;
                    } else {
                        nodes[index] = node.next;
                        return;
                    }
                }
                prev = node;
                node = node.next;
            }
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
