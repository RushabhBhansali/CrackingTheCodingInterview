package Q2_06_Palindrome;

import CtCILibrary.LinkedListNode;
import Q17_13_ReSpace.ParseResult;

public class Tester {
	
	public static void main(String[] args) {
		int max = 11;
		for (int length = 1; length < max; length++) {
			LinkedListNode[] nodes = new LinkedListNode[length];
			for (int i = 0; i < length; i++) {
				nodes[i] = new LinkedListNode(i >= length / 2 ? length - i - 1 : i, null, null);
			}
			
			for (int i = 0; i < length; i++) {
				if (i < length - 1) {
					nodes[i].setNext(nodes[i + 1]);
				}
				if (i > 0) {
					nodes[i].setPrevious(nodes[i - 1]);
				}
			}
			for (int i = -1; i < length; i++) {
				if (i >= 0) {
					nodes[i].data++; // Ruin palindrome
				}
				
				LinkedListNode head = nodes[0];
				System.out.println(head.printForward());
				boolean resultA = QuestionA.isPalindrome(head);
				boolean resultB = QuestionB.isPalindrome(head);
				boolean resultC = QuestionC.isPalindrome(head);
				boolean resultP = Practice.isPalindrome(head);
				System.out.println("A: " + resultA);
				System.out.println("B: " + resultB);
				System.out.println("C: " + resultC);
				System.out.println("P: " + resultP);
				if (resultA != resultB || resultB != resultC || resultC != resultP) {
					System.out.println("ERROR");
					length = max;
					//break;
				}
				else{
					//System.out.println("success");
				}
				if (i >= 0) {
					nodes[i].data--;
				}
			}
		}
	}

}
