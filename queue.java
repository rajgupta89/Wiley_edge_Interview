import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Queue<Integer> li=new LinkedList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        System.out.println(li);
        li.peek(); // this will not remove head element 
        li.poll();
        System.out.println(li);
        System.out.println(li.size());
        System.out.println(li.toString());
    }
}
