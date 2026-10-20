public class LinkedList {
String name;
String rollno;
LinkedList next;
Node head;
LinkedList(int data)
{
    head = new Node();
    head.data = data;
    head.next = null;

}

LinkedList()
{
    head = null;
}
public void Insert(int data)

{
 if ( head == null)
 {
    head = new Node();
    head.next = null;
    head.data = data;
    return ;
 }
head.next = new Node();
head.next.data = data;

}
public void ReversePrint(Node head)
{
    if(head==null)
    {
        return;
    }
    ReversePrint(head.next);
    
        System.out.println(" " + head.data);
    
}

}
