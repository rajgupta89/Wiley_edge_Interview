import java.util.Scanner;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Stack<Integer> li=new Stack<>();
        li.push(1);
        li.add(2); // we can wright push and add both to insert element in stack 
        li.pop();
        System.out.println(li);
    }
}
