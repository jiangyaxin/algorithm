import back.trace.*;
import org.assertj.core.util.Lists;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author jiangyaxin
 * @since 2022/4/12 20:15
 */
public class BackTraceTests {

    @Test
    public void fullPermuteTest(){
        assertThat(new FullPermute().permute(new int[]{1,2,3}))
                .as("fullPermuteTest")
                .isEqualTo(Lists.list(
                    Lists.list(1,2,3),
                    Lists.list(1,3,2),
                    Lists.list(2,1,3),
                    Lists.list(2,3,1),
                    Lists.list(3,1,2),
                    Lists.list(3,2,1)
                ));
    }

    @Test
    public void fullPermuteUniqueTest(){
        assertThat(new FullPermuteUnique().permuteUnique(new int[]{1,1,2,2}))
                .as("fullPermuteUniqueTest")
                .isEqualTo(Lists.list(
                    Lists.list(1,1,2,2),
                    Lists.list(1,2,1,2),
                    Lists.list(1,2,2,1),
                    Lists.list(2,1,1,2),
                    Lists.list(2,1,2,1),
                    Lists.list(2,2,1,1)
                ));
    }

    @Test
    public void combineTest(){
        assertThat(new Combine().combine(4,2))
                .as("combineTest")
                .isEqualTo(Lists.list(
                        Lists.list(1,2),
                        Lists.list(1,3),
                        Lists.list(1,4),
                        Lists.list(2,3),
                        Lists.list(2,4),
                        Lists.list(3,4)
                ));
    }

    @Test
    public void combinationSumTest(){
        assertThat(new CombinationSum().combinationSum(new int[]{2,3,6,7},7))
                .as("combinationSumTest")
                .isEqualTo(Lists.list(
                        Lists.list(2,2,3),
                        Lists.list(7)
                ));
    }

    @Test
    public void combinationSum2Test(){
        assertThat(new CombinationSum().combinationSum2(new int[]{10,1,2,7,6,1,5},8))
                .as("combinationSum2Test")
                .isEqualTo(Lists.list(
                        Lists.list(1,1,6),
                        Lists.list(1,2,5),
                        Lists.list(1,7),
                        Lists.list(2,6)
                ));
    }

    @Test
    public void combinationSum3Test(){
        assertThat(new CombinationSum().combinationSum3(3,7))
                .as("combinationSum3Test")
                .isEqualTo(Lists.list(
                        Lists.list(1,2,4)
                ));
    }

    @Test
    public void letterCombinationsTest(){
        assertThat(new LetterCombinations().letterCombinations("23"))
                .as("letterCombinationsTest")
                .isEqualTo(Lists.list("ad","ae","af","bd","be","bf","cd","ce","cf"));
    }

    @Test
    public void partitionTest(){
        assertThat(new Partition().partition("aab"))
                .as("partitionTest")
                .isEqualTo(Lists.list(
                        Lists.list("a","a","b"),
                        Lists.list("aa","b")
                ));
        assertThat(new Partition().partition("bb"))
                .as("partitionTest")
                .isEqualTo(Lists.list(
                        Lists.list("b","b"),
                        Lists.list("bb")
                ));

    }

}
