public class Stack {
    private person [] stack;
    private int size;
    private int top;

    public Stack(int size) {
        this.size = size;
        top=-1;
        stack =  new person[this.size];
    }

    public Stack() {
        size = 50;
        top =-1;
        stack =  new person[size];
    }
    public boolean push(person item){
        if (!Isfull()){
            top++;
            stack[top] = item;
            return true;
        }
        else return false;

    }
    private boolean IsEmpty() {
        return (top == -1) ;
    }

    private boolean Isfull() {
        return (top == stack.length-1);

    }

    public void PrintAll(){
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i]);
        }
    }

    public void pop() {
        top--;
    }
}
