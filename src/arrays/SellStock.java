package arrays;

/**
 * 주식을 사고팔기 가장 좋은 시점
 * - 한 번의 거래로 낼 수 있는 최대 이익을 산출
 * 조건
 *  -
 * */
public class SellStock {

    public static void main(String[] args) {
        var prices = new int[]{8, 1, 5, 3, 6, 4};

        var benefit = sellStock(prices);
        System.out.println(benefit);
    }

    /**
     * 시도
     * - 작게 사서 비사게 판다.
     * 풀이
     * - 브루트 포스(완전 탐색): 풀이는 가능하지만 최후의 수단이 되어야..
     * - 저점과 현재 값과의 차이 계산
     *  - 시도와 동일
     *  회고
     *  - 잘 안풀릴 때는 문제를 그림으로 그려보자 해답에 좀 더 다가 갈 수 있을 것
     * */
    public static int sellStock(int[] prices) {
        var buy = prices[0];
        var benefit = Integer.MIN_VALUE;
        for (var i = 1; i < prices.length; i++) {
            benefit = Math.max(prices[i] - buy, benefit);
            buy = Math.min(buy, prices[i]);
        }
        return benefit;
    }

}
