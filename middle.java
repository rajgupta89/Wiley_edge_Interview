import java.util.*;
class Node{  
int num;  
Node next;  
Node(int n){  
this.num = n;  
this.next = null;  
}  
}  
public class middle{  
public void findNode(Node n){  
if(n == null){  
return;  
}  
Node slow = n;  
Node fast = n;  
while(fast != null && fast.next != null){  
// fast pointer is taking two steps at a time  
fast = fast.next.next;  
// slow pointer is taking one step at a time  
slow = slow.next;  
}  
System.out.println("The middle node of the linked list is: " + slow.num);  
}  
// main method  
public static void main(String args[]){  
// head node of the linked list  
Node h = new Node(13);  
// remaining node of the linked list  
h.next = new Node(17);  
h.next.next = new Node(90);  
h.next.next.next = new Node(76);  
h.next.next.next.next = new Node(45);  
h.next.next.next.next.next = new Node(32);  
h.next.next.next.next.next.next = new Node(10);  
// creating an object of the class middle  
middle obj = new middle();  
// invoking the method findNode()  
obj.findNode(h);  
}  
}  