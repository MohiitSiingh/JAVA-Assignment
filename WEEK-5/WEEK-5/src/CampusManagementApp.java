public class CampusManagementApp {

    public void Campus() {

        // Creating campus registry object with size 10
        CampusRegistry registry = new CampusRegistry(10);

        // Creating first student object
        // The student has three CGPA values
        int[] studentCGPA = new int[]{3, 4, 5};
        Student student1 = new Student("Ramniwas", studentCGPA);

        // Creating researcher object
        Researcher researcher1 = new Researcher("Aditya", "AI");

        // Adding student into the campus registry
        registry.addPerson(student1);

        // Adding researcher into the campus registry
        registry.addPerson(researcher1);

        // Displaying all persons in the registry
        registry.Display();
    }

    private abstract class Person {

        private String name;

        public Person(String name) {

            // Assigning name to the person
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public class Student extends Person {

        private int[] CGPA;

        public Student(String name, int[] CGPA) {

            super(name);

            // Storing the CGPA values of student
            this.CGPA = CGPA;
        }

        public double calculateAverageCGPA() {

            int sum = 0;

            // Looping through the complete CGPA array
            for (int i = 0; i < CGPA.length; i++) {

                // Adding each CGPA value into sum
                sum = sum + CGPA[i];
            }

            double average;

            // Calculating average CGPA
            if (CGPA.length > 0) {
                average = (double) sum / CGPA.length;
            } else {
                average = 0;
            }

            return average;
        }
    }

    public class Researcher extends Person {

        private String researchArea;

        public Researcher(String name, String researchArea) {

            super(name);

            // Assigning research area to researcher
            this.researchArea = researchArea;
        }
    }

    public class CampusRegistry {

        private Person[] arr;
        private int count;

        public CampusRegistry(int size) {

            // Creating array for storing persons
            this.arr = new Person[size];

            // Initially there are no persons
            this.count = 0;
        }

        public void addPerson(Person p) {

            // Checking whether there is available space
            if (count < arr.length) {

                // Adding person at current count position
                arr[count] = p;

                // Increasing count by one after adding
                count = count + 1;
            }
            else {

                // Showing message if registry has no space
                System.out.println(
                    "Registry is full. Cannot add more persons."
                );
            }
        }

        public void Display() {

            // Looping from first person until current count
            for (int i = 0; i < count; i++) {

                // Displaying the person object
                // toString is not overridden so default output will occur
                System.out.println(arr[i]);
            }
        }
    }
}