package graph;

/**
 * 섬의 개수
 * - 1을 육지로 0을 물로 가정한 2차원 그리드 맵이 주어졌을 대 섬의 개수를 계산하라
 * 조건
 *  -
 * */

public class NumberOfIsIslands {

    public static void main(String[] args) {
        var grid = new char[][]{
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','X','0'}
        };

        var count = 0;
        // 전체 탐색을 하다가
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                // 만약 섬을 찾으면 여기서 부터 동서 남북으로 깊이 탐색
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    /**
     * 시도
     * - 동서 남북 깊이 우선 탐색
     * - 4개의 면중 하나라도 연결이 되어 있다면 같은 섬, 아니라면 단일 섬.
     * 풀이
     * -
     * 회고
     * - 동서남북 탐색은 생각 했지만, 섬의 개수를 세는 방법은 고민 함.
     * - 발견한 섬을 섬이 아닌 값으로 변경 하는 방법이 인상적이였음.
     * */
    public static void dfs(char[][] grid, int i, int j) {
        // 배열에서 유효하지 않은 범위라면 탐색하지 않고. 섬이 아니라면 더이상 탐색하지 않음.
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }

        // 탐색한 지점은 값 변경
        grid[i][j] = '0';

        // 동서남북 재귀 탐색
        dfs(grid, i, j + 1); // 동
        dfs(grid, i, j - 1); // 서
        dfs(grid, i + 1, j); // 남
        dfs(grid, i - 1, j); // 북
    }
}
