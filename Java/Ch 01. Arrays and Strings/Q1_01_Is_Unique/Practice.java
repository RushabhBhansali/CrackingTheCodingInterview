package Q1_01_Is_Unique;

import java.util.Arrays;

public class Practice {
    //Solution 1:
    //using additional data structure
    public static boolean isUniqueChars(String str) {
        char[] ca = str.toCharArray();
        Arrays.sort(ca);

        for(int i=0;i<=ca.length-2; i++){
            if(ca[i] == ca[i+1]){
                return false;
            }
        }
        return true;
    }

    //SOlution 2: with using additional data structure
    public static boolean isUniqueChars_1(String str){
        boolean[] arr = new boolean[128];
        for(int i =0; i<=str.length()-1; i++){
            int charDt = str.charAt(i);
            if(arr[charDt]) return false;
            arr[charDt] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        for (String word : words) {
            System.out.println(word + ": " + isUniqueChars(word));
            System.out.println(word + ": " + isUniqueChars_1(word));
        }
    }


}
