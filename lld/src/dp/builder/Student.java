package dp.builder;

public class Student {
    int rollNo;
    String name;
    String father;
    String mother;
    int age;

    public Student(StudentBuilder builder) {
        this.rollNo = builder.rollNo;
        this.age = builder.age;
        this.father = builder.father;
        this.name = builder.name;
        this.mother = builder.mother;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", father='" + father + '\'' +
                ", mother='" + mother + '\'' +
                ", age=" + age +
                '}';
    }
}
