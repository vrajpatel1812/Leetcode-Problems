package LL;

//Last In first Out(LIFO)

public class Stack {

    public Node top;
    public int size;

    public Stack(){
        this.size = 0;
    }

    public void push(int value){
        Node node = new Node();
        
        if(node == null){
            System.out.println("Heap Overflow");
            return;
        }

        node.value = value;
        node.next = top;
        top = node;

        size++;
    }

    public void pop(){
        if(top == null){
            System.out.println("Stack underflow");
            return;
        }

        top = top.next;
    }

    public int getMin() {
        int min = top.value;
        Node temp = top;

        while(temp != null) {
            if(min > temp.value) {
                min = temp.value;
            }
            temp = temp.next;
        }

        return min;
    }

    public int top() {
        return top.value;
    }    

    public void display(){
        if (top == null) {
            System.out.printf("\nStack Underflow");
            return;
        }else {
            Node temp = top;
            while (temp != null) {
 
                System.out.print(temp.value);
 
                temp = temp.next;
                if(temp != null)
                    System.out.print(" -> ");
            }
        }
    }

    public class Node{
        private int value;
        private Node next;
        public Node(){}
        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Stack a = new Stack();
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        a.push(5);
        a.display();
        System.out.println();
        a.pop();
        a.pop();
        a.display();
    }
}
