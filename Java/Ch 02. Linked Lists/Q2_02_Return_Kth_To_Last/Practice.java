package Q2_02_Return_Kth_To_Last;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

public class Practice {
    public static void printKthToLast(LinkedListNode head, int k) {
        LinkedListNode leader = head;
        LinkedListNode follower = head;
        int counter = 0;

        while(counter < k){
            leader = leader.next;
            counter += 1;
        }

        while(leader.next != null){
            leader = leader.next;
            follower = follower.next;
        }

        System.out.println(k + "th to last node is " + follower.data);
        //return k;
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6};
        LinkedListNode head = AssortedMethods.createLinkedListFromArray(array);
        for (int i = 0; i <= array.length + 1; i++) {
            printKthToLast(head, i);
        }
    }
}
