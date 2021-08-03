package Day23;

import Day16.Thr;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class AppendLast {
    public static void addLast(LinkedList ls, int n){
        Node head = ls.getHead();
        Node ptr = head;
        Node temp = head;
        n =  ls.count()-n;
        System.out.println(n);
        for (int i = 1; i<n;i++){
            ptr = ptr.next;
        }
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = head;
        head = ptr.next;
        ptr.next = null;
        ls.setHead(head);
        ls.display();

    }
    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x!=-1){
            ls.addLast(x);
            x = sc.nextInt();
        }
        ls.display();
        addLast(ls,5);

    }
}
