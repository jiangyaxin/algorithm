import array.NumArray;
import array.NumMatrix;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author jiangyaxin
 * @since 2022/4/26 21:08
 */
public class ArrayTests {

    @Test
    public void numArrayTest(){
        NumArray numArray = new NumArray(new int[]{-2,0,3,-5,2,-1});
        assertThat(numArray.sumRange(0,2))
                .as("numArrayTest")
                .isEqualTo(1);
        assertThat(numArray.sumRange(2,5))
                .as("numArrayTest")
                .isEqualTo(-1);
        assertThat(numArray.sumRange(0,5))
                .as("numArrayTest")
                .isEqualTo(-3);
    }

    @Test
    public void numMatrixTest(){
        NumMatrix numMatrix = new NumMatrix(new int[][]{{3,0,1,4,2},{5,6,3,2,1},{1,2,0,1,5},{4,1,0,1,7},{1,0,3,0,5}});
        assertThat(numMatrix.sumRegion(2,1,4,3))
                .as("numMatrixTest")
                .isEqualTo(8);
        assertThat(numMatrix.sumRegion(1,1,2,2))
                .as("numMatrixTest")
                .isEqualTo(11);
        assertThat(numMatrix.sumRegion(1,2,2,4))
                .as("numMatrixTest")
                .isEqualTo(12);
    }

}
