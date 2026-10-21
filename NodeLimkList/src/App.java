public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        LinkList l = new LinkList(33,10);
        l.InsertAtFront(2);
        l.InsertAtFront(3);
        l.InsertAtFront(4);
        l.InsertAtFront(5);

        l.InsertAtEnd(99);

        l.InsertAtPos(3, 23456);
    }
}
