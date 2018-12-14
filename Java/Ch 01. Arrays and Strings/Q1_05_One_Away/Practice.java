package Q1_05_One_Away;

import java.util.HashMap;

public class Practice {
    public static boolean isReplace(String s1, String s2){
        char[] s1a = s1.toCharArray();
        char[] s2a = s2.toCharArray();
        int diff = 0;
        for(int i=0;i<=s1a.length-1;i++){
            if(s1a[i] != s2a[i]){
                diff += 1;
            }
            if(diff > 1) return false;
        }
        return diff==1;
    }

    public static boolean isPartOf(String small, String big){ // fizz //fizzz  fiz fiaz
        if(small.length() == 0) return true;

        char[] sma = small.toCharArray();
        char[] biga = big.toCharArray();

        int s = 0;
        int diff = 0;
        //int b = 0;
        for(int b = 0; b<=biga.length-1; b++){
            if(sma[s] == biga[b]){
                s += 1;
            }
            else{
                diff += 1;
            }
            if(diff > 1) return false;
            if(s > small.length()-1) {if(diff > 0){ diff+=1;} break;}
        }

        return (diff == 1);
    }


    public static boolean oneEditAway(String first, String second){
        if(first.length() == second.length()){
            //check for replace
            return isReplace(first,second);
        }
        int lengthdiff = first.length()-second.length();

        if(lengthdiff != 1 && lengthdiff != -1) return false;

        if(lengthdiff == 1){
            return isPartOf(second,first);
        }
        else{
            return isPartOf(first,second);
        }
    }

    public static void main(String[] args) {
        String a = "pghe";
        String b = "pale";
        boolean isOneEdit = oneEditAway(a, b);
        System.out.println(a + ", " + b + ": " + isOneEdit);
    }

}
