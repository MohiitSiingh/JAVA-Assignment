class Course {
    private String courseCode;
    private String title;
    private int capacity;
    private int enrolled;

    public Course(String courseCode, String title, int capacity) {
        if (courseCode == null || courseCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Course code cannot be blank.");
        }

        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Course title cannot be blank.");
        }

        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive.");
        }

        this.courseCode = courseCode;
        this.title = title;
        this.capacity = capacity;
        this.enrolled = 0;
    }

    public boolean enroll() {
        if (isFull()) {
            return false;
        }

        enrolled++;
        return true;
    }

    public boolean withdraw() {
        if (enrolled == 0) {
            return false;
        }

        enrolled--;
        return true;
    }

    public boolean isFull() {
        return enrolled == capacity;
    }

    public int getAvailableSeats() {
        return capacity - enrolled;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getTitle() {
        return title;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getEnrolled() {
        return enrolled;
    }

    @Override
    public String toString() {
        return "Course{courseCode='" + courseCode +
                "', title='" + title +
                "', capacity=" + capacity +
                ", enrolled=" + enrolled +
                ", availableSeats=" + getAvailableSeats() +
                ", full=" + isFull() + "}";
    }
}

public class CourseEnrollment {
}