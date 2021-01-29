import LangtonAnt.LandonAnt;
import org.assertj.core.util.Lists;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author JYX
 * @since 2021/1/29 11:03
 */
public class LandonAntTests {

    @Test
    public void landonAntTest(){
//        assertThat(new LandonAnt().printKMoves(0)).as("LandonAntTests").isEqualTo(Lists.list("R"));
//        assertThat(new LandonAnt().printKMoves(2)).as("LandonAntTests").isEqualTo(Lists.list("_X", "LX"));
//        assertThat(new LandonAnt().printKMoves(5)).as("LandonAntTests").isEqualTo(Lists.list("_U", "X_", "XX"));

        new LandonAnt().printKMoves(10);
    }
}
