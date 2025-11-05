public class Student {
    private final String fullName;
    private final String id;
    private final String email;

    public Student(String fullName, String id, String email) {
        this.fullName = fullName;
        this.id = id;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}