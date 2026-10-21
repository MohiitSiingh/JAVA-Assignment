public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        LinkList l = new LinkList();
        l.InsertAtFront(2);
        l.InsertAtFront(3);
        l.InsertAtFront(4);
        l.InsertAtFront(5);

        l.InsertAtEnd(99);
        l.InsertAtEnd(9991);
        l.InsertAtEnd(99990);

        l.InsertAtPos(3, 23456);
         l.display();
    }
   
}
