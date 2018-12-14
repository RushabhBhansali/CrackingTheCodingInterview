package Q1_03_URLify;
import CtCILibrary.AssortedMethods;

public class Practice {
    public static void replaceSpaces(char[] str, int trueLength) {
        boolean ss = false;

//        int i = str.length-1;
//        while(true){
//            if( str[i] != ' '){
//                break;
//            }
//            i -= 1;
//        }

        int j = str.length-1;
        int i = trueLength-1;
        if(i == str.length-1 || i<0) return;
        while(i>=0){
            if(str[i] != ' '){
                str[j] = str[i];
                j -= 1;
            }
            else{
                str[j] = '0';
                str[j-1] = '2';
                str[j-2] = '%';
                j -= 3;
            }
            i -= 1;
        }

    }

    //part of testing main method from Question
    public static int findLastCharacter(char[] str) {
        for (int i = str.length - 1; i >= 0; i--) {
            if (str[i] != ' ') {
                return i;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        String str = " M P    ";
        char[] arr = str.toCharArray();
        int trueLength = findLastCharacter(arr) + 1;
        replaceSpaces(arr, trueLength);
        System.out.println("\"" + AssortedMethods.charArrayToString(arr) + "\"");
    }
}
