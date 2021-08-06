package Day24;
import Day23.*;

import java.util.Scanner;

public class PalindromeLL {
    public static boolean checkPalindrome1(LinkedList ls){
        Node head = ls.getHead();
        Node  temp = ls.getHead();
        int count = ls.count();
        for(int i = 0; i<count;i++){
             temp = ls.getHead();
             for(int j = i+1;j<count;j++)
                 temp = temp.getNext();
             if(head.getData() != temp.getData())
                 return false;
             head = head.getNext();
        }
        return true;
    }
    static public boolean checkPalindrome2(LinkedList ls){
        LinkedList <Integer> ls1 = new LinkedList<>();
        Node<Integer> head = ls.getHead();
        while (head !=null){
            ls1.atStart(head.getData());
            head = head.getNext();

        }
        ls1.display();
        Node<Integer> temp = ls1.getHead();
        head = ls.getHead();
        while (head.getNext()!=null){
            if(temp.getData() != head.getData()){
                return false;
            }
            head = head.getNext();
            temp = temp.getNext();
        }
        return true;
    }
    public  static boolean isPalindrome(LinkedList ls){
        Node head = ls.getHead();
        if(head == null || head.getNext() == null){
            return true;
        }
        Node fast = head;
        Node slow = head;
        while (fast.getNext()!=null && fast.getNext().getNext()!=null){
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }
        Node secondhalf = reverse(slow.getNext());
        Node second = secondhalf;
        slow.setNext(null);
        Node first = head;
        while (first !=null){
            if(first.getData() != secondhalf.getData())
                return false;
            first = first.getNext();
            secondhalf = secondhalf.getNext();
        }
        secondhalf = reverse(second);
        Node firsthalf = head;
        while (firsthalf.getNext()!=null)
            firsthalf = firsthalf.getNext();
        firsthalf.setNext(secondhalf);
        ls.setHead(head);
        ls.display();

        return true;
    }
    public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node fwd = null;
        while (curr!=null){
            fwd = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = fwd;

        }
        return prev;
    }
    public static void main(String[] args) {
        LinkedList <Integer> ls = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x!=-1){
            ls.addLast(x);
            x = sc.nextInt();
        }
        System.out.println(checkPalindrome1(ls));
        System.out.println(checkPalindrome2(ls));
        System.out.println(isPalindrome(ls));

    }
}
