public class LinkList {
 
    private Node head ;
    int size;
    LinkList()
    {
        head = null;
        size = 0;
       
      

    }

     LinkList(int d, int s)
    {
        head = new Node();
        head.data = d;
        head.Next = null;
        head.prev = null;
        size = 1;
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
            
            Node newNode = new Node();
            newNode.Next = head;
            newNode.prev = null;
            newNode.data = d;
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
            InsertAtFront(d);
            return;
        }
        if(pos >= size)
        {
            InsertAtEnd(d);
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
        System.out.println();
        Node traversal = head.Next;
        while(traversal != null)
        {
            System.out.println(traversal.data);
            traversal = traversal.Next;
        }

        System.out.println(head.data);
        System.out.println(); 
    }
}
