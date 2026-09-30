public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        LinkedList l1 = new LinkedList();
        l1.name = "Mohit Panwar";
        l1.rollno = "25csu356";
        l1.next = null;

        LinkedList l3 = new LinkedList();
        l3.name = "Rohit";
        l3.rollno = "25csu34";
        l3.next = null;

        l1.next = l3;

        LinkedList l2 = new LinkedList();
        l2.name = "Aman";
        l2.rollno = " 25csu022";
        l2.next = null;
        l3.next = l2;
        
        LinkedList temp = l1;
        while(temp != null)
        {
            System.out.println("Name  : " + temp.name +  " Roll number is : " + temp.rollno);

            temp = temp.next;
        }

    }
}
