class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumbers {


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // initialize current node to dummy head of return list
        ListNode p = l1, q = l2, curr = dummyHead; // initialize p,q to head of l1,l2
        int carry = 0; // initialize carry to 0
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0; // set x to node p's val; if l1 end, set to 0
            int y = (q != null) ? q.val : 0; // set y to node p's val; if l2 end, set to 0
            int sum = carry + x + y;
            carry = sum / 10; // update carry
            curr.next = new ListNode(sum % 10); // create new node w/digit value of sum % 10
            curr = curr.next; // advance curr node to next
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }

        if (carry > 0) curr.next = new ListNode(carry);
        return dummyHead.next;

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode head = addTwoNumbers(l1, l2);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

}
