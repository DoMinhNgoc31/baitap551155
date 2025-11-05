public class Teacher {
    private final String fullName;
    private final String id;
    private final String email;
    private final String title;

    public Teacher(String fullName, String id, String email, String title) {
        this.fullName = fullName;
        this.id = id;
        this.email = email;
        this.title = title;
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

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "fullName='" + fullName + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}