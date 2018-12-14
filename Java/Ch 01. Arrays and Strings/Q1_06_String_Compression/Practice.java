package Q1_06_String_Compression;

public class Practice {

    public static String compress(String str) {
        if(str.length() <= 1) return str;
        StringBuilder sb = new StringBuilder();
        char[] ca = str.toCharArray();
        Character ch = ca[0];
        int count = 1;
        for(int i=1;i<=ca.length-1;i++){
            if(ca[i] == ch){
                count += 1;
            }
            else{
                sb.append(ch);
                sb.append(count);
                count = 1;
                ch = ca[i];
            }
            if(i == ca.length-1){
                sb.append(ch);
                sb.append(count);
            }
        }
        if(sb.length() >= str.length()) return str;
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabb";
        System.out.println(str);
        System.out.println(compress(str));
    }
}
