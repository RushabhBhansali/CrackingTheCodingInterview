package Q3_05_Sort_Stack;

import CtCILibrary.AssortedMethods;

import java.util.Stack;

public class Practice {
    //Solution that sorts the stack one element at a time
    public void sortStack(Stack<Integer> st){
        Stack<Integer> ts = new Stack<>();

        while(!st.isEmpty()){
            int data = st.pop();
            if(st.isEmpty() || data<= st.peek()){
                ts.push(data);
            }
            else{
                ts.push(st.pop());
                st.push(data);
                while(!ts.isEmpty()){
                    st.push(ts.pop());
                    /*if(data<= st.peek() && data >= ts.peek() ){
                        st.push(data);
                    }*/
                }
            }
        }

        while(!ts.isEmpty()){
            st.push(ts.pop());
        }

    }

    /*public static void main(String[] arg){
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(5);
        st.push(1);
        st.push(8);
        st.push(9);
        st.push(-3);

        Practice obj = new Practice();
        obj.sortStack(st);

        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }*/

    public static void main(String [] args) {
        Stack<Integer> s = new Stack<Integer>();
        for (int i = 0; i < 10; i++) {
            int r = AssortedMethods.randomIntInRange(0,  1000);
            s.push(r);
        }

        Practice obj = new Practice();
        obj.sortStack(s);

        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
