package stack_queue;

import java.util.ArrayDeque;
import java.util.HashMap;

/**
 * 유효한 괄호
 * - 대중소 세 종류 괄호로 된 입력 값이 유효한지 판별하라
 * 조건
 *  -
 * */

public class ValidParentheses {

    public static void main(String[] args) {
        var parentheses = "[]{}(){}[]{}(){}}";

        var valid = validate(parentheses);

        System.out.println(valid);
    }

    /**
     * 시도
     * - 스택에 담아서 하나씩 꺼내서 판단.
     * - 유효 여부 판단?
     *  - 짝이 맞는 괄호 여부 판단을 위해 map으로 관리
     *  - 열림일 때 stack에 닫침 괄호를 넣고 그 다음에 위치 하는지 확인
     *  - 끝날 때는 stack에 값이 없어야 함. (모든 괄호가 짝이 맞아야 함.)
     * 풀이
     * -
     * */
    public static boolean validate(String parentheses) {
        var map = new HashMap<Character, Character>();
        map.put('[', ']');
        map.put('{', '}');
        map.put('(', ')');

        var stack = new ArrayDeque<Character>();

        for (char c : parentheses.toCharArray()) {
            if (map.containsKey(c)) {
                stack.add(map.get(c));
            } else {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
