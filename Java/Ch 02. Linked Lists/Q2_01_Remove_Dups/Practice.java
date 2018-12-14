package Q2_01_Remove_Dups;

import CtCILibrary.LinkedListNode;

import java.util.HashSet;

public class Practice {

    public static void deleteDups(LinkedListNode n) {
        HashSet<Integer> visited = new HashSet<>();

        visited.add(n.data);

        LinkedListNode p = n;

        while(p.next != null){
            if(visited.contains(p.next.data)){
                if(p.next.next !=null){
                    p.next = p.next.next;
                }
                else{
                    p.next = null;
                }

            }
            else{
                visited.add(p.next.data);
                p = p.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedListNode first = new LinkedListNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        LinkedListNode head = first;
        LinkedListNode second = first;
        for (int i = 1; i < 8; i++) {
            second = new LinkedListNode(i % 2, null, null);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }
        System.out.println(head.printForward());
        deleteDups(head);
        System.out.println(head.printForward());
    }
}
