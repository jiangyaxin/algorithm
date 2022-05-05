import link.*;
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
                new ListNode(1,new ListNode(2,new ListNode(4,null))),
                new ListNode(1,new ListNode(3,new ListNode(4,null)))
        ).toString())
                .as("mergeTwoListsTest")
                .isEqualTo(
                        new ListNode(1,
                                new ListNode(1,
                                        new ListNode(2,
                                                new ListNode(3,
                                                        new ListNode(4,
                                                                new ListNode(4,null)))))).toString());
    }

    @Test
    public void mergeKListsTest(){
        assertThat(new MergeKLists().mergeKLists(new ListNode[]{
                new ListNode(1, new ListNode(4, new ListNode(5, null))),
                new ListNode(1, new ListNode(3, new ListNode(4, null))),
                new ListNode(2, new ListNode(6,null))
        }).toString())
                .as("mergeKListsTest")
                .isEqualTo(
                        new ListNode(1,
                                new ListNode(1,
                                        new ListNode(2,
                                                new ListNode(3,
                                                        new ListNode(4,
                                                                new ListNode(4,
                                                                        new ListNode(5,
                                                                                new ListNode(6,null)))))))).toString());
    }

    @Test
    public void hasCycleTest(){
        ListNode listNode1 = new ListNode(2,null);
        listNode1.next = new ListNode(0, new ListNode(-4, listNode1));
        assertThat(new HasCycle().hasCycle(new ListNode(3,listNode1)))
                .as("hasCycleTest")
                .isEqualTo(true);
    }

    @Test
    public void detectCycleTest(){
        ListNode listNode1 = new ListNode(2,null);
        listNode1.next = new ListNode(0, new ListNode(-4, listNode1));
        assertThat(new DetectCycle().detectCycle(new ListNode(3,listNode1)))
                .as("detectCycleTest")
                .isEqualTo(listNode1);
    }

    @Test
    public void middleNodeTest(){

        ListNode middleNode = new ListNode(3, new ListNode(4, new ListNode(5,null)));
        ListNode listNode = new ListNode(1,new ListNode(2,middleNode));
        assertThat(new MiddleNode().middleNode(listNode))
                .as("middleNodeTest")
                .isEqualTo(middleNode);
    }

    @Test
    public void removeNthFromEndTest(){

        assertThat(new RemoveNthFromEnd().removeNthFromEnd(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null))))),2).toString())
                .as("removeNthFromEndTest")
                .isEqualTo(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(5,null)))).toString());
    }

    @Test
    public void getIntersectionNodeTest(){

        ListNode intersectionNode = new ListNode(8,new ListNode(4,new ListNode(5,null)));
        assertThat(new GetIntersectionNode().getIntersectionNode(new ListNode(4,new ListNode(1,intersectionNode)),new ListNode(5,new ListNode(6,new ListNode(1,intersectionNode)))))
                .as("getIntersectionNodeTest")
                .isEqualTo(intersectionNode);
    }

    @Test
    public void reverseListTest(){

        assertThat(new ReverseList().reverseList(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null)))))).toString())
                .as("reverseListTest")
                .isEqualTo(new ListNode(5,new ListNode(4,new ListNode(3,new ListNode(2,new ListNode(1,null))))).toString());
    }

    @Test
    public void reverseBetweenTest(){

        assertThat(new ReverseBetween().reverseBetween(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null))))),2,4).toString())
                .as("reverseBetweenTest")
                .isEqualTo(new ListNode(1,new ListNode(4,new ListNode(3,new ListNode(2,new ListNode(5,null))))).toString());
    }

    @Test
    public void reverseKGroupTest(){

        assertThat(new ReverseKGroup().reverseKGroup(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null))))),1).toString())
                .as("reverseKGroupTest")
                .isEqualTo(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null))))).toString());

        assertThat(new ReverseKGroup().reverseKGroup(new ListNode(1,new ListNode(2,null)),2).toString())
                .as("reverseKGroupTest")
                .isEqualTo(new ListNode(2,new ListNode(1,null)).toString());

        assertThat(new ReverseKGroup().reverseKGroup(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null))))),3).toString())
                .as("reverseKGroupTest")
                .isEqualTo(new ListNode(3,new ListNode(2,new ListNode(1,new ListNode(4,new ListNode(5,null))))).toString());

        assertThat(new ReverseKGroup().reverseKGroup(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null))))),2).toString())
                .as("reverseKGroupTest")
                .isEqualTo(new ListNode(2,new ListNode(1,new ListNode(4,new ListNode(3,new ListNode(5,null))))).toString());
    }

    @Test
    public void isPalindromeTest(){

        assertThat(new IsPalindrome().isPalindrome(new ListNode(1,new ListNode(2,new ListNode(2,new ListNode(1,null))))))
                .as("isPalindromeTest")
                .isEqualTo(true);
    }
}
