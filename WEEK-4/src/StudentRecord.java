class Student {
    private String name;
    private String studentId;
    private int mark;

    Student(String name, String studentId, int mark) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid name");
        }

        if (studentId == null || studentId.isBlank()) {
            throw new IllegalArgumentException("Invalid student ID");
        }

        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Mark must be 0-100");
        }

        this.name = name;
        this.studentId = studentId;
        this.mark = mark;
    }

    String getName() {
        return name;
    }

    String getStudentId() {
        return studentId;
    }

    int getMark() {
        return mark;
    }

    boolean setMark(int newMark) {
        if (newMark < 0 || newMark > 100) {
            return false;
        }

        mark = newMark;
        return true;
    }

    boolean hasPassed() {
        return mark >= 50;
    }

    String getClassification() {
        if (mark >= 80)
            return "Distinction";
        else if (mark >= 70)
            return "First Class";
        else if (mark >= 50)
            return "Pass";
        else
            return "Fail";
    }

    @Override
    public String toString() {
        return name + " (" + studentId + ") - " +
                mark + " - " + getClassification();
    }
}