public class LinkList {
 
    private Node head = null;

    public void InsertAtEnd(String n , int r)
    {
        if ( head == null)
        {
            head = new Node();
            head.name = n;
            head.rollno= r;
            head.Next = null;
        }

        else{
            Node newNode = new Node();
            newNode.name = n;
            newNode.rollno = r;
            newNode.Next = null;

            Node temp = head;
            while(temp.Next != null)
            {
                temp = temp.Next;
            }
            temp.Next = newNode;
        }
    }

    void display()
    {
        
    }
}
