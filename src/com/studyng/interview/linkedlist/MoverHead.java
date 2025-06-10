package com.studyng.interview.linkedlist;

public class MoverHead {
    public static void main(String[] args) {
        // Crear la lista: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int movePositions= 1;

        System.out.print("Lista original: ");
        imprimirLista(head);

        ListNode moved = moverLista(head, movePositions);

        imprimirLista(moved);
    }

    private static void imprimirLista(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    private static ListNode moverLista(ListNode head, int k){
        if (head == null || head.next == null || k == 0) return head;

        // Calcular longitud
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        k = k % length;
        if (k == 0) return head;

        // Avanzar hasta el nodo que será la nueva cola
        int steps = length - k;
        ListNode prev = null;
        ListNode curr = head;
        while (steps-- > 0) {
            prev = curr;
            curr = curr.next;
        }

        // Romper y reordenar
        prev.next = null;
        ListNode newHead = curr;

        // Conectar el final con el viejo head
        while (curr.next != null) curr = curr.next;
        curr.next = head;

        return newHead;
    }
}
