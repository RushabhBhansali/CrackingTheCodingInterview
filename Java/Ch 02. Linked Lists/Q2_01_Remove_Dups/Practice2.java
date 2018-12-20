package Q2_01_Remove_Dups;

import CtCILibrary.LinkedListNode;

public class Practice2 {

    //without using any buffer
    public static void deleteDups(LinkedListNode n) {
        if(n.next == null) return;

        LinkedListNode tp = n;

        while(tp.next != null){
            LinkedListNode runner = tp;
            while(runner.next !=null){
                if(runner.next.data == tp.data){
                    if(runner.next.next != null){
                        runner.next = runner.next.next;
                    }
                    else{
                        runner.next = null;
                    }
                }
                else if(runner.next != null){
                    runner = runner.next;
                }
            }

            //System.out.println(n.printForward());

            if(tp.next != null){
                tp = tp.next;
            }

        }

        return;
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
