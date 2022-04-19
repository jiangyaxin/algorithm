package back.trace;

/**
 * 力扣 1020. 飞地的数量
 * 给你一个大小为 m x n 的二进制矩阵 grid ，其中 0 表示一个海洋单元格、1 表示一个陆地单元格。
 *
 * 一次 移动 是指从一个陆地单元格走到另一个相邻（上、下、左、右）的陆地单元格或跨过 grid 的边界。
 *
 * 返回网格中 无法 在任意次数的移动中离开网格边界的陆地单元格的数量。
 *
 * 示例 1：
 * 输入：grid = [[0,0,0,0],[1,0,1,0],[0,1,1,0],[0,0,0,0]]
 * 输出：3
 * 解释：有三个 1 被 0 包围。一个 1 没有被包围，因为它在边界上。
 *
 * 示例 2：
 * 输入：grid = [[0,1,1,0],[0,0,1,0],[0,0,1,0],[0,0,0,0]]
 * 输出：0
 * 解释：所有 1 都在边界上或可以到达边界。
 *
 * 提示：
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 500
 * grid[i][j] 的值为 0 或 1
 *
 * @author jiangyaxin
 * @since 2022/4/19 20:52
 */
public class NumEnclaves {

    private static final int LAND = 1;
    private static final int WATER = 0;

    private int maxX;
    private int maxY;

    public int numEnclaves(int[][] grid) {

        maxY = grid.length;
        maxX = grid[0].length;

        for(int y = 0 ; y < maxY ; y++){
            if(grid[y][0] == LAND){
                numEnclaves(grid,0,y);
            }
        }

        for(int y = 0 ; y < maxY ; y++){
            if(grid[y][maxX-1] == LAND){
                numEnclaves(grid,maxX-1,y);
            }
        }

        for(int x = 0 ; x < maxX ; x++){
            if(grid[0][x] == LAND){
                numEnclaves(grid,x,0);
            }
        }

        for(int x = 0 ; x < maxX ; x++){
            if(grid[maxY-1][x] == LAND){
                numEnclaves(grid,x,maxY-1);
            }
        }

        int result = 0;
        for (int x = 0 ; x < maxX ; x++){
            for(int y = 0 ; y < maxY ; y++){
                if(grid[y][x] == LAND){
                    result++;
                }
            }
        }
        return result;
    }

    public void numEnclaves(int[][] grid,int x,int y) {
        if(x < 0 || x == maxX || y < 0 || y == maxY){
            return ;
        }

        if(grid[y][x] == WATER){
            return;
        }
        grid[y][x] = WATER;
        numEnclaves(grid,x-1,y);
        numEnclaves(grid,x+1,y);
        numEnclaves(grid,x,y-1);
        numEnclaves(grid,x,y+1);
    }
}
