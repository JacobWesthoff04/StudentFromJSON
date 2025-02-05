package org.example;

//Student class variables
public class Student {
    private int id;
    private String name;
    private int age;
    private String grade;

    //Creates new student object
    public Student(int id, String name, int age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }


    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGrade() { return grade; }
    public int getId() { return id; }

    //User friendly layout
    @Override
    public String toString() {
        return "Student:" + "\n" +
                "   id: " + id + "\n" +
                "   name: " + name + "\n" +
                "   age: " + age + "\n" +
                "   grade: " + grade + "\n";
    }
}
