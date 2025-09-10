package dp.builder;

public class Main {
    public static void main(String[] args) {
        Student student = new StudentBuilder()
                .rollNo(1)
                .age(21)
                .name("Prashant")
                .build();

        Student student1 = new StudentBuilder()
                .rollNo(1)
                .age(21)
                .name("ABC")
                .father("PQR")
                .mother("XYZ")
                .build();

        System.out.println(student1);

        System.out.println(student);
    }
}
