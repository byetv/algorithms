package com.studyng.interview.linkedlist;

public class AddTwoNumbers {

    public static void main(String[] args) {
        // Crear la lista: 2 -> 4 -> 3
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);

        // Crear la lista: 5 -> 6 -> 4
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(head, l2);

        imprimirLista(result);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Dummy node to simplify result list construction
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int value1 = (l1 != null) ? l1.val : 0;
            int value2 = (l2 != null) ? l2.val : 0;

            int sum = value1 + value2 + carry;
            carry = sum / 10; // update carry
            int digit = sum % 10;
            //int digit = (sum < 10) ? sum : 0;

            current.next = new ListNode(digit); // create new node for the digit
            current = current.next;

            if (l1 != null) l1 = l1.next; // move to next node
            if (l2 != null) l2 = l2.next;
        }

        return dummyHead.next; // first node is dummy, so return next
    }

    public static void imprimirLista(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
}
