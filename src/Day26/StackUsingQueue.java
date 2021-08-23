package Day26;

import java.util.LinkedList;
import java.util.Queue;

class Stack{
    int size;
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    Stack(){
        size = 0;
    }
    public void push(int data){
        q1.add(data);
        size++;
        // By making push costilier
//        if(q1.isEmpty()){
//            q1.add(data);
//        }
//        else{
//            while (!q1.isEmpty()){
//                q2.add(q1.remove());
//            }
//            q1.add(data);
//            while (!q2.isEmpty()){
//                q1.add(q2.remove());
//            }
//        }
       // size++;
        //by swapping
//        q2.add(data);
//        while (!q1.isEmpty()){
//            q2.add(q1.remove());
//        }
//        Queue temp = q1;
//        q1 = q2;
//        q2 = temp;

    }
    public  Integer pop(){
       if(q1.isEmpty()){
            return -1;
        }
       while (q1.size()!=1){
           q2.add(q1.remove());
       }
       int item = q1.remove();
        size--;
        while (!q2.isEmpty()){
            q1.add(q2.remove());
        }
       return item;
   }
    public Integer peek(){
        //for peek in pop costilier we have to do same opertaion as push to getpeek as peek last elemrnt
        if(q1.isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        return q1.peek();

    }
}
public class StackUsingQueue {
    public static void main(String[] args) {
        Stack st = new Stack();
//        st.push(1);
//        st.push(2);
     st.push(3);
       st.push(4);
//        st.push(5);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }

}
