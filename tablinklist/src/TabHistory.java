public class TabHistory {
    node current;


    public void visit(String url)
    {
        node newNode = new node(url);
        if(current == null)
        {
            current = newNode;
            return;
        }
        current.next = null;
        newNode.prev = current;
        current.next = newNode;

        current = newNode;

    }

    public void forward()
    {
        if(current!= null && current.next != null)
        {
            current.next = current;
        }
        else
        {
            System.out.println("No forward page");
        }
    }

    public void Back()
    {
        if(current!= null && current.prev != null)
        {
            current.prev = current;
        }
        else
        {
            System.out.println("No back page");
        }
    }

    
}
