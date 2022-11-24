public class U3{

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.toString();

        System.out.println("Size of stack is: " + stack.size());

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack.isEmpty());

        System.out.println("Top element of stack is: " + stack.peek());

    }

    
}
