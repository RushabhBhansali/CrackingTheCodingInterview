package Q1_02_Check_Permutation;

import java.util.HashMap;

public class Practice {

    //Solution 1 with O(n) runtime and O(n) memory
    public static boolean permutation(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        if(s1.length() == 0)return true;

        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i=0; i<=s1.length()-1; i++){
            Character ch = s1.charAt(i);
            if(!hm.containsKey(ch)){hm.put(ch,1); }
            else{ hm.put(ch,hm.get(ch)+1); }
        }

        for(int j =0; j<=s2.length()-1;j++){
            Character ch = s2.charAt(j);
            if(!hm.containsKey(ch)) {return false;}
            else{
                if(hm.get(ch) == 0) {return false;}
                hm.put( ch, hm.get(ch)-1);
            }
        }
        return true;
    }

    //solution 2:
        //1.convert both the string to charArray
        //2. sort both the arrays
        // 3. compare the arrays (if all elements of array compare
    //                                      --> true
    //                              else
    //                                    --> false

    public static void main(String[] args) {
        String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean anagram = permutation(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + anagram);
        }
    }


}
