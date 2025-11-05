public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Nguyen Thi M", "IS103", "m@gmail.com");
        Student s2 = new Student("Do Van K", "IT403", "k@gmail.com");
        Student s3 = new Student("Tran Thi T", "CN176", "t@gmail.com");

        Teacher t1 = new Teacher("Pham Duc D", "GV601", "d@gmail.com", "PGS.TS");
        Teacher t2 = new Teacher("Do Van H", "GV053", "h@gmail.com", "ThS");
        Advisor a1 = new Advisor("Phan Thi P", "P@gmail.com");

        KLTN<Student, Teacher> k1 = new KLTN<>("Lap trinh huong doi tuong", s1, t1);
        KLTN<Student, Advisor> k2 = new KLTN<>("Tin hieu và he thong", s2, a1);
        KLTN<Student, Teacher> k3 = new KLTN<>("Xac suat thong ke", s3, t2);

        ListSortable<KLTN<?, ?>> list = new ListSortable<>();
        list.add(k1);
        list.add(k2);
        list.add(k3);

        list.print();
    }
}