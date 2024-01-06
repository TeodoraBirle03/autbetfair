package courses.oop;

public class Teacher extends Person {
    private String teacherID;
    private String discipline;

    public Teacher(String name, String cnp, PersonSex sex, String teacherID, String discipline) {
        super(name, cnp, sex);
        this.teacherID = teacherID;
        this.discipline = discipline;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                "teacherID='" + teacherID + '\'' +
                ", discipline='" + discipline + '\'' +
                '}';
    }
}
