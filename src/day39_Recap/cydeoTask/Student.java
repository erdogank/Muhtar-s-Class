package day39_Recap.cydeoTask;

public class Student extends Person{

    private int studentId;
    private String fieldOfStudy;

    public Student(String name, char gender, int age, int studentId, String fieldOfStudy) {
        super(name, gender, age);
      setStudentId(studentId);
      setFieldOfStudy(fieldOfStudy);

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        if(studentId<=0){
            System.out.println("invalid student Id");
            System.exit(1);
        }
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {

        if (fieldOfStudy==null){
            System.err.println("you should give a name");
            System.exit(1);
        }
        if(fieldOfStudy.isBlank()||fieldOfStudy.isEmpty()) {
            System.err.println("name can not be empty");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public void study(){
        System.out.println(getName()+ " is studying at the moment");
    }

    public String toString() {
        return "Student{" +
                "name=" + getName() +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", studentId=" + studentId +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
