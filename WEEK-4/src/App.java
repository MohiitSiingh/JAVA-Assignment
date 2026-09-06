public class App {

    public static void main(String[] args) {

        // =========================================================
        // TASK 1 - STUDENT RECORD
        // =========================================================

        System.out.println("========== TASK 1 - STUDENT RECORD ==========");

        Student student1 = new Student("Aman", "S101", 49);
        Student student2 = new Student("Riya", "S102", 50);
        Student student3 = new Student("Karan", "S103", 79);
        Student student4 = new Student("Neha", "S104", 80);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        System.out.println("Updating Student 1 mark to 75: "
                + student1.setMark(75));

        System.out.println(student1);

        System.out.println("Invalid mark update to 120: "
                + student2.setMark(120));

        System.out.println(student2);


        // // =========================================================
        // // TASK 2 - BANK ACCOUNT
        // // =========================================================

        // System.out.println("\n========== TASK 2 - BANK ACCOUNT ==========");

        // Account account1 = new Account("ACC101", "Aman");
        // Account account2 = new Account("ACC102", "Riya", 5000);

        // System.out.println(account1);
        // System.out.println(account2);

        // System.out.println("Deposit 1000: "
        //         + account1.deposit(1000));

        // System.out.println("Deposit 0: "
        //         + account1.deposit(0));

        // System.out.println("Deposit -500: "
        //         + account1.deposit(-500));

        // System.out.println("Withdraw 300: "
        //         + account1.withdraw(300));

        // System.out.println("Withdraw 5000: "
        //         + account1.withdraw(5000));

        // System.out.println(account1);
        // System.out.println(account2);


        // // =========================================================
        // // TASK 3 - RECTANGLE MODEL
        // // =========================================================

        // System.out.println("\n========== TASK 3 - RECTANGLE MODEL ==========");

        // System.out.println("Creating rectangle using no-argument constructor:");
        // Rectangle rectangle1 = new Rectangle();

        // System.out.println("\nCreating square:");
        // Rectangle rectangle2 = new Rectangle(5);

        // System.out.println("\nCreating rectangle:");
        // Rectangle rectangle3 = new Rectangle(4, 6);

        // System.out.println("\nObjects:");
        // System.out.println(rectangle1);
        // System.out.println(rectangle2);
        // System.out.println(rectangle3);

        // System.out.println("\nScaling rectangle3 by 2:");
        // rectangle3.scale(2);

        // System.out.println(rectangle3);


        // // =========================================================
        // // TASK 4 - BOOK LOAN
        // // =========================================================

        // System.out.println("\n========== TASK 4 - BOOK LOAN ==========");

        // Book book1 = new Book(
        //         "Java Programming",
        //         "James Gosling",
        //         "B101"
        // );

        // Book book2 = new Book(
        //         "Database Systems",
        //         "Raghu Ramakrishnan",
        //         "B102"
        // );

        // System.out.println(book1);
        // System.out.println(book2);

        // System.out.println("Borrow book1: "
        //         + book1.borrowBook());

        // System.out.println("Borrow book1 again: "
        //         + book1.borrowBook());

        // System.out.println("Return book1: "
        //         + book1.returnBook());

        // System.out.println("Return book1 again: "
        //         + book1.returnBook());

        // System.out.println(book1);
        // System.out.println(book2);


        // // =========================================================
        // // TASK 5 - PRODUCT INVENTORY
        // // =========================================================

        // System.out.println("\n========== TASK 5 - PRODUCT INVENTORY ==========");

        // Product product1 = new Product(
        //         "P101",
        //         "Laptop",
        //         55000
        // );

        // Product product2 = new Product(
        //         "P102",
        //         "Mouse",
        //         800,
        //         10
        // );

        // Product product3 = new Product(
        //         "P103",
        //         "Keyboard",
        //         1500,
        //         5
        // );

        // System.out.println(product1);
        // System.out.println(product2);
        // System.out.println(product3);

        // System.out.println("Restock Laptop: "
        //         + product1.restock(5));

        // System.out.println("Sell 2 Laptops: "
        //         + product1.sell(2));

        // System.out.println("Sell 10 Laptops: "
        //         + product1.sell(10));

        // System.out.println(product1);

        // System.out.println("Total products created: "
        //         + Product.getProductCount());


        // // =========================================================
        // // TASK 6 - COURSE ENROLLMENT
        // // =========================================================

        // System.out.println("\n========== TASK 6 - COURSE ENROLLMENT ==========");

        // Course course = new Course(
        //         "CS101",
        //         "Java Programming",
        //         3
        // );

        // System.out.println(course);

        // System.out.println("Enroll: " + course.enroll());
        // System.out.println(course);

        // System.out.println("Enroll: " + course.enroll());
        // System.out.println(course);

        // System.out.println("Enroll: " + course.enroll());
        // System.out.println(course);

        // System.out.println("Try over-enrollment: "
        //         + course.enroll());

        // System.out.println(course);

        // System.out.println("Withdraw: "
        //         + course.withdraw());

        // System.out.println(course);

        // System.out.println("Withdraw: "
        //         + course.withdraw());

        // System.out.println("Withdraw: "
        //         + course.withdraw());

        // System.out.println("Withdraw from empty course: "
        //         + course.withdraw());

        // System.out.println(course);


        // // =========================================================
        // // TASK 7 - OBJECT REFERENCE LAB
        // // =========================================================

        // System.out.println("\n========== TASK 7 - OBJECT REFERENCE LAB ==========");

        // ScoreBox box1 = new ScoreBox(50);

        // ScoreBox alias = box1;

        // ScoreBox box2 = new ScoreBox(50);

        // System.out.println("box1: " + box1);
        // System.out.println("alias: " + alias);
        // System.out.println("box2: " + box2);

        // System.out.println("box1 == alias: "
        //         + (box1 == alias));

        // System.out.println("box1 == box2: "
        //         + (box1 == box2));

        // System.out.println("\nAdding bonus through alias:");

        // ObjectReferenceLab.addBonus(alias, 10);

        // System.out.println("box1: " + box1);
        // System.out.println("alias: " + alias);

        // System.out.println("\nTesting local reassignment:");

        // ObjectReferenceLab.replaceLocally(box1);

        // System.out.println("box1 after replaceLocally(): "
        //         + box1);

        // System.out.println("\nCreating a new ScoreBox:");

        // ScoreBox box3 =
        //         ObjectReferenceLab.createScoreBox(100);

        // System.out.println("box3: " + box3);


        // // =========================================================
        // // TASK 8 - STRING FUNDAMENTALS
        // // =========================================================

        // System.out.println("\n========== TASK 8 - STRING FUNDAMENTALS ==========");

        // System.out.println(
        //         "hasText(null): "
        //                 + StringFundamentals.hasText(null)
        // );

        // System.out.println(
        //         "hasText(\"\"): "
        //                 + StringFundamentals.hasText("")
        // );

        // System.out.println(
        //         "hasText(\"   \"): "
        //                 + StringFundamentals.hasText("   ")
        // );

        // System.out.println(
        //         "hasText(\"Java\"): "
        //                 + StringFundamentals.hasText("Java")
        // );

        // System.out.println(
        //         "Normalized course code: "
        //                 + StringFundamentals.normalizeCourseCode(
        //                         "  cs101  "
        //                 )
        // );

        // System.out.println(
        //         "Occurrences of 'a': "
        //                 + StringFundamentals.countOccurrences(
        //                         "Java Programming",
        //                         'a'
        //                 )
        // );

        // System.out.println(
        //         "Length of last word: "
        //                 + StringFundamentals.lengthOfLastWord(
        //                         "Hello World   "
        //                 )
        // );

        // char[] characters = {'J', 'A', 'V', 'A'};

        // System.out.print("Before reverse: ");

        // for (char character : characters) {
        //     System.out.print(character);
        // }

        // System.out.println();

        // StringFundamentals.reverseString(characters);

        // System.out.print("After reverse: ");

        // for (char character : characters) {
        //     System.out.print(character);
        // }

        // System.out.println();


        // // =========================================================
        // // TASK 9 - STRINGBUILDER TOOLKIT
        // // =========================================================

        // System.out.println("\n========== TASK 9 - STRINGBUILDER TOOLKIT ==========");

        // System.out.println(
        //         "Reverse: "
        //                 + StringBuilderToolkit.reverse("Java")
        // );

        // System.out.println(
        //         "Repeat: "
        //                 + StringBuilderToolkit.repeat("Hi ", 3)
        // );

        // String[] words = {
        //         "Java",
        //         "Python",
        //         "C++"
        // };

        // System.out.println(
        //         "Joined words: "
        //                 + StringBuilderToolkit.joinWords(
        //                         words,
        //                         " | "
        //                 )
        // );

        // System.out.println(
        //         "Remove character: "
        //                 + StringBuilderToolkit.removeCharacterAt(
        //                         "Hello",
        //                         1
        //                 )
        // );

        // System.out.println(
        //         "Replace character: "
        //                 + StringBuilderToolkit.replaceCharacterAt(
        //                         "Hello",
        //                         1,
        //                         'a'
        //                 )
        // );

        // String[] items = {
        //         "Learn Java",
        //         "Learn DBMS",
        //         "Practice Coding"
        // };

        // System.out.println("\nNumbered List:");

        // System.out.println(
        //         StringBuilderToolkit.buildNumberedList(items)
        // );

        // // Demonstrating String immutability
        // String originalText = "Hello";

        // StringBuilder builder =
        //         new StringBuilder(originalText);

        // String convertedString = builder.toString();

        // builder.append(" World");

        // System.out.println("\nOriginal String: "
        //         + originalText);

        // System.out.println("Converted String: "
        //         + convertedString);

        // System.out.println("Builder after modification: "
        //         + builder);


        // // =========================================================
        // // TASK 10 - TEXT PROFILE
        // // =========================================================

        // System.out.println("\n========== TASK 10 - TEXT PROFILE ==========");

        // String[] profileArgs = {
        //         "Rohit",
        //         "20",
        //         "1.75"
        // };

        // Profile profile = TextProfile.createProfile(
        //         profileArgs[0],
        //         profileArgs[1],
        //         profileArgs[2]
        // );

        // System.out.println(profile);

        // System.out.println(
        //         "Converted values: "
        //                 + TextProfile.convertValues(
        //                         profile.getName(),
        //                         profile.getAge(),
        //                         profile.getHeightMetres()
        //                 )
        // );

        // System.out.println("\n========== ALL TASKS COMPLETED ==========");
    }
}