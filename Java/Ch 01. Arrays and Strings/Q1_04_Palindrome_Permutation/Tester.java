package Q1_04_Palindrome_Permutation;

public class Tester {

	
	public static void main(String[] args) {
		String[] strings = {"Rats live on no evil star",
							"A man, a plan, a canal, pan!ama",
							"Lleve",
							"Tacotac",
							"asda"};
		for (String s : strings) {
			boolean a = QuestionA.isPermutationOfPalindrome(s);
			boolean b = QuestionB.isPermutationOfPalindrome(s);
			boolean c = QuestionC.isPermutationOfPalindrome(s);
			boolean d = Practice.isPermutationOfPalindrome(s); // to check practice solution
			System.out.println(s);
			if (a == b && b == c && c==d) {
				System.out.println("Agree: " + a);
			} else {
				System.out.println("Disagree: " + a + ", " + b + ", " + c +", "+d); //edited to check practice solution
			}
			System.out.println();
		}

	}

}
