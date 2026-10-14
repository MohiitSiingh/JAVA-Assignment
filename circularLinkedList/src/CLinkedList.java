public class CLinkedList {
    Node tail;

    CLinkedList(int data)
    {
        tail = new Node();
        tail.data = data;
        tail.next = tail;

    }

    CLinkedList()
    {
        tail = null;
    }

    public void InsertFront(int data)
    {
        if(tail == null)
        {
            tail = new Node();
            tail.data = data;
            tail.next = tail;
            return;
        }

        Node Head = tail.next;
        tail.next = new Node();
        tail.next.data = data;
        tail.next.next = Head;

    }

    public void InsertBack(int data)
    {
        InsertFront(data);
        tail = tail.next;
    }

    public void  DeleteFront()
    {
        if(tail == null)
        {
            System.out.println("there is node to be delete");
            return;
        }
        if(tail.next == null)
        {
            tail = null;
            return;
        }
        Node Head = tail.next;
        tail.next = Head.next;
        Head.next = null;
    }

    public void DeleteBack()
    {
        if ( tail == null)
        {
            System.out.println("no node present to be deleted");
            return;
        }
        if(tail.next == null)
        {
            tail = null;
        }
        

    }
}
