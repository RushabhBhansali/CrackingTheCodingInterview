package Q3_02_Stack_Min;

import java.util.Stack;

public class Practice_MinSttack {

        Stack<Integer> mainStack;
        Stack<Integer> minStack;

        public Practice_MinSttack(){
            mainStack = new Stack();
            minStack = new Stack();
        }

        public boolean push(int val){
            mainStack.push(val);
            if(minStack.isEmpty() || minStack.peek() >= val){
                minStack.push(val);
            }
            return true;
        }

        public int pop(){
            int val = mainStack.pop();
            if(val == minStack.peek()){
                minStack.pop();
            }
            return val;
        }

        public int peek(){
            return mainStack.peek();
        }

        public int min(){
            return minStack.peek();
        }

}
