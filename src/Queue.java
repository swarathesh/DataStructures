public class Queue {
    private person[] queue;
    private int front,rear,total;

    public Queue() {
        queue = new person[50];
        this.front = 0;
        this.rear = 0;
        this.total = 0;
    }
    public void Enqueue(person item ){
        if(total!=50){
        queue[rear] = item ;
        rear++;
        total++;}
    }
    public void Dequeue(){
        front++;
        total--;
    }
    public void PrintAll(){
        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }
    }
}
