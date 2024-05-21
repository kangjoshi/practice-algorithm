package linked_list;

import strings.Palindrome;

public class ListNode {

    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void print() {
        System.out.print(val + " ");
    }

    public void printAll() {
        var n = this;
        while (n != null) {
            n.print();
            n = n.next;
        }
        System.out.println();
    }
}
