package Q3_02_Stack_Min;

public class Main {

    public static void main(String[] args) {
        Practice_MinSttack stack = new Practice_MinSttack();
        StackWithMin2 stack2 = new StackWithMin2();
        int[] array = {2, 1, 3, 1};
        for (int value : array) {
            stack.push(value);
            stack2.push(value);
            System.out.print(value + ", ");
        }
        System.out.println('\n');
        for (int i = 0; i < array.length; i++) {
            System.out.println("Popped " + stack.pop() + ", " + stack2.pop());
            System.out.println("New min is " + stack.min() + ", " + stack2.min());
        }
    }

}
