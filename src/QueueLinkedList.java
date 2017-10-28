public class QueueLinkedList {
    Node front,rear;

    public void Enqueue(int data){
        Node node = new Node(data);
        if ( (front==null) && (rear==null)){
            front = node;
        }
        if (rear!=null){
            rear.next = node;
        }
        rear = node;
    }

    public int Dequeue(){
        int data = front.data;
        try {
            front = front.next;
            if (front == null) {
                rear = null;
            }
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        return data;
    }
}
