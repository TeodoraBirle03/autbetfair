package courses.oop;

public class Student extends Person {
    private String studentID;
    private String subjectOfStudy;

    public Student(String name, String cnp, PersonSex sex, String studentID, String subjectOfStudy) {
        super(name, cnp, sex);
        this.studentID = studentID;
        this.subjectOfStudy = subjectOfStudy;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getSubjectOfStudy() {
        return subjectOfStudy;
    }

    public void setSubjectOfStudy(String subjectOfStudy) {
        this.subjectOfStudy = subjectOfStudy;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "studentID='" + studentID + '\'' +
                ", subjectOfStudy='" + subjectOfStudy + '\'' +
                '}';
    }
}
