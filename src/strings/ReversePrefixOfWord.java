package strings;

/**
 * Reverse Prefix of Word
 * - 문자와 character ch가 주어졌을때 첫번째 ch가 있는 위치 기준으로 앞에 있는 문자열을 뒤집어라
 * 조건
 *  - ch가 문자열내 없다면 그냥 word를 리턴
 * */

public class ReversePrefixOfWord {

    public static void main(String[] args) {
        var word = "abcdefd"; // dcbaefd
        var ch = 'd';
        var result = reversePrefix(word, ch);
        System.out.println(result);
    }

    /**
     * 시도
     * - 순회하여 ch가 없다면 그냥 리턴
     * - index를 구해서 0부터 index까지 문자 뒤집어 반환
     * 풀이
     * -
     * */

    public static String reversePrefix(String word, char ch) {
        var index = word.indexOf(ch);
        if (index == -1) {
            return word;
        }

        return reverse(word, 0, index);
    }

    public static String reverse(String word, int start, int end) {
        var charArray = word.toCharArray();
        var tempChar = charArray[start];
        while (start < end) {
            tempChar = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = tempChar;

            start++;
            end--;
        }

        return String.valueOf(charArray);
    }

}
