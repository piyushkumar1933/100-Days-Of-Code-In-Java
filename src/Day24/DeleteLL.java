package Day24;

import Day23.LinkedList;
import Day23.Node;

public class DeleteLL {
    public static LinkedList<Integer> add(LinkedList<Integer> ls,int n, Integer data){
        Node head = ls.getHead();
        int count = 1;
        Node<Integer> ptr = new Node<>(data);
        if(n == 0){
            if(head == null){
                ls.setHead(ptr);
                return ls;
            }
            ptr.setNext(head);
            ls.setHead(ptr);
            return ls;
        }
        while (count<n && head.getNext()!=null){
            head = head.getNext();
            count++;
        }
        if(count == n) {
            ptr.setNext(head.getNext());
            head.setNext(ptr);
        }
        else
            System.out.println("Cant Insert");
        return ls;
    }
    public static LinkedList<Integer> delete(LinkedList ls, int n){
        Node head = ls.getHead();
        if(n<0){
            System.out.println("Can't delete Negative Pos");
            return ls;
        }
        if(n == 0){
            if(head == null)
                System.out.println("Underflow(No element to delete)");
            else
                ls.setHead(head.getNext());
        }
        else {
            int count = 1;
            while (count<n && head.getNext()!=null){
                count++;
                head = head.getNext();
            }
            if(head.getNext() == null){
                System.out.println("Cant Delete");
            }
            else
                head.setNext(head.getNext().getNext());
        }
        return ls;
    }
    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>();
        add(ls,0,10);
        add(ls,1,20);
        add(ls,1,30);
        add(ls,0,0);
        //add(ls,5,30);
        ls.display();
        delete(ls,0);
        ls.display();
        delete(ls,2);
        ls.display();
    }
}
