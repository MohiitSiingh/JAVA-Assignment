import java.util.ArrayList;
import java.util.Scanner;;
public class StudentList {
    ArrayList<StudentInfo> students ;
    StudentList()
    {
         students = new ArrayList<>();
    }
    boolean isExist(int id )
    {
         for(int i = 0 ; i < students.size() ; i++)
        {
            if(students.get(i).id == id)
            {
                return true;
            }
        
        }
        System.out.println("Student does not exist");
        return false;
    }
    public void addStudent(int id , String name)
    {   isExist(id);
        StudentInfo s = new StudentInfo(id, name);
        students.add(s);
        System.out.println("Student Added Successfully");
    }

    public void deleteStudent(int id )
    {   isExist(id);
        for(int i = 0 ; i < students.size() ; i++)
        {
            if(students.get(i).id == id)
            {   
                System.out.println("deleted student id : " + students.get(i).id + " Name : " + students.get(i).name);
                students.remove(i);
                System.out.println("Student deleted suucessfully");
                return;
            }
            
                System.out.println("No valid student ");
                
        }
    }

    public void displayStudent(int id  )
    {   isExist(id);
        for(int i = 0 ; i < students.size() ; i++)
        {
            if(students.get(i).id == id)
            {
                System.out.println(students.get(i).id +" "+ students.get(i).name);
                return;
            }
                      
                System.out.println("No valid student ");
            
        }
    }

    public void displayAllStudent()
    {   
        for(int i = 0 ; i < students.size() ; i++)
        {
            System.out.println("id "+students.get(i).id + "   name is " + students.get(i).name);

        }
    }

        public void updateStudent(int id , String name)
        {   
            isExist(id);
            System.out.println("Update Student : " + id + name);
            Scanner input  =  new Scanner(System.in);
             String newName = input.nextLine();
            for(int i = 0 ; i < students.size() ; i++)
            {   String newName = input.nextLine();
                if(students.get(i).id == id)
                {   
                    
                    students.get(i).name = newName;
                }
            }
            
        }
}
