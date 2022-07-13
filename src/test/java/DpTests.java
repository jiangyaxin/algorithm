import dp.*;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author JYX
 * @since 2022/7/8 15:17
 */
public class DpTests {

    @Test
    public void coinChangeTest(){
        assertThat(new CoinChange().coinChange(new int[]{1,2,5},11))
                .as("coinChangeTest")
                .isEqualTo(3);
        assertThat(new CoinChange().coinChange(new int[]{1},0))
                .as("coinChangeTest")
                .isEqualTo(0);
    }

    @Test
    public void lengthOfLISTest(){
        assertThat(new LengthOfLIS().lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}))
                .as("lengthOfLISTest")
                .isEqualTo(4);
        assertThat(new LengthOfLIS().lengthOfLIS(new int[]{1,3,6,7,9,4,10,5,6}))
                .as("lengthOfLISTest")
                .isEqualTo(6);
    }

    @Test
    public void maxEnvelopesTest(){
        assertThat(new MaxEnvelopes().maxEnvelopes(new int[][]{
                    {5,4},
                    {6,4},
                    {6,7},
                    {2,3}
                }))
                .as("maxEnvelopesTest")
                .isEqualTo(3);
    }

    @Test
    public void minFallingPathSumTest(){
        assertThat(new MinFallingPathSum().minFallingPathSum(new int[][]{
                {2,1,3},
                {6,5,4},
                {7,8,9}
        }))
                .as("minFallingPathSumTest")
                .isEqualTo(13);
    }

    @Test
    public void minDistanceTest(){
        assertThat(new MinDistance().minDistance("horse","ros"))
                .as("minDistanceTest")
                .isEqualTo(3);
        assertThat(new MinDistance().minDistance("sea","eat"))
                .as("minDistanceTest")
                .isEqualTo(2);
        assertThat(new MinDistance().minDistance("intention","execution"))
                .as("minDistanceTest")
                .isEqualTo(5);
        assertThat(new MinDistance().minDistance("a","a"))
                .as("minDistanceTest")
                .isEqualTo(0);
        assertThat(new MinDistance().minDistance("park","spake"))
                .as("minDistanceTest")
                .isEqualTo(3);
    }

    @Test
    public void maxSubArrayTest(){
        assertThat(new MaxSubArray().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}))
                .as("maxSubArrayTest")
                .isEqualTo(6);
    }

}
