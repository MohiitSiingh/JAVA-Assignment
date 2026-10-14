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
        Head.next = Head;
    }
}
