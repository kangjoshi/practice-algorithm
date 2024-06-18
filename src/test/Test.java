package test;

import java.util.Arrays;
import java.util.HashMap;

public class Test {

  public static void main(String[] args) {
    var numbers = new int[]{4, 5, 2, 3, 1};

    var result = rank(numbers);

    System.out.println();

  }

  public static String[] rank(int[] numbers) {
    var result = new String[numbers.length];

    var pairs = new int[numbers.length][2];
    for (int i = 0; i < numbers.length; i++) {
      pairs[i][0] = numbers[i];
      pairs[i][1] = i;
    }

    // 이차원 배열의 정렬
    Arrays.sort(pairs, (a, b) -> b[0] - a[0]);

    for (int i = 0; i < pairs.length; i++) {
      result[pairs[i][1]] = convert(i + 1);
    }
    /*

    var temp = numbers.clone();
    Arrays.sort(temp);

    var tempMap = new HashMap<Integer, Integer>();

    for (int i = 0; i < temp.length; i++) {
      tempMap.put(temp[i], temp.length - i);
    }

    for (int i = 0; i < numbers.length; i++) {
      result[i] = convert(tempMap.get(numbers[i]));
    }

     */

    return result;
  }

  public static String convert(int rank) {
    if (rank > 3) {
      return rank + "th";
    } else if (rank == 1){
      return "Gold Medal";
    } else if (rank == 2){
      return "Silver Medal";
    } else {
      return "Bronze Medal";
    }
  }


}
