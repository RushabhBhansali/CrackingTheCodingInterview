package Q2_04_Partition;

import CtCILibrary.LinkedListNode;

public class Practice {

    public static LinkedListNode partition(LinkedListNode node, int x) {
        if(node.next == null) return node;


        // created a dummy head
        LinkedListNode head = new LinkedListNode(-1);
        head.next = node;
        LinkedListNode p = head.next;
        while(p.next != null){
            if(p.next.data < x){
                LinkedListNode t1 = p.next.next;
                LinkedListNode t2 = head.next;
                head.next = p.next;
                head.next.next = t2;
                p.next = t1;
            }

            else{
                p = p.next;
            }
        }

        return head.next;

    }

    public static void main(String[] args) {
        /* Create linked list */
        int[] vals = {33,9,2,3,10,10389,838,874578,5};
        LinkedListNode head = new LinkedListNode(vals[0], null, null);
        LinkedListNode current = head;
        for (int i = 1; i < vals.length; i++) {
            current = new LinkedListNode(vals[i], null, current);
        }
        System.out.println(head.printForward());

        /* Partition */
        LinkedListNode h = partition(head, 838);

        /* Print Result */
        System.out.println(h.printForward());
    }
}
