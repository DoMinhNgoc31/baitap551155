public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Nguyen Van A", "SV001", "a@example.com");
        Student s2 = new Student("Tran Thi B", "SV002", "b@example.com");
        Student s3 = new Student("Le Van C", "SV003", "c@example.com");

        Teacher t1 = new Teacher("Pham D", "GV001", "d@example.com", "PGS.TS");
        Teacher t2 = new Teacher("Hoang E", "GV002", "e@example.com", "ThS");
        Advisor a1 = new Advisor("Outside F", "f@company.com");

        KLTN<Student, Teacher> k1 = new KLTN<>("An ninh mang", s1, t1);
        KLTN<Student, Advisor> k2 = new KLTN<>("Xu ly anh", s2, a1);
        KLTN<Student, Teacher> k3 = new KLTN<>("Hoc may", s3, t2);

        ListSortable<KLTN<?, ?>> list = new ListSortable<>();
        list.add(k1);
        list.add(k2);
        list.add(k3);

        list.print();
    }
}