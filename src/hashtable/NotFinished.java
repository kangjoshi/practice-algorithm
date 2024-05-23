package hashtable;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * 완주하지 못한 선수
 * - 마라톤에 참여한 선수 배열과 완주한 선수 배열을 입력 받아 완주하지 못한 선수를 출력
 * 조건
 *  - 동명이인은 없다.
 * */

public class NotFinished {

    public static void main(String[] args) {
        var participants = List.of("leo", "kiki", "eden");
        var completion = Set.of("eden", "kiki");

        var notFinished = new ArrayList<>(participants.size() - completion.size());
        for (String participant : participants) {
            if (!completion.contains(participant)) {
                notFinished.add(participant);
            }
        }

        System.out.println(notFinished);
    }

    /**
     * 시도
     * - 참가자를 순회 하며 완주하지 못한 사람을 출력
     * 풀이
     * - 동명이인 케이스까지 고려 했음. map에 값으로 동명이인이 2명이라면 +1+1하는 식으로
     * 회고
     * -
     * */
}
