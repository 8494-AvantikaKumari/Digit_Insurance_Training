import java.sql.SQLOutput;

class student1 {
    private int id;
    private String name;
    private int age;
    private String grade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public student1(int id, String name, int age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
        public void display_details(){

            System.out.println("Student's id: " + id);
            System.out.println("student's name: " + name);
            System.out.println("student's age: " + age);
            System.out.println("student's grade:" + grade);
            System.out.println();
        }

    }


    public class student {
        public static void main(String[] args) {
            student1 stu1 = new student1(2, "avantika", 22, "A");
            student1 stu2 = new student1(3, "aman", 21, "B");
            stu1.display_details();
            stu2.display_details();


        }
    }
