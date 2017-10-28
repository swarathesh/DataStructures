public class StackLinkedList {
    Node top;


    public void push(int data){
        Node node = new Node(data);
        node.next = top;
        top = node;
    }

    public int pop(){
        int data = top.data;
        try {
         if (top != null)  top = top.next;
        }catch (NullPointerException e){
            System.out.println("null pointer exception");
        }
       return data;
    }
}
