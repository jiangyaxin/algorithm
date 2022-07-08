import dp.CoinChange;
import dp.LengthOfLIS;
import dp.MaxEnvelopes;
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
}
