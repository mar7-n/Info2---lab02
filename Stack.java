public class Stack {
    private  int length;
    private ListNode top;

    public Stack() {
        length = 0;
        top = null;
    }

    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.setNext(top);
        top = temp;
        length++;
    }

    public int pop(){
        int result = top.getData();
        top = top.getNext();
        length--;
        return result;
    }
    public int peek(){
        return top.getData();
    }
    public boolean isEmpty() {
        return (length == 0);
    }
    public int size() {
        return length;
    }










}