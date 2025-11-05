public class KLTN<T, V> implements Comparable<KLTN<?, ?>> {
    private final String thesisTitle;
    private final T student;
    private final V supervisor;

    public KLTN(String thesisTitle, T student, V supervisor) {
        this.thesisTitle = thesisTitle;
        this.student = student;
        this.supervisor = supervisor;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public T getStudent() {
        return student;
    }

    public V getSupervisor() {
        return supervisor;
    }

    @Override
    public int compareTo(KLTN<?, ?> other) {
        if (other == null) {
            return 1;
        }
        if (this.thesisTitle == null && other.thesisTitle == null) {
            return 0;
        }
        if (this.thesisTitle == null) {
            return -1;
        }
        if (other.thesisTitle == null) {
            return 1;
        }
        char a = Character.toUpperCase(this.thesisTitle.charAt(0));
        char b = Character.toUpperCase(other.thesisTitle.charAt(0));
        return Character.compare(a, b);
    }

    @Override
    public String toString() {
        return "KLTN{" +
                "title='" + thesisTitle + '\'' +
                ", student=" + student +
                ", supervisor=" + supervisor +
                '}';
    }
}