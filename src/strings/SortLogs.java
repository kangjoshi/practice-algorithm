package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 로그 정렬
 * - 로그를 정렬하라
 * 조건
 *  - 로그의 가장 앞부분은 식별자로 순서에 영향을 끼치지 않는다.
 *  - 문자로 구성된 로그가 숫자 로그보다 앞에오며 문자 로그는 사전순으로 한다.
 *  - 문자가 동일할 경우 식별자순으로 한다.
 *  - 숫자 로그는 입력 순서대로 한다.
 * */

public class SortLogs {

    public static void main(String[] args) {

        var inputs = new String[]{
                "id1 8 1 5 1",
                "id2 art can",
                "id3 3 6",
                "id4 own kit dig",
                "id5 art zero"
        };

        var sortedLogs = sort(inputs);

        for (var log : sortedLogs) {
            System.out.println(log);
        }
    }

    /**
     * 시도
     * - 문자, 숫자로 된 로그 분리
     * - 문자로 된 로그 비교하며 정렬
     * - 숫자로 된 로그는 순서 유지
     * - 문자 로그 + 숫자 로그
     * 풀이
     * - 동일
     * - compareTo == 0이라는 것은 (문자열의 경우)동일 값, 활용한다면 비교문 하나를 줄일 수 있을것.
     * 회고
     * - 문제를 풀 때 다양한 예외 상황을 신경 써야 될지... 이번 케이스는 그 수가 너무 많아서 중간에 예외 처리 하는 거 포기...
     * */
    public static String[] sort(String[] logs) {
        var needSortLogs = new ArrayList<String>();
        var noNeedSortLogs = new ArrayList<String>();

        for (var log : logs) {
            if (isLetterLog(log)) {
                needSortLogs.add(log);
            } else {
                noNeedSortLogs.add(log);
            }
        }

        sortLog(needSortLogs);

        needSortLogs.addAll(noNeedSortLogs);
        return needSortLogs.toArray(new String[0]);
    }

    public static void sortLog(List<String> logs) {

        logs.sort((log1, log2) -> {
            var logContents1 = splitLog(log1);
            var logContents2 = splitLog(log2);

            // compareTo == 0은 동등하다는 것이므로 이것을 활용 할 수 있음.
            if (log1.substring(logContents1[0].length()).equals(log2.substring(logContents2[0].length()))) {
                return logContents1[0].compareTo(logContents2[0]);
            } else {
                return log1.substring(logContents1[0].length()).compareTo(log2.substring(logContents2[0].length()));
            }
        });
    }

    public static boolean isLetterLog(String log) {
        if (log == null) {
            return false;
        }

        var contents = splitLog(log);
        if (contents.length < 2) {
            return false;
        }

        return Character.isLetter(contents[1].charAt(0));
    }

    public static String[] splitLog(String log) {
        return log.split(" ");
    }
}
