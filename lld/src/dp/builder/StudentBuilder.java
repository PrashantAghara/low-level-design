package dp.builder;

public class StudentBuilder {
    int rollNo;
    String name;
    String father;
    String mother;
    int age;

    public StudentBuilder rollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public StudentBuilder name(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder age(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder father(String father) {
        this.father = father;
        return this;
    }

    public StudentBuilder mother(String mother) {
        this.mother = mother;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
}
