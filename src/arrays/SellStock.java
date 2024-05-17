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
     * -
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
