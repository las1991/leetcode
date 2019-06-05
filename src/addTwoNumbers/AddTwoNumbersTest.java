package addTwoNumbers;

import org.junit.Test;

/**
 * @author las
 * @date 19-6-5
 */
public class AddTwoNumbersTest {

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    public void test234add124() {
        ListNode n1 = new ListNode(2);
        n1.next = new ListNode(3);
        n1.next.next = new ListNode(4);

        ListNode n2 = new ListNode(1);
        n2.next = new ListNode(2);
        n2.next.next = new ListNode(4);

        System.out.println(addTwoNumbers.solution2(n1, n2));
        System.out.println(addTwoNumbers.solution1(n1, n2));
    }

    @Test
    public void test615add741() {
        ListNode n1 = new ListNode(6);
        n1.next = new ListNode(1);
        n1.next.next = new ListNode(5);

        ListNode n2 = new ListNode(7);
        n2.next = new ListNode(4);
        n2.next.next = new ListNode(1);

        System.out.println(addTwoNumbers.solution2(n1, n2));
        System.out.println(addTwoNumbers.solution1(n1, n2));
    }

    @Test
    public void test999add999() {
        ListNode n1 = new ListNode(9);
        n1.next = new ListNode(9);
        n1.next.next = new ListNode(9);

        ListNode n2 = new ListNode(9);
        n2.next = new ListNode(9);
        n2.next.next = new ListNode(9);

        System.out.println(addTwoNumbers.solution2(n1, n2));
        System.out.println(addTwoNumbers.solution1(n1, n2));
    }

    @Test
    public void test243add564() {
        ListNode n1 = new ListNode(2);
        n1.next = new ListNode(4);
        n1.next.next = new ListNode(3);

        ListNode n2 = new ListNode(5);
        n2.next = new ListNode(6);
        n2.next.next = new ListNode(4);

        System.out.println(addTwoNumbers.solution2(n1, n2));
        System.out.println(addTwoNumbers.solution1(n1, n2));
    }

    @Test
    public void test18add0() {
        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(8);

        ListNode n2 = new ListNode(0);

        System.out.println(addTwoNumbers.solution2(n1, n2));
        System.out.println(addTwoNumbers.solution1(n1, n2));
    }

}
