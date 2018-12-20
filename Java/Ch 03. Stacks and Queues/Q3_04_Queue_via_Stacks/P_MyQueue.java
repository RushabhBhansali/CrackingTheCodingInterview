package Q3_04_Queue_via_Stacks;
import java.util.Stack;



public class P_MyQueue<T> {
    private Stack<T> mainSt;
    private Stack<T> secSt;
    private int size;

    public P_MyQueue(){
        mainSt = new Stack<>();
        secSt = new Stack<>();
        size = 0;
    }

    public void add(T val){
        mainSt.push(val);
        size += 1;
    }

    public T remove(){
        if(this.size > 0){
            while(!mainSt.isEmpty()){
                secSt.push(mainSt.pop());
            }
            T data = secSt.pop();
            while(!secSt.isEmpty()){
                mainSt.push(secSt.pop());
            }
            size -= 1;
            return data;
        }

        else{
            try{
                throw new Exception();
            }
            catch(Exception e){
                System.out.print("empty Queue");
            }

        }
        return null;

    }
    public int size(){
        return this.size;
    }

    public T peek(){
        while(!mainSt.isEmpty()){
            secSt.push(mainSt.pop());
        }
        T data = secSt.peek();
        while(!secSt.isEmpty()){
            mainSt.push(secSt.pop());
        }
        return data;
    }


}
