package Q2_07_Intersection;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

public class Practice {

    public static LinkedListNode findIntersection(LinkedListNode list1, LinkedListNode list2) {
        LinkedListNode tail1 = list1;
        LinkedListNode tail2 = list2;

        int c1 = 1;
        while(tail1.next != null){
            tail1 = tail1.next;
            c1 += 1;
        }

        int c2 = 1;
        while(tail2.next != null){
            tail2 = tail2.next;
            c2 += 1;
        }

        if(! tail1.equals(tail2)) return null;

        LinkedListNode p1 = list1;
        LinkedListNode p2 = list2;
        if(c2 > c1){
            while(c2 > c1){
                p2 = p2.next;
                c2 -= 1;
            }
        }

        else if(c1 > c2){
            while(c1 > c2){
                p1 = p1.next;
                c1 -= 1;
            }
        }

        while(! p1.equals(p2)){
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;
    }


    public static void main(String[] args) {
        /* Create linked list */
        int[] vals = {-1, -2, 0, 1, 2, 3, 4, 5, 6, 7, 8};
        LinkedListNode list1 = AssortedMethods.createLinkedListFromArray(vals);

        int[] vals2 = {12, 14, 15};
        LinkedListNode list2 = AssortedMethods.createLinkedListFromArray(vals2);

        list2.next.next = list1.next.next.next.next;

        System.out.println(list1.printForward());
        System.out.println(list2.printForward());


        LinkedListNode intersection = findIntersection(list1, list2);

        System.out.println(intersection.printForward());
    }

}
