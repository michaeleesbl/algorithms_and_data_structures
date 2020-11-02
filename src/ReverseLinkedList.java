public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ReverseLinkedList sol = new ReverseLinkedList();
        ListNode ans = sol.reverseList(head);
        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
