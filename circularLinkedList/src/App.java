public class App {
    public static void main(String[] args) throws Exception {
        CLinkedList CLL = new CLinkedList();
        CLL.InsertBack(10);
        CLL.InsertBack(9);
        CLL.InsertBack(8);
        CLL.InsertBack(7);
        CLL.InsertBack(6);
        CLL.InsertBack(5);
        CLL.InsertBack(4);
        CLL.InsertBack(3);
        CLL.InsertBack(2);
        CLL.InsertBack(1);

        CLL.Print();

        CLL.DeleteBack();
        CLL.DeleteFront();

        CLL.Print();

    }
}
