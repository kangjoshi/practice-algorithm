package stack_queue;

import java.util.ArrayDeque;

/**
 * 일일 온도
 * - 매일의 온도 리스트를 입력 받아 더 따뜻한 날씨를 위해서는 며칠을 더 기다려야 하는지 출력
 * 조건
 *  -
 * */

public class DailyTemperatures {

    public static void main(String[] args) {
        var temperatures = new int[]{23, 24, 25, 21, 19, 22, 26, 23};
        // 1, 1, 4, 2, 1, 1, 0, 0

        var result = dailyTemperatures(temperatures);

        for (int day: result) {
            System.out.print(day + " ");
        }
    }

    /**
     * 시도
     * -
     * 풀이
     * - 현재의 인덱스를 계속 스택에 쌓기
     * 회고
     * - 값이 아닌 인덱스를 활용하면 정답이 쉽게 나올 때 가 있다..
     * */
    public static int[] dailyTemperatures(int[] temperatures) {
        var result = new int[temperatures.length];
        var stack = new ArrayDeque<Integer>();

        for (var i = 0; i < temperatures.length; i++) {
            var now = temperatures[i];

            // 현재 온도가 상단의 온도 보다 덥다면 하나식 꺼내 보면서 업데이트 해주는
            while (!stack.isEmpty() && now > temperatures[stack.peek()]) {
                result[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        return result;
    }
}
