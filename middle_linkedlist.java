import java.util.*;

public class middle_linkedlist {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        LinkedList<Integer> li=new LinkedList<>();
        li.push(5);
        li.push(6);
        li.push(7);
        li.push(8);
        li.add(2, 3);
        li.pollLast();       
        // System.out.println(li.get(li.size()/2));
        System.out.println(li);
    }
}
