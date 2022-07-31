/**
 * Created by User on 20.05.2022.
 */
public class ArrayStack {

    int[]arr;
    int size;

    ArrayStack (int capacity){
        this.arr = new int[capacity];
    }

    void push(int value){
      if(this.isFully()){
          System.err.println("Error stack is Fully! ");
          return;
      }
        this.arr[this.size++] = value;
    }
    int pop(){
        if(this.isEmpty()){
            System.err.println("Error stack is Empty! ");
            return -1;
        }
        return this.arr[--this.size];
    }
    int size(){
        return this.size;
    }
    boolean isEmpty(){
        return this.size == 0;
    }
    boolean isFully(){
        return this.size == this.arr.length;
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        int value = 10;
        while (stack.isFully()){
            stack.push(value--);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(stack.pop());
        }
    }
}
