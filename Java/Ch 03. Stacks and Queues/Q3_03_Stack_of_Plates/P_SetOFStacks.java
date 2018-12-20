package Q3_03_Stack_of_Plates;
import java.util.Stack;

public class P_SetOFStacks {
    private Stack<Stack<Integer>> set;
    private int cap;
    public P_SetOFStacks(int cap){
        set = new Stack<>();
        this.cap = cap;
    }

    public void push(int val){
        if(set.isEmpty() || set.peek().size() == cap){
            Stack<Integer> ns = new Stack();
            ns.push(val);
            set.push(ns);
        }
        else{
            set.peek().push(val);
        }
    }

    public int pop(){
        if(!set.isEmpty()){
            int data = set.peek().pop();
            if(set.peek().isEmpty()){
                set.pop();
            }
            return data;
        }
        return -1;
    }

    public int peek(){
        if(!set.isEmpty()){
            return set.peek().peek();
        }
        return -1;
    }


}
