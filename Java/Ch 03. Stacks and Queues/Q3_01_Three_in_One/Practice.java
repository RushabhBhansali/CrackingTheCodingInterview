package Q3_01_Three_in_One;


import java.util.HashMap;

// using single array devided into three parts for three stacks
public class Practice {

    private int[] arr;
    private int ss;
    private static int noOfStack = 3;
    HashMap<Integer,Integer> pointers;
    Practice(int stackSize){
        this.ss = stackSize;
        this.arr = new int[Practice.noOfStack*stackSize];
        pointers = new HashMap();
        pointers.put(1,0);
        pointers.put(2,stackSize);
        pointers.put(3,2*stackSize);
    }

    public void push(int stackNo, int val){
        int p = pointers.get(stackNo);
        if(p >= stackNo*ss){
            System.out.println("Stack Full");
        }
        else{
           arr[p] = val;
           pointers.put(stackNo,pointers.get(stackNo)+1);
        }
    }

    public int pop(int stackNo){
        int p = pointers.get(stackNo);
        if(p == (stackNo-1)*this.ss){
            System.out.println("Stack empty");
            return -1;
        }
        else{
            int data = arr[p-1];
            pointers.put(stackNo,p-1);
            return data;
        }
    }

    public int peek(int stackNo){
        int p = pointers.get(stackNo);
        if(p == (stackNo-1)*this.ss){
            System.out.println("Stack empty");
            return -1;
        }
        else{
            return arr[p-1];
        }
    }
}
