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

void ReversePrint(Node head)
{
    if(head==null)
    {
        return;
    }
    ReversePrint(head.next)
}

}
