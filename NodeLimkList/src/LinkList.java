public class LinkList {
 
    private Node head = null;
    int size;
    LinkList()
    {
        head = null;
        size = 0;
       
        head.data = 0;

    }
    LinkList(int d ,int s )
    {
        head.data = d;
        size = s;
    }


    public void InsertAtFront(int d){
        
        if ( head == null)        
        {
            head = new Node();
            head.data = d;
            head.Next = null;
        }
        else
        {
            
            Node temp1 = new Node();
            temp1 = head.prev;
            temp1.data = d;
        } 
    }
    public void InsertAtEnd(int d)
    {
        if ( head == null)
        {
            head = new Node();
            head.data = d;
            head.Next = null;
        }

        else{
            Node newNode = new Node();
            newNode.data = d;
            newNode.Next = null;

            Node temp = head;
            while(temp.Next != null)
            {
                temp = temp.Next;
            }
            temp.Next = newNode;
        }
    }

    public void InsertAtPos(int pos , int d)
    {
        if(size == 0)
        {
            InsertAtFront(1);
            return;
        }
        if(pos >= size)
        {
            InsertAtEnd(99);
            return;
        }
        Node n = new Node() ;

        Node t = head;
        for(int i = 0 ; i < pos-1 ; i++)
        {
            t = t.Next;

        }
        n.Next = t.Next;
        n.prev = t;
        t.Next = n;
        n.Next.prev = n;

    }

    void display()
    {
        
    }
}
