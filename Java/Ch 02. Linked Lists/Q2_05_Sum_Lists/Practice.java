package Q2_05_Sum_Lists;

import CtCILibrary.LinkedListNode;
import sun.awt.image.ImageWatched;

public class Practice {
    private static LinkedListNode addLists(LinkedListNode l1, LinkedListNode l2) {
        LinkedListNode dh = new LinkedListNode(0);
        LinkedListNode p = dh;
        int c = 0;
        LinkedListNode p1 = l1;
        LinkedListNode p2 = l2;

        while(p1 != null || p2 != null){
            int d1= p1==null?0:p1.data;
            int d2 = p2==null?0:p2.data;

            int d = (d1 + d2+c) % 10;
            c = (d1 + d2+c) /10;

            p.next = new LinkedListNode(d);
            p = p.next;
            if(p1 != null) p1 = p1.next;
            if (p2!= null) p2=p2.next;
        }


        if(c > 0){
            p.next = new LinkedListNode(c);
        }

        return dh.next;
    }


    public static int linkedListToInt(LinkedListNode node) {
        int value = 0;
        if (node.next != null) {
            value = 10 * linkedListToInt(node.next);
        }
        return value + node.data;
    }

    public static void main(String[] args) {
        LinkedListNode lA1 = new LinkedListNode(9, null, null);
        LinkedListNode lA2 = new LinkedListNode(9, null, lA1);
        LinkedListNode lA3 = new LinkedListNode(9, null, lA2);

        LinkedListNode lB1 = new LinkedListNode(1, null, null);
        LinkedListNode lB2 = new LinkedListNode(0, null, lB1);
     //   LinkedListNode lB3 = new LinkedListNode(0, null, lB2);

        LinkedListNode list3 = addLists(lA1, lB1);

        System.out.println("  " + lA1.printForward());
        System.out.println("+ " + lB1.printForward());
        System.out.println("= " + list3.printForward());

        int l1 = linkedListToInt(lA1);
        int l2 = linkedListToInt(lB1);
        int l3 = linkedListToInt(list3);

        System.out.print(l1 + " + " + l2 + " = " + l3 + "\n");
        System.out.print(l1 + " + " + l2 + " = " + (l1 + l2));
    }
}
