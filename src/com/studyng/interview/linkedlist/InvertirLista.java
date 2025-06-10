package com.studyng.interview.linkedlist;

public class InvertirLista {
    public static void main(String[] args) {
        // Crear la lista: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Lista original: ");
        imprimirLista(head);

        ListNode invertida = invertirLista(head);

        System.out.print("Lista invertida: ");
        imprimirLista(invertida);
    }

    public static void imprimirLista(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode invertirLista(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
