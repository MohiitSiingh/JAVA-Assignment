public class TabHistory {
    node current;
    node head;

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
        
    }
}
