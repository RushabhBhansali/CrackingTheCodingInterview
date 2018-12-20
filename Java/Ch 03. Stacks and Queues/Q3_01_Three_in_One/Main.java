package Q3_01_Three_in_One;
import Q3_01_Three_in_One.Practice;

public class Main {

    public static void main(String[] args){
        //System.out.println(Integer.toString())
        Practice ms = new Practice(3);
        ms.push(1,10);
        ms.push(1,11);
        System.out.println(Integer.toString(ms.pop(1)));
        System.out.println(Integer.toString(ms.pop(1)));
        ms.push(2,20);
        System.out.println(Integer.toString(ms.peek(2)));
        System.out.println(Integer.toString(ms.pop(2)));
        System.out.println(Integer.toString(ms.peek(2)));
        System.out.println(Integer.toString(ms.pop(2)));
    }

}
