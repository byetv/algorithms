package com.studyng.interview.linkedlist;

public class HasCycle {

    public static void main(String[] args) {
        // Crear la lista: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Lista original: ");
        imprimirLista(head);

        System.out.print("Hay un ciclo en la lista enlazada?: " + hasCycle(head));

        // Lista CON ciclo: 1 -> 2 -> 3 -> 4 -> 2 (ciclo)
        ListNode conCiclo = new ListNode(1);
        ListNode nodo2 = new ListNode(2);
        ListNode nodo3 = new ListNode(3);
        ListNode nodo4 = new ListNode(4);

        conCiclo.next = nodo2;
        nodo2.next = nodo3;
        nodo3.next = nodo4;
        nodo4.next = nodo2; // Aquí se crea el ciclo apuntando de nuevo a nodo2

        //System.out.print("Lista original: ");
        //imprimirLista(conCiclo);

        System.out.println("Hay un ciclo en la lista enlazada? " + hasCycle(conCiclo));
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
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
