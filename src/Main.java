public class Main {

    public static void main(String[] args) {
        // stacks
//        Stack stack = new Stack();
//        person per = new person();
//        stack.push(new person("swarathesh","13121a0507"));
//        stack.push(new person("helo","13121a0507"));
//        stack.PrintAll();
//        stack.pop();
//        stack.PrintAll();
//
//        //Queue
//        System.out.println("\n\nQUEUE\n\n");
//        Queue queue = new Queue();
//        queue.Enqueue(new person("swarathesh","13121a0507"));
//        queue.Enqueue(new person("helo","13121a0507"));
//        queue.PrintAll();
//        queue.Dequeue();
//        queue.PrintAll();
//
//        //Queue(LinedList)
//        System.out.println("\n\nQUEUELInkedList\n\n");
//        QueueLinkedList queueLinkedList = new QueueLinkedList();
//        queueLinkedList.Enqueue(12);
//        queueLinkedList.Enqueue(14);
//        queueLinkedList.Enqueue(1);
//        queueLinkedList.Enqueue(4);
//        int data = queueLinkedList.Dequeue();
//        data = queueLinkedList.Dequeue();
//         data = queueLinkedList.Dequeue();
//         data = queueLinkedList.Dequeue();
//        data = queueLinkedList.Dequeue();
//
//        System.out.println(data);


//        //StackLinkedlist
//        StackLinkedList stackLinkedList =  new StackLinkedList();
//        stackLinkedList.push(10);
//        stackLinkedList.push(110);
//        stackLinkedList.push(120);
//        stackLinkedList.push(103);
//        int data = stackLinkedList.pop();
//        System.out.println(data);

        LinkedList linkedList = new LinkedList();
        linkedList.PushAtBegining(12);
        linkedList.PushAtBegining(14);
        linkedList.PushAtBegining(15);
        linkedList.PushAtRear(16);
        linkedList.PushAtRear(14);
        linkedList.PushAtRear(13);
        linkedList.PushAtRear(17);
        linkedList.DeleteValue(17);
//        linkedList.PoPAtBegining();
//        linkedList.PopATRear();

        linkedList.print();




    }
}
