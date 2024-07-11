package graph;

/**
 * Island Perimeter
 * - row x col로 이루어진 grid가 주어졌을 때 값이 1이라면 땅, 0이라면 물이다.
 * - 섬의 둘레를 구하라
 * 조건
 *  - 하나의 섬만 존재 한다.
 *  - 섬은 수직, 수평으로만 연결 되어 있다.
 * */

public class IslandPerimeter {

    public static void main(String[] args) {
        var grid = new int[][]{
                {1, 0}
        };

        System.out.println(perimeter(grid));
    }

    public static int perimeter(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    return dfs(grid, i, j);
                }
            }
        }

        return 0;
    }

    /**
     * 시도
     * - 먼저 탐색을 하면서 섬을 찾는다.
     * - 섬의 동서 남북이 grid 영역 밖이거나 물이라면 탐색을 종료하고 perimeter를 증가 시킨다.
     * 풀이
     * -
     * 회고
     * - 이전에 풀었던 문제여서 풀이에 크게 어렵진 않았음.
     * - 방문한 섬에 값을 변경 해주는것을 꼭 기억하자
     * */
    public static Integer dfs(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
            return 1;
        }

        if (grid[i][j] == 2) {
            return 0;
        }

        // 방문한 곳은 빼야 함.
        grid[i][j] = 2;

        // 동서남북
        return dfs(grid, i, j + 1)
                + dfs(grid, i, j - 1)
                + dfs(grid, i + 1, j)
                + dfs(grid, i - 1, j);
    }


}
