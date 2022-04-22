import bfs.OpenLock;
import link.MergeTwoLists;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author jiangyaxin
 * @since 2022/4/21 23:14
 */
public class LinkTests {


    @Test
    public void mergeTwoListsTest(){
        assertThat(new MergeTwoLists().mergeTwoLists(
                new MergeTwoLists.ListNode(1,new MergeTwoLists.ListNode(2,new MergeTwoLists.ListNode(4,null))),
                new MergeTwoLists.ListNode(1,new MergeTwoLists.ListNode(3,new MergeTwoLists.ListNode(4,null)))
        ).toString())
                .as("mergeTwoListsTest")
                .isEqualTo(
                        new MergeTwoLists.ListNode(1,
                                new MergeTwoLists.ListNode(1,
                                        new MergeTwoLists.ListNode(2,
                                                new MergeTwoLists.ListNode(3,
                                                        new MergeTwoLists.ListNode(4,
                                                                new MergeTwoLists.ListNode(4,null)))))).toString());
    }
}
