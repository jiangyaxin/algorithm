import bfs.MinDepth;
import bfs.OpenLock;
import bfs.SlidingPuzzle;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author jiangyaxin
 * @since 2022/4/20 20:55
 */
public class BfsTests {

    @Test
    public void minDepthTest(){
        MinDepth.TreeNode treeNode = new MinDepth.TreeNode(3, new MinDepth.TreeNode(9, null, null), new MinDepth.TreeNode(20, new MinDepth.TreeNode(15, null, null), new MinDepth.TreeNode(20, null, null)));
        assertThat(new MinDepth().minDepth(treeNode))
                .as("minDepthTest")
                .isEqualTo(2);
    }

    @Test
    public void openLockTest(){
        assertThat(new OpenLock().openLock(new String[]{"0201","0101","0102","1212","2002"},"0202"))
                .as("openLockTest")
                .isEqualTo(6);

        assertThat(new OpenLock().doubleBfs(new String[]{"0201","0101","0102","1212","2002"},"0202"))
                .as("openLockTest")
                .isEqualTo(6);
    }

    @Test
    public void slidingPuzzleTest(){
        assertThat(new SlidingPuzzle().slidingPuzzle(new int[][]{{1,2,3},{4,0,5}}))
                .as("slidingPuzzleTest")
                .isEqualTo(1);
        assertThat(new SlidingPuzzle().slidingPuzzle(new int[][]{{1,2,3},{5,4,0}}))
                .as("slidingPuzzleTest")
                .isEqualTo(-1);
    }
}
