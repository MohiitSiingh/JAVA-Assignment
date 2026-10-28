public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        StudentList list = new StudentList();
        list.addStudent(001 , "Mohit Panwar");
        list.addStudent(002 , "Aman Raghav");
        list.addStudent(003 , "Bharat Singh");
        list.addStudent(004, "Abhishek Upadhyay");

        list.displayStudent(001 );
        list.displayStudent(006);

        System.out.println("All Students Details");
        list.displayAllStudent();

        list.deleteStudent(002);

        list.updateStudent(001,"Mohit Panwar");
    }
}
