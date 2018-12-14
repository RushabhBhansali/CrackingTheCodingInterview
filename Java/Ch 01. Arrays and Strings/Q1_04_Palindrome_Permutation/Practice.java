package Q1_04_Palindrome_Permutation;

import java.util.HashSet;

public class Practice {
    public static boolean isPermutationOfPalindrome(String phrase){
        if(phrase.length() <= 1) return true;
        int cc = 0;

        HashSet<Character> hs = new HashSet<>();

        for(int i=0; i<= phrase.length()-1; i++){
            if(!Character.isLetter(phrase.charAt(i))) continue;
            cc += 1;
            Character ch = Character.toLowerCase(phrase.charAt(i));
            if(hs.contains(ch)){
                hs.remove(ch);
            }
            else{
                hs.add(ch);
            }
        }

         return (hs.size() == 1 || hs.size() == 0);
//
//        if(cc%2 == 1){
//            return (hs.size() == 1);
//        }
//
//        else{
//            return (hs.size() == 0);
//        }

    }

    public static void main(String[] args) {
        String pali = "Rats live on no evil star";
        System.out.println(isPermutationOfPalindrome(pali));
    }

}
