public class LinkedList {
    Node head;

    public void PushAtRear(int data){
        Node current = head;
        Node node = new Node(data);
        if (head == null) head = new Node(data);
        while (current.next != null){
            current = current.next;
        }
        node.next =null;
        current.next = node;
    }

    public void PushAtBegining(int data){
        Node node = new Node(data);
        node.next = head;
        head  = node;
    }

    public void PoPAtBegining(){
        head = head.next;

    }

    public void PopATRear(){
        Node current = head, prev = null;
        while (current.next != null){
            prev=current;
            current = current.next;
        }
        prev.next = null;


    }

    public void DeleteValue(int dat){
        Node current = head , prev = null;
        if (head.data == dat){
            head = head.next;
        }
        while (current != null && current.data != dat){
            prev = current;
            current = current.next;
        }
        prev.next = current.next;

    }


    public void print() {
//      Node current = head;
//      String str= "" ;
//      while(current.next !=null) {
//          str += String.valueOf(current.data) + "\n";
//          current = current.next;
//      }
//      System.out.println(str+""+String.valueOf(current.data));
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }
}
