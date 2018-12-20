package Q2_06_Palindrome;

import CtCILibrary.LinkedListNode;

import java.util.Stack;


public class Practice {

    public static boolean isPalindrome(LinkedListNode head) {
        if(head == null || head.next == null ) return true;

        Stack<Integer> st = new Stack<Integer>();

        LinkedListNode slow  = head;
        LinkedListNode fast = head;

        while(true){
            st.push(slow.data);

            if(fast.next == null || fast.next.next == null){
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

       if(fast.next == null){st.pop();}

        LinkedListNode p1 =slow.next;
        while (p1 != null){
            if(p1.data != st.pop()) return false;

            p1 = p1.next;
        }

        return true;
    }

    public static void main(String[] args) {
        int length = 9;
        LinkedListNode[] nodes = new LinkedListNode[length];
        for (int i = 0; i < length; i++) {
            nodes[i] = new LinkedListNode(i >= length / 2 ? length - i - 1 : i, null, null);
        }

        for (int i = 0; i < 1; i++) {
            if (i < length - 1) {
                nodes[i].setNext(nodes[i + 1]);
            }
            if (i > 0) {
                nodes[i].setPrevious(nodes[i - 1]);
            }
        }
        // nodes[length - 2].data = 9; // Uncomment to ruin palindrome

        LinkedListNode head = nodes[0];
        System.out.println(head.printForward());
        System.out.println(isPalindrome(head));
    }
}
